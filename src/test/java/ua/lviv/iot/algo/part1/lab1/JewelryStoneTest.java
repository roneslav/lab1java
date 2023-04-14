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
}
