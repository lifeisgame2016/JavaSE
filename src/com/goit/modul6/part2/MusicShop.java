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
    }

    public HashMap<Instrument,Integer> countInstrument(){
        HashMap<Instrument, Integer> result = new HashMap<Instrument, Integer>();

        for (Instrument instrument : listInstruments){
            boolean isExist = false;
            for (Map.Entry<Instrument, Integer> pair : result.entrySet()){
                if (pair.getKey().equals(instrument)){
                    result.put(instrument,result.get(instrument)+1);
                    isExist = true;
                }
            }
            if (!isExist){
                result.put(instrument,1);
            }
        }
        return result;
    }


    public void printShop(HashMap<Instrument,Integer> map){
        for(Map.Entry<Instrument,Integer> pair : map.entrySet()){
            System.out.print( pair.getKey().getName() + " - " + pair.getValue() + ";\t");
        }
        System.out.println();
    }

    public List<Instrument> prepareInstruments (Map<Instrument, Integer> order) throws WrongInstrumentException {

        /*for (Map.Entry<Instrument, Integer> pair : order.entrySet()){
            switch (pair.getKey().getName()){
                case "guitar": null;
                    break;
                case "piano": null;
                    break;
                case "trumpet": null;
                    break;
                default: throw new WrongInstrumentException(pair.getKey().getName());
            }
        } */
        return null;
    }


}
