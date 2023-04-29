package ua.lviv.iot.algo.part1.lab1.manager;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.modules.Stone;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StoneManagerTest {
    @Test
    public void testFindStonesThatAreGreen(){
        StoneManager stoneManager = new StoneManager();
        List <Stone> stonesThatAreGreen = stoneManager.findStonesThatAreGreen("green");
        assertEquals(0, stonesThatAreGreen.size());
    }
    @Test
    public void testFindStonesThatAreCircles(){
        StoneManager stoneManager = new StoneManager();
        List <Stone> stonesThatAreCircles = stoneManager.findStonesThatAreCircles("circle");
        assertEquals(0, stonesThatAreCircles.size());
    }
}