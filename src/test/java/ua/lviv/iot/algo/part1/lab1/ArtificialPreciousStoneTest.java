package ua.lviv.iot.algo.part1.lab1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ArtificialPreciousStoneTest {
    @Test
    public void testGetFullPrice() {
        String expectedNameOfLaboratory = "Biolab";
        int expectedMassInGrams = 5;
        int expectedPricePerGram = 10;
        String expectedColor = "green";
        String expectedShape = "circle";

        ArtificialPreciousStone artificialPreciousStone = new ArtificialPreciousStone
                (expectedNameOfLaboratory, expectedMassInGrams, expectedPricePerGram, expectedColor, expectedShape);

        assertEquals(50, artificialPreciousStone.getFullPrice());
        assertEquals(expectedMassInGrams, artificialPreciousStone.getMassInGrams());
        assertEquals(expectedNameOfLaboratory, artificialPreciousStone.getNameOfLaboratory());
        assertEquals(expectedColor, artificialPreciousStone.getColor());
        assertEquals(expectedShape, artificialPreciousStone.getShape());
        assertEquals(expectedPricePerGram, artificialPreciousStone.getPricePerGram());
    }
    @Test
    public void testToCSV() {
        ArtificialPreciousStone artificialPreciousStone = new ArtificialPreciousStone("BioLab", 5, 10, "green", "circle");
        String expectedCSV = "null,null,null,BioLab,5,10,green,circle\n";
        String actualCSV = artificialPreciousStone.toCSV();
        assertEquals(expectedCSV, actualCSV);
    }
    @Test
    public void testGetHeaders() {
        ArtificialPreciousStone artificialPreciousStone = new ArtificialPreciousStone("BioLab", 5, 10, "green", "circle");
        String expectedHeaders = "name,color,shape,nameOfLaboratory,massInGrams,pricePerGram,color,shape\n";
        String actualHeaders = artificialPreciousStone.getHeaders();
        assertEquals(expectedHeaders, actualHeaders);
    }
}
