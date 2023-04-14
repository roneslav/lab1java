package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@Getter
public class SemiPreciousStone extends Stone {
    private String color;
    private String shape;

    public int getFullPrice() {
        return 0;
    }
}
