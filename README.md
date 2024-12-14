🐾 Animal Fight Simulator

📝 Description

Animal Fight Simulator is a Java-based game where animals 🐶🐱 move randomly on a stage. Players can observe their movement and interactions. The game includes basic AI mechanics for animal movement, stage visualization, and a simple fight mechanism.

✨ Features
	•	🐾 Animal Movement: Both the dog and cat move randomly on a 100x100 stage.
	•	🎥 Stage Visualization: A scaled-down stage (10x10 grid) provides a real-time display of their positions.
	•	⚔️ Interaction: Animals fight when they are closer than 5 units.
	•	🏆 Victory Condition: The game ends if both animals reach the center of the stage (50,50).

🚀 Getting Started

📋 Prerequisites
	•	Java Development Kit (JDK): Version 8 or higher
	•	IDE: IntelliJ IDEA, Eclipse, or any Java-compatible IDE

🛠️ Installation
	1.	Clone the repository:

git clone https://github.com/omerozerf/SE363-Project.git
cd SE363-Project


	2.	Open the project in your preferred IDE.
	3.	Compile and run the MainClass.java file.

🎮 How to Play
	1.	🖥️ Run the program.
	2.	✏️ Enter names for the dog and cat when prompted.
	3.	👀 Watch as the animals move on the stage and interact.

🗂️ Project Structure

project/  
├── AnimalClass.java       # Abstract class representing an animal  
├── CatClass.java          # Class for the cat  
├── DogClass.java          # Class for the dog  
├── MainClass.java         # Main class with game logic  
└── StageManager.java      # Handles stage visualization  

🌟 Code Highlights
	•	🐾 Random Movement:

public void moveRandomly() {
    this.x = (int) (Math.random() * 101);
    this.y = (int) (Math.random() * 101);
}


	•	📏 Distance Calculation:

public double calculateDistance(AnimalClass other) {
    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
}


	•	🎥 Stage Visualization:

display[scaledCatY][scaledCatX] = cat.getName().charAt(0);
display[scaledDogY][scaledDogX] = dog.getName().charAt(0);

🖼️ Sample Output

Enter the dog's name: Max  
Max is barking!  

Enter the cat's name: Luna  
Luna is meowing!  

Round 1  
Luna position is: (x:23, y:45)  
Max position is: (x:50, y:70)  
. . . . . . . . . .  
. . L . . . . . . .  
. . . . . . . . . .  
. . . . . M . . . .  

🤝 Contributing

Feel free to fork the repository and submit pull requests for new features or bug fixes.

📜 License

This project is licensed under the MIT License - see the LICENSE file for details.
