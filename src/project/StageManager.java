package project;


public class StageManager {

    private final int stageSize;     // Reel scene size
    private final int displaySize;  // Visual scene size

    public StageManager(int stageSize, int displaySize) {
        this.stageSize = stageSize;
        this.displaySize = displaySize;
    }

    public void drawStage(AnimalClass cat, AnimalClass dog) {
        char[][] display = new char[displaySize][displaySize];

        // Create a display
        for (int i = 0; i < displaySize; i++) {
            for (int j = 0; j < displaySize; j++) {
                display[i][j] = '.';
            }
        }

        // Animals' positions
        int scaledCatX = Math.min(cat.getX() / (stageSize / displaySize), displaySize - 1);
        int scaledCatY = Math.min(cat.getY() / (stageSize / displaySize), displaySize - 1);
        int scaledDogX = Math.min(dog.getX() / (stageSize / displaySize), displaySize - 1);
        int scaledDogY = Math.min(dog.getY() / (stageSize / displaySize), displaySize - 1);

        // Set the animals' positions
        display[scaledCatY][scaledCatX] = cat.getName().charAt(0);
        display[scaledDogY][scaledDogX] = dog.getName().charAt(0);

        // Print the display
        for (int i = 0; i < displaySize; i++) {
            for (int j = 0; j < displaySize; j++) {
                System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}