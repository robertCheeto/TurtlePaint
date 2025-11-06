import java.awt.*;
import java.util.Scanner;

public class HomeScreen {
    public static Scanner keyboard = new Scanner(System.in);
    public static int userInput;

    public void mainMenu() {
        System.out.println("Welcome to TurtlePaint");
        System.out.println("1) Add Shape");
        System.out.println("2) Save Image - WIP");
        System.out.println("0) Exit Program");
        System.out.print("Enter you choice here: ");

        userInput = keyboard.nextInt();
        keyboard.nextLine();
        mainMenuChoice(userInput);
    }

    public void mainMenuChoice(int userInput) {
        switch (userInput) {
            case 1 -> addShapeMenu();
            case 0 -> System.exit(0);
            default -> System.out.println("Please enter a valid input");
        }
    }

    public void addShapeMenu() {
        System.out.println("\n\nWhat shape do you want to draw?");
        System.out.println("1) Square\n2) Circle\n3) Triangle\n4) Hexagon");

        keyboard.nextInt();
        keyboard.nextLine();
        shapeMenuChoice(userInput);
    }

    public void shapeMenuChoice(int userInput) {
        switch (userInput) {
            case 1 -> createSquare();
            //case 2 -> createCircle();
            //case 3 -> createTriangle();
            //case 4 -> createHexagon;
            default -> System.out.println("Please enter a valid input.");
        }
    }

    public void createSquare() {
        System.out.print("Enter location of the square (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the square (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter square length: ");
        int length = keyboard.nextInt();
        keyboard.nextLine();

        // size of pen
        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter pen color: ");
        String colorInput = keyboard.nextLine().toUpperCase().trim();
        Color color = Color.getColor(colorInput);

        System.out.print("Enter size of the canvas (X): ");
        double canvasX = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter size of the canvas (Y): ");
        double canvasY = keyboard.nextDouble();
        keyboard.nextLine();

        World w = new World();
        Square paintSquare = new Square(new Turtle(canvasX, canvasY, w), locationX, locationY, color, penWidth, length);

        paintSquare.paint();
    }

}
