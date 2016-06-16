package com.goit.modul8;

public class File {
    private String fileName;
    private String type;
    private double size;

    public File(String fileName, String type, double size){
        this.fileName = fileName;
        this.type = type;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        return String.format("%-20s%-20s%-20.2f", this.fileName, this.type, this.size);
    }


}
