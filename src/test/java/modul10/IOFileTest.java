package modul10;

import com.goit.modul10.CipherCaesar;
import com.goit.modul10.IOFile;
import org.junit.*;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;


public class IOFileTest {

    static CipherCaesar cesar;
    static IOFile ioFile;
    static File inputFile;
    static File outputFile;

    @BeforeClass
    public static void setUpClass() throws Exception{
        cesar = new CipherCaesar();
        ioFile = new IOFile();
        inputFile = new File("testFile.txt");
        outputFile = new File("newFile.txt");
    }

    @org.junit.Test(timeout = 1000)
    public void writeFile() throws Exception {
        String text = "I can do it!";
        String expectedText = cesar.encryption(text,4);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
        bufferedWriter.write(expectedText);
        bufferedWriter.close();

        ioFile.writeFile(outputFile.getName(),text);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(outputFile));
        String result = bufferedReader.readLine();
        Assert.assertEquals(expectedText,result);
        bufferedReader.close();

    }


    @Test(timeout = 1000)
    public void readFileTest() throws Exception {
        String text = "MBgerBhsBmx@";
        String expectedText = cesar.decryption(text,4);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(inputFile));
        BufferedWriter buffered = new BufferedWriter(new FileWriter(outputFile));
        bufferedWriter.write(expectedText);
        buffered.write(text);
        bufferedWriter.close();
        buffered.close();

        ioFile.readFile(outputFile.getName());
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String result = bufferedReader.readLine();
        Assert.assertEquals(expectedText,result);
        bufferedReader.close();


    }

}