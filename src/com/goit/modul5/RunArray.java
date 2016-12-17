package com.goit.modul5;

import java.util.Scanner;

public class RunArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int sizeArray = scanner.nextInt();

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
