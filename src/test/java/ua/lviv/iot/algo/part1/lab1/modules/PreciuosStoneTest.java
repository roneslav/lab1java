package ua.lviv.iot.algo.part1.lab1.modules;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreciuosStoneTest {
    @Test
    public void testVariables() {
        int carat = 5;
        int clarity = 5;
        int pricePerCarat = 10;
        String color = "green";
        String shape = "circle";
        PreciuosStone preciuosStone = new PreciuosStone(carat, clarity, pricePerCarat, color, shape);
        assertEquals(carat, preciuosStone.getCarat());
        assertEquals(clarity, preciuosStone.getClarity());
        assertEquals(pricePerCarat, preciuosStone.getPricePerCarat());
        assertEquals(color, preciuosStone.getColor());
        assertEquals(shape, preciuosStone.getShape());
    }

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
        assertEquals(300, preciuosStone.getIncreasePrice(100, 200), 0);
    }

    @Test
    public void testGetFullPrice() {
        PreciuosStone preciuosStone = new PreciuosStone();
        assertEquals(0, preciuosStone.getFullPrice());
    }

    @Test
    public void testToCSV() {
        PreciuosStone preciuosStone = new PreciuosStone(100, 5, 35, "green", "circle");
        String expectedCSV = "null,null,null,100,5,35,green,circle\n";
        String actualCSV = preciuosStone.toCSV();
        assertEquals(expectedCSV, actualCSV);
    }

    @Test
    public void testGetHeaders() {
        PreciuosStone preciuosStone = new PreciuosStone(100, 5, 35, "green", "circle");
        String expectedHeaders = "name,color,shape,carat,clarity,pricePerCarat,color,shape\n";
        String actualHeaders = preciuosStone.getHeaders();
        assertEquals(expectedHeaders, actualHeaders);
    }
}