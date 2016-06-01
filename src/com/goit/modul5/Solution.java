package com.goit.modul5;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int[] array = {2,7,1,8,-3,0,5,8,10,-2};

        // show an array
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Found min and max
        foundMinMax(array);

        //Sort
        sortInsert(array);

        System.out.println("Sort array");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


    }

    //Method: Sort insert
    public static void sortInsert(int[] arr) {
        for(int j = 1; j<=arr.length-1; j++) {
            int key = arr[j];

            for(int i=j-1; i>=0 && arr[i]>key; i--) {
                arr[i+1] = arr[i];
                arr[i]=key;
            }
        }
    }

    public static void foundMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Min=" + min + " Max=" + max);
    }

}



