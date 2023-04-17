package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Stone {
    private String name;
    private String color;
    private String shape;
    public abstract int getFullPrice();
    public String toCSV(){
        return name + "," + color + "," + shape;
    }
    public String getHeaders() {
        return "name" + "," + "color" + "," + "shape";
    }
}