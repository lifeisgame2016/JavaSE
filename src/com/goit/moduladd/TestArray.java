package com.goit.moduladd;

public class TestArray {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();

        System.out.println("Array is empty: " + list.isEmpty());

        list.add("I");
        list.add(" going to ");
        list.add("be ");
        list.add("a best ");

        System.out.println(list.size());

        list.add("Java ");
        list.add("programmer!");

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }

    }

}
