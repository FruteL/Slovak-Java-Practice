package test.java;

import main.java.com.company.Figures.Triangle;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(triangle.getPerimeter(), 3+4+5, 1);
    }

    @Test
    public void getHeight() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getHeight(), 2.598,0.01);
    }

    @Test
    public void getArea() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getArea(), 3.897,0.01);
    }

    @Test
    public void inscribedRadius() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.inscribedRadius(), 0.87,0.01);
    }

    @Test
    public void getCorner() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assert.assertEquals(triangle.getCorner(), 60,1);
    }
}