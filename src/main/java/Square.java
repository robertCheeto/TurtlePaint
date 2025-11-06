import java.awt.*;

public class Square extends Shape {
    private int length;

    public Square(Turtle turtle, double locationX, double locationY, String color, int boarder, int length) {
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
        turtle.setColor(Color.GREEN);

        turtle.penDown();

        turtle.forward(length);
        turtle.turnRight(90);

        turtle.forward(length);
        turtle.turnRight(90);

        turtle.forward(length);
        turtle.turnRight(90);

        turtle.forward(length);
        turtle.turnRight(90);

    }
}
