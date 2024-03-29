package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JewelryStoneTest {
    @Test
    public void testGetFullPrice() {
        String expectedName = "gha";
        String expectedColor = "blue";
        String expectedShape = "circle";

        JewelryStone jewelryStone = new JewelryStone(expectedName, expectedColor, expectedShape);

        assertEquals(0, jewelryStone.getFullPrice());
        assertEquals(expectedName, jewelryStone.getName());
        assertEquals(expectedColor, jewelryStone.getColor());
        assertEquals(expectedShape, jewelryStone.getShape());
    }
    @Test
    public void testToCSV() {
        JewelryStone jewelryStone = new JewelryStone("Diamond", "red", "square");
        String expectedCSV = "null,null,null,Diamond,red,square\n";
        String actualCSV = jewelryStone.toCSV();
        assertEquals(expectedCSV, actualCSV);
    }
    @Test
    public void testGetHeaders() {
        JewelryStone jewelryStone = new JewelryStone("Diamond", "red", "square");
        String expectedHeaders = "name,color,shape,name,color,shape\n";
        String actualHeaders = jewelryStone.getHeaders();
        assertEquals(expectedHeaders, actualHeaders);
    }
}
