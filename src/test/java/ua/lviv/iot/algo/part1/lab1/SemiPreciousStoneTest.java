package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SemiPreciousStoneTest {
    @Test
    public void testGetFullPrice(){
        SemiPreciousStone semiPreciousStone = new SemiPreciousStone();
        assertEquals(0, semiPreciousStone.getFullPrice());
    }

}