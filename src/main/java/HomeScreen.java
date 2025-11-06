import java.util.Scanner;

public class HomeScreen {
    public static Scanner keyboard = new Scanner(System.in);
    int userInput = keyboard.nextInt();

    public void mainMenu() {
        System.out.println("Welcome to TurtlePaint");
        System.out.println("1) Add Shape");
        System.out.println("2) Save Image - WIP");
        System.out.println("0) Exit Program");
        System.out.print("Enter you choice here: ");

        mainMenuChoice(userInput);
        keyboard.nextLine();
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
        System.out.println("1) Square\n2) Circle\n3) Triangle\n4)Hexagon");

        shapeMenuChoice(userInput);
        keyboard.nextLine();
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

    public Square createSquare() {
        System.out.print("Enter square width: ");
        int width = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter square height: ");
        int height = keyboard.nextInt();
        keyboard.nextLine();

        // size of pen
        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine();

        System.out.print("Enter location of the square (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the square (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        return new Square(turtle, locationX, locationY, color, penWidth, width, height);
    }

}
