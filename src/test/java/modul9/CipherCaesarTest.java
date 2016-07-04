package modul9;

import com.goit.modul9.CipherCaesar;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class CipherCaesarTest {

    private static CipherCaesar caesar;

    @BeforeClass
   public static void setUp() throws Exception{
        caesar = new CipherCaesar();
   }


    @Test(timeout = 1000)
    public void encryptionTest() throws Exception {
        String inputText = "Just do it!";
        String outputText = "NywxBhsBmx@";
        Assert.assertEquals(caesar.encryption(inputText,4),outputText);
    }


    @Test(timeout = 1000)
    public void decryption() throws Exception {
        String inputText = "NywxBhsBmx@";
        String outputText = "Just do it!";
        Assert.assertEquals(caesar.decryption(inputText,4),outputText);

    }

}