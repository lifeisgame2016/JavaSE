package com.goit.modul6.part2;


public abstract class Instrument {
    private String name;

    public String getName() {
        return name;
    }

    public Instrument(String name){
        this.name = name;
    }
}
