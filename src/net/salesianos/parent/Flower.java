package net.salesianos.parent;

public class Flower {

    private int petalsNumber;
    private String color;

    protected final String BEST_SEASON = "Spring";

    public Flower(int petals, String flowerColor) {
        this.petalsNumber = petals;
        this.color = flowerColor;
    }

    protected void flourish() { }

    public int getPetalsNumber() {
        return petalsNumber;
    }

    public void setPetalsNumber(int petalsNumber) {
        this.petalsNumber = petalsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{ petalsNumber:" + petalsNumber + ", color," + color + ", BEST_SEASON," + BEST_SEASON + "}";
    }

}