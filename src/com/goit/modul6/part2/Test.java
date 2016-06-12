package com.goit.modul6.part2;

import java.util.HashMap;

public class Test {

    public static void main(String[] args){
        MusicShop musicShop = new MusicShop();

        musicShop.importInstrument(10);

        HashMap<Instrument, Integer> map = new HashMap<>();

        map = musicShop.countInstrument();

        musicShop.printShop(map);

        System.out.println(musicShop.getListInstruments());


    }
}
