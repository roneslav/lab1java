package ua.lviv.iot.algo.part1.lab1;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoneTest {
    @Test
    public void testGetFullPrice(){
        Stone stone = new PreciuosStone(5, 100, 35, "green", "circle");
        assertEquals(3500, stone.getFullPrice());
    }

}