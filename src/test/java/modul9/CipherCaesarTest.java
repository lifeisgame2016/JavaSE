package modul9;

import com.goit.modul9.CipherCaesar;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CipherCaesarTest {

    private static CipherCaesar caesar;

    @BeforeClass
   public static void setUp() throws Exception{
        caesar = new CipherCaesar();
   }


    @Test(timeout = 1000)
    public void encryptionTest() throws Exception {
        String inputText = "Just do it!";
        String expectedText = "NywxBhsBmx@";
        String resultText = caesar.encryption(inputText,4);
        assertEquals(resultText,expectedText);
    }


    @Test(timeout = 1000)
    public void decryption() throws Exception {
        String inputText = "NywxBhsBmx@";
        String expectedText = "Just do it!";
        String resultText = caesar.decryption(inputText,4);
        assertEquals(resultText,expectedText);

    }

}