package modul5;

import com.goit.modul5.ArrayControl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Den on 03.07.2016.
 */
public class ArrayControlTest {
    public static ArrayControl arrayControl;
    public static int expectedMin;
    public static int expectedMax;


    @BeforeClass
    public static void setUp(){
        arrayControl = new ArrayControl(10);
        expectedMin = -5;
        expectedMax = 24;
        int[] newArray = {4,2,5, expectedMin,8,6,9, expectedMax,1,-2};
        arrayControl.setArray(newArray);
    }

    @Test(timeout = 1000)
    public void foundMin() throws Exception {
        int result = arrayControl.foundMin();
        Assert.assertEquals(expectedMin,result,0);
    }

    @Test(timeout = 1000)
    public void foundMax() throws Exception {
        int result = arrayControl.foundMax();
        Assert.assertEquals(expectedMax,result,0);

    }

    @Test(timeout = 1000)
    public void foundMinMax() throws Exception {
        arrayControl.foundMinMax();
        int resultMin = arrayControl.getMinValue();
        int resultMax = arrayControl.getMaxValue();

        Assert.assertEquals(expectedMin,resultMin,0);
        Assert.assertEquals(expectedMax,resultMax,0);
    }

    @Test(timeout = 1500)
    public void sortInsert() throws Exception {
        int[] arrSort = {expectedMin,-2,1,2,4,5,6,8,9, expectedMax};
        arrayControl.sortInsert();
        int[] resultArr = arrayControl.getArray();
        Assert.assertArrayEquals(arrSort,resultArr);

    }

}