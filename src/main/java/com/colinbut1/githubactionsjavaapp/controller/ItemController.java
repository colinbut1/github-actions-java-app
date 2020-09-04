package com.colinbut1.githubactionsjavaapp.controller;

import com.colinbut1.githubactionsjavaapp.model.Item;
import com.colinbut1.githubactionsjavaapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping()
    public void addItem(Item item){
        itemService.addItem(item);
    }

    @GetMapping("/{name}")
    public Item fetchItem(@PathVariable("name") String name) {
        return itemService.getItem(name);
    }
}
