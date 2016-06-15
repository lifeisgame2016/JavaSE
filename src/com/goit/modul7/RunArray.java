package com.goit.modul7;

import java.util.Scanner;

public class RunArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int sizeArray;
        try {
            sizeArray = scanner.nextInt();
        } catch( Exception e){
            System.out.println(e.fillInStackTrace());
            System.out.println("Defaults array set 10 elements");
            sizeArray = 10;
        }

        ArrayControl array = new ArrayControl(sizeArray);

        System.out.println("Created array:");
        array.fillingArray();
        array.printArray();

        System.out.println("[Min value=" + array.foundMin() + " / max value=" + array.foundMax() + "]");

        System.out.println("Sorted array:");
        array.sortInsert();
        array.printArray();

        System.out.println("Rebuild array:");
        array.fillingArray();
        array.printArray();

        array.foundMinMax();
        System.out.println("[Min value=" + array.getMinValue() + " / max value=" + array.getMaxValue() + "]");


    }
}
