package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PreciousStone extends Stone {
    private int carat;
    private int clarity;
    private int pricePerCarat;
    private String color;
    private String shape;
    private static PreciousStone defaultPreciousStone = new PreciousStone();

    public static PreciousStone getInstance() {
        return defaultPreciousStone;
    }

    PreciousStone(String color, int clarity) {
        this.setColor(color);
        this.clarity = clarity;
    }

    PreciousStone(String name) {
        this.setName(name);
    }

    public int getTotalPrice(int pricePerCarat, int carat) {
        this.pricePerCarat = pricePerCarat;
        this.carat = carat;
        return (pricePerCarat * carat);
    }

    public int increaseClarity(int clarity) {
        this.clarity = clarity;
        return (clarity + 1);
    }

    public void increasePrice(double percentage) {
        pricePerCarat *= (1 + percentage / 100);
    }

    public int getFullPrice() {
        int fullPrice = carat * pricePerCarat;
        return fullPrice;
    }

}




