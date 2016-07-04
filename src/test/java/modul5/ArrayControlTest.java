package modul5;

import com.goit.modul5.ArrayControl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Den on 03.07.2016.
 */
public class ArrayControlTest {
    public static ArrayControl arrayControl;
    public static int min;
    public static int max;


    @BeforeClass
    public static void setUp(){
        arrayControl = new ArrayControl(10);
        min = -5;
        max = 24;
        int[] newArray = {4,2,5,min,8,6,9,max,1,-2};
        arrayControl.setArray(newArray);
    }

    @Test(timeout = 1000)
    public void foundMin() throws Exception {
        int result = arrayControl.foundMin();
        Assert.assertEquals(min,result,0);
    }

    @Test(timeout = 1000)
    public void foundMax() throws Exception {
        int result = arrayControl.foundMax();
        Assert.assertEquals(max,result,0);

    }

    @Test(timeout = 1000)
    public void foundMinMax() throws Exception {
        arrayControl.foundMinMax();
        int resultMin = arrayControl.getMinValue();
        int resultMax = arrayControl.getMaxValue();

        Assert.assertEquals(min,resultMin,0);
        Assert.assertEquals(max,resultMax,0);
    }

    @Test(timeout = 1500)
    public void sortInsert() throws Exception {
        int[] arrSort = {min,-2,1,2,4,5,6,8,9,max};
        arrayControl.sortInsert();
        int[] resultArr = arrayControl.getArray();
        Assert.assertArrayEquals(arrSort,resultArr);

    }

}