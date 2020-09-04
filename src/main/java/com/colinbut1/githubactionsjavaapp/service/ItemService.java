package com.colinbut1.githubactionsjavaapp.service;

import com.colinbut1.githubactionsjavaapp.model.Item;

import java.util.UUID;

public interface ItemService {
    void addItem(Item item);
    void updateItem(Item item);
    Item getItem(String name);
    void deleteItem(UUID id);
}
