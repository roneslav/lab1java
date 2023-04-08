package ua.lviv.iot.algo.part1.lab1;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JewelryStoneTest {
    @Test
    public void testGetFullPrice() {
        JewelryStone jewelryStone = new JewelryStone();
        Assertions.assertEquals(0, jewelryStone.getFullPrice());
    }
}
