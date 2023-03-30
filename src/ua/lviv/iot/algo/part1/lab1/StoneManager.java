package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString(callSuper = true)
public class StoneManager {
    private List<Stone> stones = new ArrayList<>();

    public void addStone(Stone stone) {
        this.stones.add(stone);
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

    public static void main(String[] args) {
        StoneManager stoneManager = new StoneManager();
        stoneManager.addStone(new PreciousStone(100, 5, 35, "green", "circle"));
        stoneManager.addStone(new PreciousStone(55, 4, 25, "blue", "square"));
        stoneManager.addStone(new ArtificialPreciousStone("BioLab", 5, 25, "grey", "circle"));
        stoneManager.addStone(new ArtificialPreciousStone("OpenLab", 10, 55, "green", "triangle"));
        stoneManager.addStone(new JewelryStone("Diamond", "red", "square"));
        stoneManager.addStone(new JewelryStone("Smaragd", "green", "circle"));
        stoneManager.addStone(new SemiPreciousStone("pink", "trapezium"));
        stoneManager.addStone(new SemiPreciousStone("white", "cone"));

        for (var stone : stoneManager.stones) {
            System.out.println(stone);
            System.out.println("Full price of the stone:" + stone.getFullPrice());
        }
        System.out.println("\n");
        var stonesThatAreGreen = stoneManager.findStonesThatAreGreen("green");
        System.out.println("Green stones are: ");
        for (Stone stone : stonesThatAreGreen) {
            System.out.println(stone);
        }
        System.out.println("\n");
        var stonesThatAreCircles = stoneManager.findStonesThatAreCircles("circle");
        System.out.println("Circle stones are: ");
        for (Stone stone : stonesThatAreCircles) {
            System.out.println(stone);
        }
    }
}
