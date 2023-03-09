package ua.lviv.iot.algo.part1.lab1;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
@Setter
@Getter
@ToString

public class PreciousStone{
    private  String name;
    private int carat;
    private String color;
    private int clarity;
    private int pricePerCarat;
    public PreciousStone(){};

   public PreciousStone (String name, int carat, String color, int clarity, int pricePerCarat){
        this.name = name;
        this.carat = carat;
        this.color = color;
        this.clarity = clarity;
        this.pricePerCarat = pricePerCarat;
    }
    private static PreciousStone
    defaultPreciousStone = new PreciousStone();

    public static PreciousStone
    getInstance(){
        return defaultPreciousStone;
    }
    public int getTotalPrice(int pricePerCarat, int carat){
        this.pricePerCarat = pricePerCarat;
        this.carat = carat;
        return (pricePerCarat * carat);
    }
    public int increaseClarity(int clarity){
        this.clarity = clarity;
        return (clarity + 1);
    }
    public void increasePrice(double percentage){
        pricePerCarat *= (1 + percentage/100);
    }
    @Override
    public String toString(){
        return "PreciousStone {" + "name " + name + ", carat " + carat + '\'' +
                ", has color " + color + '\'' + " and clarity " + '\''
               + "his price per carat " + pricePerCarat + '}';

        }
        public static void main(String[] args) {
        PreciousStone Stone1 = new PreciousStone();
        PreciousStone Stone2 = new PreciousStone("Diamond", 50, "green", 3, 150);
        PreciousStone Stone3 = PreciousStone.getInstance();
        PreciousStone Stone4 = PreciousStone.getInstance();

        PreciousStone[] Stones = {Stone1, Stone2, Stone3, Stone4};

        for(PreciousStone Stone : Stones){
            System.out.println(Stone.toString());
        }
    }
}


