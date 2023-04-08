package ua.lviv.iot.algo.part1.lab1;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArtificialPreciousStoneTest {

    @Test
    public void testGetFullPrice() {
        ArtificialPreciousStone artificialPreciousStone = new ArtificialPreciousStone();
        artificialPreciousStone.setMassInGrams(5);
        artificialPreciousStone.setPricePerGram(10);
        Assertions.assertEquals(50, artificialPreciousStone.getFullPrice());
    }
}
