package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
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
}