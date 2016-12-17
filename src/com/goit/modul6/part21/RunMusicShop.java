package com.goit.modul6.part21;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RunMusicShop {
    public static void main(String[] args){
        MusicShop MusicShop = new MusicShop();
        List<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();
        for (int i = 0; i < 2; i++) {
            instruments.add(new Piano());
        }
        for (int i = 0; i < 16; i++) {
            instruments.add(new Guitar());
        }
        for (int i = 0; i < 7; i++) {
            instruments.add(new Trumpet());
        }
        MusicShop.setMusicalInstruments(instruments);
        System.out.println(countDifferentKindsOfMusicalInstrument(MusicShop.getMusicalInstruments()));

        Map<String, Integer> order1 = new TreeMap<String, Integer>();
        order1.put("guitar", 7);
        order1.put("trumpet", 2);

        try{
            MusicShop.prepareInstruments(order1);
        }catch (Exception e){
            System.out.println("Exception happened: " + e.getMessage());
        }
        System.out.println(countDifferentKindsOfMusicalInstrument(MusicShop.getMusicalInstruments()));

        Map<String, Integer> order2 = new TreeMap<String, Integer>();
        order2.put("piano", 1);

        try{
            MusicShop.prepareInstruments(order2);
        }catch (Exception e){
            System.out.println("Exception happened: " + e.getMessage());
        }
        System.out.println(countDifferentKindsOfMusicalInstrument(MusicShop.getMusicalInstruments()));

        Map<String, Integer> order3 = new TreeMap<String, Integer>();
        order3.put("piano", 1);
        order3.put("guitar", 8);
        order3.put("trumpet", 6);

        try {
            MusicShop.prepareInstruments(order3);
        }catch (Exception e){
            System.out.println("Exception happened: " + e.getMessage());
        }
        System.out.println(countDifferentKindsOfMusicalInstrument(MusicShop.getMusicalInstruments()));
    }

    private static String countDifferentKindsOfMusicalInstrument(List<MusicalInstrument> instruments){
        int pianos = 0;
        int guitars = 0;
        int trumpets = 0;
        for (MusicalInstrument x : instruments){
            if (x instanceof Piano) pianos++;
            if (x instanceof Guitar) guitars++;
            if (x instanceof Trumpet) trumpets++;
        }
        return String.format("Pianos - %d, Guitars - %d, Trumpets - %d", pianos, guitars, trumpets);
    }
}
