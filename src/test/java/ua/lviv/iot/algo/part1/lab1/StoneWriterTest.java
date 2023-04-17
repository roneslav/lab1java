package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoneWriterTest {
    @Test
    public void testWriteToFile() {
        String fileName = "test.csv";
        List<Stone> stones = new ArrayList<>();
        stones.add(new PreciuosStone(15, 4, 85, "pink", "circle"));
        stones.add(new PreciuosStone(20, 5, 70, "green", "trapezium"));
        stones.add(new PreciuosStone(30, 3, 100, "blue", "square"));

        StoneWriter stoneWriter = new StoneWriter();
        try {
            stoneWriter.writeToFile(stones, fileName);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected exception");
        }
        //Check that file was created
        assertTrue(new File(fileName).exists());

        //Check that file is not empty
        assertTrue(new File(fileName).length() > 0);

        //Clean up
        new File(fileName).delete();
    }
    @Test
    public void testWriteToFileWithEmptyList() {
        //Arrange
        String fileName = "test.csv";
        List<Stone> stones = new ArrayList<>();
        StoneWriter stoneWriter = new StoneWriter();

        //Act
        assertDoesNotThrow(() -> stoneWriter.writeToFile(stones, fileName));

        //Assert
        assertTrue(new File(fileName).exists());
        assertTrue(new File(fileName).length() == 0);

        //Clean up
        new File(fileName).delete();
    }
}