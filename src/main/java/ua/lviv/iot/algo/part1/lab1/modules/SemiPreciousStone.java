package ua.lviv.iot.algo.part1.lab1.modules;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SemiPreciousStone extends Stone {
    private String color;
    private String shape;

    public int getFullPrice() {
        return 0;
    }

    public String toCSV() {
        return super.toCSV() + "," + color + "," + shape + "\n";
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "color" + "," + "shape" + "\n";
    }
}
