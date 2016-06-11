package com.goit.modul6.part2;

import java.util.*;


public class MusicShop {

    private List<Instrument> listInstruments;

    MusicShop(){
        this.listInstruments = new ArrayList<>();
    }

    public List<Instrument> getListInstruments() {
        return listInstruments;
    }

    public void importInstrument(int count){
        Random random = new Random();
        Instrument[] instruments = new Instrument[]{new Piano("piano"),
                new Guitar("guitar"), new Trumpet("trumpet")};

        for (int i = 0; i < count; i++){
            listInstruments.add(instruments[random.nextInt(instruments.length)]);
        }

        System.out.println(listInstruments.toString()+"\n");

    }

    public List<Instrument> prepareInstruments (Map<Instrument, Integer> oreder){
        return null;
    }


}
