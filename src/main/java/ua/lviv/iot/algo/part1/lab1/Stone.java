package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class Stone {
    private String name;
    private String color;
    private String shape;

    public abstract int getFullPrice();

}