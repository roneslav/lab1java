package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
    public String toCSV(){
        return super.toCSV() + "," + nameOfLaboratory + ","
                + massInGrams + "," + pricePerGram + "," + color + "," + shape + "\n";
    }
    public String getHeaders() {
        return super.getHeaders() + "," + "nameOfLaboratory" + ","
                + "massInGrams" + "," + "pricePerGram" + "," + "color" + "," + "shape" + "\n";
    }
}