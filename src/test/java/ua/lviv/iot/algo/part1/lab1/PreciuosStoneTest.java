package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PreciuosStoneTest {
    @Test
    public void testTotalPrice() {
        PreciuosStone preciuosStone = new PreciuosStone();
        assertEquals(500, preciuosStone.getTotalPrice(100, 5));
    }
    @Test
    public void testIncreaseClarity() {
        PreciuosStone preciuosStone = new PreciuosStone();
        assertEquals(5, preciuosStone.getIncreaseClarity(4));
    }
    @Test
    public void testGetIncreasePrice() {
        PreciuosStone preciuosStone = new PreciuosStone();
        assertEquals(300, preciuosStone.getIncreasePrice(100, 200));
    }
    @Test
    public void testGetFullPrice(){
        PreciuosStone preciuosStone = new PreciuosStone();
        assertEquals(0, preciuosStone.getFullPrice());
    }
}