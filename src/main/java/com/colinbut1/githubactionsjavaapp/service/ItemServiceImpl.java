package com.colinbut1.githubactionsjavaapp.service;

import com.colinbut1.githubactionsjavaapp.model.Item;
import com.colinbut1.githubactionsjavaapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item getItem(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}
