package com.goit.modul8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class CollectionControl {

    public static void printCollection(Collection collection){
        System.out.printf("%-20s%-20s%-20s", "File name", "Type", "Size");
        System.out.println();
        System.out.println("---------------------------------------------");

        collection.stream().forEach(value -> System.out.println(value.toString()));
    }

    public static List<File> sortCollection(Collection collection){
        List<File> newList = new ArrayList<>();

        Comparator<File> fileName = (e1,e2) ->
                e1.getFileName().compareTo(e2.getFileName());
        Comparator<File> type = (e1,e2) ->
                e1.getType().compareTo(e2.getType());

        collection
                .stream()
                .sorted(fileName.thenComparing(type))
                .forEach(e -> newList.add((File) e));
        return newList;

    }
}
