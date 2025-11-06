import java.awt.*;

public class Triangle extends Shape {
    private int length;

    public Triangle(Turtle turtle, double locationX, double locationY, String color, int boarder, int length) {
        super(turtle, locationX, locationY, color, boarder);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void paint() {
        turtle.penUp();
        turtle.goTo(locationX, locationY);
        turtle.setPenWidth(getTurtle().getPenWidth());
        turtle.setColor(Color.RED);

        turtle.penDown();

        turtle.forward(getLength());
        turtle.turnRight(45);

        turtle.forward(getLength());
        turtle.turnRight(45);

        turtle.forward(getLength());
        turtle.turnRight(45);

    }
}
