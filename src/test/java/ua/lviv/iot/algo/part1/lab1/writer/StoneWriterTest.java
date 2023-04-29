package ua.lviv.iot.algo.part1.lab1.writer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.modules.PreciuosStone;
import ua.lviv.iot.algo.part1.lab1.modules.Stone;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneWriterTest {
    @AfterEach
    public void cleanUp() {
        new File("test.csv").delete();
    }
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
        }
        assertTrue(new File(fileName).exists());
        assertTrue(new File(fileName).length() > 0);
    }
    @Test
    public void testWriteToFileWithEmptyList() {
        String fileName = "test.csv";
        List<Stone> stones = new ArrayList<>();
        StoneWriter stoneWriter = new StoneWriter();

        stoneWriter.writeToFile(stones, fileName);
        assertTrue(new File(fileName).exists());
        assertTrue(new File(fileName).length() == 0);
    }

}