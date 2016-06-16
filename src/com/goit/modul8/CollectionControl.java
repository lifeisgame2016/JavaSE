package com.goit.modul8;

import java.util.Collection;

@SuppressWarnings("ALL")
public class CollectionControl {
    public static void printCollection(Collection collection){
        System.out.printf("%-20s%-20s%-20s", "File name", "Type", "Size");
        System.out.println();
        System.out.println("--------------------------------------------------");

        collection.stream().forEach(value -> System.out.println(value.toString()));
    }
}
