package com.goit.moduladd;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int DEFAULT_SIZE = 4;

    private Object[] element;
    private int size;

    public MyArrayList(int sizeList){
            element = new Object[sizeList];
    }

    public MyArrayList(){
        element = new Object[DEFAULT_SIZE];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean add(E addElement){
        if(element.length == size){
           rebuildingArray(size*2);
        }
        element[size++] = addElement;
        return true;
    }

    public E get(int index){
        if((index < 0) || (index > size-1)){
            throw new IndexOutOfBoundsException("index = " + index);
        } else {
            return (E) element[index];
        }
    }

    private void rebuildingArray(int newSize){
        element = Arrays.copyOf(element,newSize);
    }
}
