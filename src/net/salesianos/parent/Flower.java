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

    @Override
    public boolean equals(Object obj) {
        // Si el objeto es el LITERALMENTE el mismo en memoria, retorna verdadero.
        if (obj == this) {
            return true;
        }

        // Si el objeto es de otra clase, retorna falso
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        // Transformamos el objeto obj a la clase que hemos validado en el paso anterior
        // para poder acceder a sus getters y setters
        Flower flowerObject = (Flower) obj;

        // Comprobamos que los atributos sean iguales, y si lo son, retorna verdadero
        boolean hasSameColor = this.color == flowerObject.getColor();
        boolean hasSamePetalsNumber = this.petalsNumber == flowerObject.getPetalsNumber();
        if (hasSameColor && hasSamePetalsNumber) {
            return true;
        }

        // Si no se cumple ninguna de las condiciones anteriores, retorna falso
        return false;
    }

}