import net.salesianos.children.Sunflower;
import net.salesianos.parent.Flower;

public class App {
    public static void main(String[] args) throws Exception {

        Flower rose = new Flower(6, "Roja");
        Flower roseTwo = new Flower(6, "Roja");
        String outputMessage = "Al comparar rose y roseTwo: ";
        // Al comparar rose con roseTwo, serán iguales por sus atributos
        if (rose.equals(roseTwo)) {
            outputMessage += "SON IGUALES";
        } else {
            outputMessage += "NO SON IGUALES";
        }
        System.out.println(outputMessage);

        Flower roseThree = rose;
        outputMessage = "Al comparar rose y roseThree: ";
        // Al comparar rose con roseThree, son literalmente el mismo objeto
        // por referencia en memoria. Solo le hemos dado otro apodo a la variable.
        if (rose.equals(roseThree)) {
            outputMessage += "SON IGUALES";
        } else {
            outputMessage += "NO SON IGUALES";
        }
        System.out.println(outputMessage);


        Flower daisy = new Flower(12, "Blanco");
        outputMessage = "Al comparar rose y daisy: ";
        // Al comparar rose con daisy, serán distintos por sus atributos
        if (rose.equals(daisy)) {
            outputMessage += "SON IGUALES";
        } else {
            outputMessage += "NO SON IGUALES";
        }
        System.out.println(outputMessage);


        Sunflower sunflower = new Sunflower(12);
        outputMessage = "Al comparar rose y sunflower: ";
        // Al comparar rose con sunflower, serán distintos por sus clases
        if (rose.equals(sunflower)) {
            outputMessage += "SON IGUALES";
        } else {
            outputMessage += "NO SON IGUALES";
        }
        System.out.println(outputMessage);
    }
}
