package com.goit.modul10;


public class Test {
    public static void main(String[] args) {
        IOFile file = new IOFile();
        String fileName = "NewFile.txt";
        StringBuilder text = new StringBuilder("Aphorism: ");
        text.append("Success doesn't come to you…you go to it.");

        file.writeFile(fileName,text.toString());
        file.readFile(fileName);
    }
}
