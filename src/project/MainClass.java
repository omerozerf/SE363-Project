package project;

import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scanner for getting the names of the animals
        System.out.print("Enter the dog's name: ");
        String dogName = scanner.nextLine();
        System.out.println(dogName + " is barking!");

        System.out.print("Enter the cat's name: ");
        String catName = scanner.nextLine();
        System.out.println(catName + " is meowing!");

        // Create animals
        AnimalClass dog = new DogClass(dogName);
        AnimalClass cat = new CatClass(catName);

        // Create a stage manager
        StageManager stageManager = new StageManager(100, 10); // STAGE_SIZE = 100, DISPLAY_SIZE = 10

        // Game loop
        for (int round = 1; round <= 1000; round++) {
            System.out.println("\nRound " + round);

            // Animals are moving
            dog.moveRandomly();
            cat.moveRandomly();

            // Print the positions
            System.out.println(cat.getName() + " position is: (x:" + cat.getX() + ", y:" + cat.getY() + ")");
            System.out.println(dog.getName() + " position is: (x:" + dog.getX() + ", y:" + dog.getY() + ")");

            // Draw the stage
            stageManager.drawStage(cat, dog);

            // Animals are fighting if they are closer than 5 units
            if (dog.calculateDistance(cat) <= 5) {
                System.out.println(cat.getName() + " and " + dog.getName() + " are fighting now!");
            }

            // Animals reached the center of the stage
            if (dog.getX() == 50 && dog.getY() == 50 && cat.getX() == 50 && cat.getY() == 50) {
                System.out.println("Game is Over!");
                break;
            }

            // Waiting (for animation effect)
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}