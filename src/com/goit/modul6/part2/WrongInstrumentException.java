package com.goit.modul6.part2;


public class WrongInstrumentException extends Exception {

    public WrongInstrumentException(String message) {
        super(message);
        System.err.println("Musical instrument of this type is wrong: " + message);
    }
}
