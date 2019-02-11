package gemstone;

public class Main {

    public static void main(String[] args) {
        GemStone saph = new GemStone();
        GemStone brill = new GemStone(4, 400, "brilliant", "blue");
        GemStone diam = new GemStone(8, 900, "diamond", "purple", 10, 6, "heart");

        System.out.println(saph.toString());
        System.out.println(brill.toString());
        System.out.println(diam.toString());

        saph.printAmountOfGem();
        GemStone.printStaticAmountOfGem();
    }
}
