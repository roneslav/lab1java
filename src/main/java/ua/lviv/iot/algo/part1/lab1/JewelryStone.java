package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@Getter
public class JewelryStone extends Stone {
    private String name;
    private String color;
    private String shape;
    @Override
    public int getFullPrice() {
        return 0;
    }
}