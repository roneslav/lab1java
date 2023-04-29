package ua.lviv.iot.algo.part1.lab1.modules;

import lombok.Getter;

@Getter
public abstract class Stone {
    private String name;
    private String color;
    private String shape;

    public abstract int getFullPrice();

    public String toCSV() {
        return name + "," + color + "," + shape;
    }

    public String getHeaders() {
        return "name" + "," + "color" + "," + "shape";
    }
}