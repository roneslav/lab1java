package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@Getter
public class ArtificialPreciousStone extends Stone {
    private String nameOfLaboratory;
    private int massInGrams;
    private int pricePerGram;
    private String color;
    private String shape;
    public int getFullPrice() {
        int fullPrice = massInGrams * pricePerGram;
        return fullPrice;
    }
}