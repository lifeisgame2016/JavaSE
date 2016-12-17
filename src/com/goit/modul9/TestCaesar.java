package com.goit.modul9;


import java.util.Arrays;
import java.util.List;
public class TestCaesar {
    public static void main(String[] args) {
        CipherCaesar caesar = new CipherCaesar();
        List<File> list = Arrays.asList(
                new ImageFile("MyFile","jpg",4.2),
                new ImageFile("Car","jpg",5.0),
                new ImageFile("Work","img",4.6),
                new TextFile("Java","txt",10.3),
                new TextFile("Java Core","doc",13.23),
                new TextFile("History","txt",6.52),
                new TextFile("First Lesson","txt",6.52),
                new AudioFile("Dj Tiesto","mp3",5.12),
                new AudioFile("Mozart","mp3",5.25),
                new AudioFile("Mozart","mp3",6.36));

        list
                .stream()
                .forEach(file ->
                {file.setFileName(caesar.encryption(file.getFileName(),3));
                file.setType(caesar.encryption(file.getType(),3));}
                );
        PrintFile.printCollection(list);
        System.out.println("================================================");
        list
                .stream()
                .forEach(file ->
                        {file.setFileName(caesar.decryption(file.getFileName(),3));
                            file.setType(caesar.decryption(file.getType(), 3));}
                );
        PrintFile.printCollection(list);

    }
}
