package com.goit.modul9;

import java.util.Collection;

/**
 * Created by Den on 25.06.2016.
 */
public class PrintFile {
    public static void printCollection(Collection collection){
        System.out.printf("%-20s%-20s%-20s", "File name", "Type", "Size");
        System.out.println();
        System.out.println("---------------------------------------------");

        collection.stream().forEach(value -> System.out.println(value.toString()));
    }

}
