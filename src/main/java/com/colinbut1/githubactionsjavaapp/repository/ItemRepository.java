package com.colinbut1.githubactionsjavaapp.repository;

import com.colinbut1.githubactionsjavaapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
    Item findByName(String name);
}
