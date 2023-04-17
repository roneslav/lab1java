package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class SemiPreciousStoneTest {
    @Test
    public void testGetFullPrice(){
        String expectedColor = "green";
        String expectedShape = "circle";
        SemiPreciousStone semiPreciousStone = new SemiPreciousStone(expectedColor, expectedShape);
        assertEquals(0, semiPreciousStone.getFullPrice());
        assertEquals(expectedShape, semiPreciousStone.getShape());
        assertEquals(expectedColor, semiPreciousStone.getColor());
    }
    @Test
    public void testToCSV() {
        SemiPreciousStone semiPreciousStone = new SemiPreciousStone("pink", "trapezium");
        String expectedCSV = "null,null,null,pink,trapezium\n";
        String actualCSV = semiPreciousStone.toCSV();
        assertEquals(expectedCSV, actualCSV);
    }
    @Test
    public void testGetHeaders() {
        SemiPreciousStone semiPreciousStone = new SemiPreciousStone("pink", "trapezium");
        String expectedHeaders = "name,color,shape,color,shape\n";
        String actualHeaders = semiPreciousStone.getHeaders();
        assertEquals(expectedHeaders, actualHeaders);
    }
}