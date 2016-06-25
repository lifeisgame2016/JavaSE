package com.goit.modul9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CipherCaesar {

    List<Character> alphabet = new ArrayList<Character>();
    private final static char[] PUNCTUATION = {',','.',';',':','!','?',' ','-','@'};

    public CipherCaesar(){
        for(char c = 'A'; c <= 'z'; c++){
            alphabet.add(c);
            if(c == 'Z'){
                c = 'a' - 1;
            }
        }
        for(char c = '0'; c <= '9'; c++){
            alphabet.add(c);
        }
        for(char c : PUNCTUATION){
            alphabet.add(c);
        }
    }

    public String encryption(String value, int key){
        int sizeAlph = alphabet.size();
        char[] valustChr = value.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c : valustChr){
            if (alphabet.indexOf(c) != -1) result.append(alphabet.get((alphabet.indexOf(c) + key) % sizeAlph));
            else result.append(c);
        }
        return result.toString();
    }

    public String decryption(String value, int key){
        int sizeAlph = alphabet.size();
        char[] valustChr = value.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char c : valustChr){
            if (alphabet.indexOf(c) != -1) result.append(alphabet.get((alphabet.indexOf(c) - key + sizeAlph) % sizeAlph));
            else result.append(c);
        }
        return result.toString();
    }





}
