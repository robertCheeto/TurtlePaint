import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, double locationX, double locationY, String color, int boarder, double radius) {
        super(turtle, locationX, locationY, color, boarder);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void paint() {

    }
}
