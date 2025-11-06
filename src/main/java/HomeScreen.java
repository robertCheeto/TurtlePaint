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
        System.out.println("1) Square\n2) Circle\n3) Triangle\n4) Hexagon\n5) Fibonacci");
        System.out.print("Please enter your choice here: ");

        userInput = keyboard.nextInt();
        keyboard.nextLine();
        shapeMenuChoice(userInput);
    }

    public void shapeMenuChoice(int userInput) {
        switch (userInput) {
            case 1 -> createSquare();
            case 2 -> createCircle();
            case 3 -> createTriangle();
            case 4 -> createHexagon();
            case 5 -> createFibonacci();
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

        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        // cannot figure out how to code this properly so the
        //pen color is permanently set to green for the time being
        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine().toUpperCase().trim();
        //Color color = Color.getColor(colorInput);

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

    public void createCircle() {
        System.out.print("Enter location of the circle (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the circle (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter circle radius: ");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        // cannot figure out how to code this properly so the
        //pen color is permanently set to green for the time being
        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine().toUpperCase().trim();
        //Color color = Color.getColor(colorInput);

        System.out.print("Enter size of the canvas (X): ");
        double canvasX = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter size of the canvas (Y): ");
        double canvasY = keyboard.nextDouble();
        keyboard.nextLine();

        World w = new World();
        Circle paintCircle = new Circle(new Turtle(canvasX, canvasY, w), locationX, locationY, color, penWidth, radius);

        paintCircle.paint();
    }

    public void createTriangle() {
        System.out.print("Enter location of the triangle (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the triangle (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter triangle length (will be the same length for all 3 sides): ");
        int length = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        // cannot figure out how to code this properly so the
        //pen color is permanently set to green for the time being
        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine().toUpperCase().trim();
        //Color color = Color.getColor(colorInput);

        System.out.print("Enter size of the canvas (X): ");
        double canvasX = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter size of the canvas (Y): ");
        double canvasY = keyboard.nextDouble();
        keyboard.nextLine();

        World w = new World();
        Triangle paintTriangle = new Triangle(new Turtle(canvasX, canvasY, w), locationX, locationY, color, penWidth, length);

        paintTriangle.paint();
    }

    public void createHexagon() {
        System.out.print("Enter location of the hexagon (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the hexagon (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter hexagon length (will be the same length for all 6 sides): ");
        int length = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        // cannot figure out how to code this properly so the
        //pen color is permanently set to green for the time being
        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine().toUpperCase().trim();
        //Color color = Color.getColor(colorInput);

        System.out.print("Enter size of the canvas (X): ");
        double canvasX = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter size of the canvas (Y): ");
        double canvasY = keyboard.nextDouble();
        keyboard.nextLine();

        World w = new World();
        Hexagon paintHexagon = new Hexagon(new Turtle(canvasX, canvasY, w), locationX, locationY, color, penWidth, length);

        paintHexagon.paint();
    }

    public void createFibonacci() {
        System.out.print("Enter location of the fib (X): ");
        int locationX = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter location of the fib (Y): ");
        int locationY = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter fib radius: ");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter pen size width: ");
        int penWidth = keyboard.nextInt();
        keyboard.nextLine();

        // cannot figure out how to code this properly so the
        //pen color is permanently set to green for the time being
        System.out.print("Enter pen color: ");
        String color = keyboard.nextLine().toUpperCase().trim();
        //Color color = Color.getColor(colorInput);

        System.out.print("Enter size of the canvas (X): ");
        double canvasX = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter size of the canvas (Y): ");
        double canvasY = keyboard.nextDouble();
        keyboard.nextLine();

        World w = new World();
        Fibonacci paintFibonacci = new Fibonacci(new Turtle(canvasX, canvasY, w), locationX, locationY, color, penWidth, radius);

        paintFibonacci.paint();
    }

}
