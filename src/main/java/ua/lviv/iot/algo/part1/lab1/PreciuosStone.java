package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PreciuosStone extends Stone {
    private int carat;
    private int clarity;
    private int pricePerCarat;
    private String color;
    private String shape;
    private static PreciuosStone preciuosStone = new PreciuosStone();

    public int getTotalPrice(int pricePerCarat, int carat) {
        return (pricePerCarat * carat);
    }
    public int getIncreaseClarity(int clarity) {
        return (clarity + 1);
    }
    public double getIncreasePrice(int pricePerCarat, int percentage) {
        double increasePrice = pricePerCarat * (1 + percentage / 100);
        return (increasePrice);
    }
    public int getFullPrice() {
        int fullPrice = carat * pricePerCarat;
        return fullPrice;
    }
    public String toCSV(){
        return super.toCSV() + "," + carat + ","
                + clarity + "," + pricePerCarat + "," + color + "," + shape + "\n";
    }
    public String getHeaders() {
        return super.getHeaders() + "," + "carat" + ","
                + "clarity" + "," + "pricePerCarat" + "," + "color" + "," + "shape" + "\n";
    }
}