package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JewelryStone extends Stone {
    private String name;
    private String color;
    private String shape;
    @Override
    public int getFullPrice() {
        return 0;
    }
    public String toCSV(){
        return super.toCSV() + "," + name + "," + color + "," + shape + "\n";
    }
    public String getHeaders() {
        return super.getHeaders() + "," + "name" + "," + "color" + "," + "shape" + "\n";
    }
}