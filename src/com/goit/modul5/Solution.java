package com.goit.modul5;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length:");
        int sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];
        System.out.println("Enter " + sizeArray + " elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //Found min and max
        System.out.println("Min=" + foundMin(array) + " / Max=" + foundMax(array));

        //Sort
        sortInsert(array);

        System.out.println("Sort array");
        for (int element : array) {
            System.out.print(element + " ");
        }
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

    public static int foundMin(int[] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int foundMax(int[] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}



