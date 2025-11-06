import java.awt.*;

public class Hexagon extends Shape {
    private double width, height;

    public Hexagon(Turtle turtle, double locationX, double locationY, Color color, int boarder, double width, double height) {
        super(turtle, locationX, locationY, color, boarder);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void paint() {

    }
}
