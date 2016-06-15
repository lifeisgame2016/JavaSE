package com.goit.modul8;

/**
 * Created by Den on 29.05.2016.
 */
public class File {
    private String name;
    private String type;
    private double size;

    File(String name, String type, double size){
        this.name = name;
        this.type = type;
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("%-20s%-10s%-10.2f", this.name, this.type, this.size);
    }

}
