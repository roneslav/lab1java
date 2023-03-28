package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PreciousStone {
    private String name;
    private int carat;
    private String color;
    private int clarity;
    private int pricePerCarat;

    private static PreciousStone defaultPreciousStone = new PreciousStone();

    public static PreciousStone getInstance() {
        return defaultPreciousStone;
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

    public static void main(String[] args) {

        PreciousStone[] stones = {
                new PreciousStone(),
                new PreciousStone("Diamond", 50, "green", 3, 150),
                PreciousStone.getInstance(),
                PreciousStone.getInstance()
        };

        for (var stone : stones) {
            System.out.println(stone);
        }
    }
}


