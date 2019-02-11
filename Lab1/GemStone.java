package gemstone;

public class GemStone {
    private double amountOfCarat;
    private double price;
    private String name;

    private String colour;
    private double mass;

    private static int amountOfGem;

    protected double clarity;
    protected String structure;

    public GemStone(double amountOfCarat, double price, String name, String colour, double mass, double clarity, String structure) {
        this.amountOfCarat = amountOfCarat;
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.mass = mass;
        this.clarity = clarity;
        this.structure = structure;
        amountOfGem++;
    }

    public GemStone(double amountOfCarat, double price, String name, String colour) {
        this(amountOfCarat, price, name, colour, 10, 1, "bubble");
    }

    public GemStone() {
        this(0, 0, "null", "null", 0, 0, "null");
    }

    public String toString() {
        return "Amount of carat = " + amountOfCarat + " \t " +
                "Price = " + price + " \t " +
                "Name = " + name + " \t " +
                "Colour = " + colour + " \t " +
                "Mass = " + mass + " \t " +
                "Clarity = " + clarity + " \t " +
                "Structure = " + structure;
    }

    public void resetValues(double amountOfCarat, double price, String name, String colour, double mass, double clarity, String structure) {
        this.amountOfCarat = amountOfCarat;
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.mass = mass;
        this.clarity = clarity;
        this.structure = structure;
    }

    static void printStaticAmountOfGem() {
        System.out.println("Amount of Gem stones = " + amountOfGem);
    }

    public void printAmountOfGem() {
        System.out.println("Amount of Gem stones = " + amountOfGem);
    }

    public double getAmountOfCarat() {
        return amountOfCarat;
    }

    public void setAmountOfCarat(double amountOfCarat) {
        this.amountOfCarat = amountOfCarat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}