package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class WebshopDefault {
    private List<ShopItem> items = new ArrayList<>();
    private List<ShopItem> sortedItems = new ArrayList<>();

    public WebshopDefault() {
        items.add(new ShopItem("Running shoes", "Nike running shoes", 1000.0, 5));
        items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        items.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        items.add(new ShopItem("T-shirt", "Blue with corgi on a bike", 300.0, 1));

        sortedItems.addAll(items);

    }

    @RequestMapping(value="/items")
    public String webshopItems(Model model) {
        model.addAttribute("items", items);
        return "webshopBasic";
    }

    @RequestMapping(value="/only-available")
    public String webshopOnlyAvailable(Model model) {
        List<ShopItem> available = items.stream()
                .filter(s -> s.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("items", available);
        return "webshopBasic";
    }

    @RequestMapping(value = "/cheapest-first")
    public String webshopCheapestFirst(Model model) {
        Collections.sort(sortedItems);
        model.addAttribute("items", sortedItems);

        return "webshopBasic";
    }

    @RequestMapping(value = "/contains-nike")
    public String webshopContainsNike(Model model) {
        List<ShopItem> containsNike = items.stream()
                .filter( s -> s.getName().toLowerCase().contains("nike") || s.getDescription().toLowerCase().contains("nike") )
                .collect(Collectors.toList());
        model.addAttribute("items", containsNike);
        return "webshopBasic";
    }

    @RequestMapping(value = "/average-stock")
    public String webshopAverageStock(Model model) {
        double average = items.stream()
                .map(s -> s.getQuantityOfStock())
                .mapToInt(number -> number)
                .summaryStatistics()
                .getAverage();
        model.addAttribute("items", average);
        return "webshopStockAverage";
    }

    @RequestMapping(value = "/most-expensive")
    public String webshopMostExpensive(Model model) {
        Collections.sort(sortedItems);
        model.addAttribute("items", sortedItems.get(sortedItems.size()-1));
        return "webshopBasic";
    }


}

