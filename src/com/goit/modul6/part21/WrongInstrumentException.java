package com.goit.modul6.part21;


public class WrongInstrumentException extends RuntimeException{
    public WrongInstrumentException(){
        super("Wrong type instrument in order");
    }
}