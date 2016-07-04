package modul4.task1;

import com.goit.modul4.task1.*;
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureTest {

    public static Figure figure;


    @Test
    public void getAreaCircleTest() throws Exception {
        figure = new Circle(4);
        final double result = figure.getArea();
        double r = 4;
        Assert.assertEquals(Math.PI*r*r,result,0);

    }

    @Test
    public void getAreaRectangleTest() throws Exception{
        figure = new Rectangle(2,3);
        final double result = figure.getArea();
        double a = 2;
        double b = 3;
        Assert.assertEquals(a*b,result,0);
    }

    @Test
    public void getAreaTrangleTest() throws Exception{
        figure = new Triangle(4,5);
        final double result = figure.getArea();
        double a = 4;
        double b = 5;
        Assert.assertEquals(0.5*a*b,result,0);
    }

}