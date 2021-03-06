package modul4.task2;

import com.goit.modul4.task2.DegreeConverter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeConverterTest {
    public static DegreeConverter converter;

    @BeforeClass
    public static void setUp() throws Exception{
        converter = new DegreeConverter();
    }

    @Test(timeout = 1000)
    public void calsiusToFahrenheit() throws Exception {
        double celsius = 10;
        double expectedValue = (celsius * 1.8) + 32;
        double result = converter.calsiusToFahrenheit(celsius);
        Assert.assertEquals(expectedValue,result,0);
    }


    @Test
    public void fahrenheitToCelsius() throws Exception {
        double fahrenheit = 100;
        double expectedValue = (fahrenheit - 32) / 1.8;
        double result = converter.fahrenheitToCelsius(fahrenheit);
        Assert.assertEquals(expectedValue,result,0);

    }

}