package net.salesianos.utils;

import java.util.Random;

/**
 * AnimalGenerator
 */
public class AnimalGenerator {

  private static final String[] ANIMAL_NAMES = new String[] {
    "Vaca", "Pollo", "Cerdo", "Gatete", "Perro", "Amanda"
  };


  public static String getRandomAnimal() {

    Random random = new Random();
    int randomIndex = random.nextInt(AnimalGenerator.ANIMAL_NAMES.length);

    // Esta es otra manera de hacerlo, pero es más difícil obtener los índices
    // de los extremos del array:
    // int randomIndex = (int) (Math.random() * (AnimalGenerator.ANIMAL_NAMES.length - 1)) ;

    return AnimalGenerator.ANIMAL_NAMES[randomIndex];
  }
  
}