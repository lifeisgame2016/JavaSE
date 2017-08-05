package com.goit.lambdas.refactoring;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductItem {

    private String name;

    private double price;

    private String description;

    private LocalDate created;

    public ProductItem(String line) {
        String[] items = line.split(",");
        this.name = items[0];
        this.price = Double.parseDouble(items[1]);
        this.description = items[2];
        this.created = LocalDate.parse(items[3], DateTimeFormatter.ISO_DATE);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreated() {
        return created;
    }
}
