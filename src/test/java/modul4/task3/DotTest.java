package modul4.task3;

import com.goit.modul4.task3.Dot;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DotTest {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public DotTest(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Parameterized.Parameters(name = "{index} : dot1 is {0},{1}  dot2 is {2},{3}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,0,1,1},{1,2,3,4},{2,2,4,4}
        });
    }


    @Test
    public void distance() throws Exception {
        Dot dot1 = new Dot(x1,y1);
        Dot dot2 = new Dot(x2,y2);

        double result = dot1.distance(dot2);
        double expectedValue = Math.sqrt(Math.pow((dot2.getX() - dot1.getX()), 2) + Math.pow((dot2.getY() - dot1.getY()), 2));
        Assert.assertEquals(expectedValue,result,0);
    }

}