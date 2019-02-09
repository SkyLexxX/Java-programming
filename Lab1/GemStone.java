package gemstone;

public class GemStone {
    public double amountOfCarat;
    public double price;
    public String name;

    private String colour;
    private double mass;

    private static int gemId;

    protected double clarity;
    protected String structure;

    public GemStone() {
        gemId++;
    }

    public GemStone(double amountOfCarat, double price, String name, String colour) {
        this();
        this.amountOfCarat = amountOfCarat;
        this.price = price;
        this.name = name;
        this.colour = colour;
    }

    public GemStone(double amountOfCarat, double price, String name, String colour, double mass, double clarity, String structure) {
        this(amountOfCarat, price, name, colour);
        this.mass = mass;
        this.clarity = clarity;
        this.structure = structure;
    }

    public double getAmountOfCarat() { return amountOfCarat; }

    public void setAmountOfCarat(double amountOfCarat) { this.amountOfCarat = amountOfCarat; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColour() { return colour; }

    public void setColour(String colour) { this.colour = colour; }

    public double getMass() { return mass; }

    public void setMass(double mass) { this.mass = mass; }

    public String toString() {
        return amountOfCarat + " " + price + " " + name + " " + colour + " " + mass + " " + clarity + " " + structure;
    }

    public void resetValues(double amountOfCarat, double price, String name, String colour) {
        this.amountOfCarat = amountOfCarat;
        this.price = price;
        this.name = name;
        this.colour = colour;
    }

    public void resetValues(double amountOfCarat, double price, String name, String colour, double mass, double clarity, String structure) {
        resetValues(amountOfCarat, price,  name, colour);
        this.mass = mass;
        this.clarity = clarity;
        this.structure = structure;
    }

    static void printStaticGemId() {
        System.out.println("Gem stone id = " + gemId);
    }

    public void printGemId() {
        System.out.println("Gem stone id = " + gemId);
    }
}
