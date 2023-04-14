package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter


public class StoneManager {
    private List<Stone> stones = new ArrayList<>();

    public List<Stone> addStone(Stone stone) {
        this.stones.add(stone);
        return null;
    }

    public List<Stone> findStonesThatAreGreen(String color) {
        return stones.stream().
                filter(stone -> stone.getColor() == color).
                collect(Collectors.toList());
    }

    public List<Stone> findStonesThatAreCircles(String shape) {
        return stones.stream().
                filter(stone -> stone.getShape() == shape).
                collect(Collectors.toList());
    }


}
