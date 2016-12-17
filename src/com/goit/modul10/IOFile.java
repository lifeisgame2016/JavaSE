package com.goit.modul10;

import java.io.*;

public class IOFile {

    public void writeFile (String nameFile, String text){
        CipherCaesar caesar = new CipherCaesar();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile))){
            String encrText = caesar.encryption(text,4);
            writer.write(encrText);
            writer.close();
            System.out.println("The file has been written.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(String nameFile){
        CipherCaesar caesar = new CipherCaesar();
        try(BufferedReader reader = new BufferedReader(new FileReader(nameFile))){
            String text;
            while((text = reader.readLine()) != null){
                text = caesar.decryption(text,4);
                System.out.print(text);
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.print(e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
