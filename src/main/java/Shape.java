import java.awt.*;

public abstract class Shape {
    private Turtle turtle;
    private double locationX, locationY;
    private Color color;
    private int boarder;

    public Shape(Turtle turtle, double locationX, double locationY, Color color, int boarder) {
        this.turtle = turtle;
        this.locationX = locationX;
        this.locationY = locationY;
        this.color = color;
        this.boarder = boarder;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public double getLocationX() {
        return locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public Color getColor() {
        return color;
    }

    public int getBoarder() {
        return boarder;
    }

    public abstract void paint();

}
