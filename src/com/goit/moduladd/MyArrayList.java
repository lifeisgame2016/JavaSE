package com.goit.moduladd;

public class MyArrayList<E> {

    private static final int DEFAULT_SIZE = 4;

    private Object[] element;
    private int size;

    public MyArrayList(int sizeList){
        if(sizeList > 0){
            element = new Object[sizeList];
        } else if (sizeList == 0){
            element = new Object[DEFAULT_SIZE];
        } else {
            throw new IndexOutOfBoundsException();
        }
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
            Object[] tmpArray = (E[]) new Object[element.length*2];
            for(int i = 0; i < size; i++){
                tmpArray[i] = element[i];
            }
            element = tmpArray;
        }
        element[size++] = addElement;
        return true;
    }

    public E get(int index){
        if((index < 0) || (index > element.length)){
            throw new IndexOutOfBoundsException("index = " + index);
        } else {
            return (E) element[index];
        }
    }
}
