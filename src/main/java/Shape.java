import java.awt.*;

public abstract class Shape {
    protected Turtle turtle;
    protected double locationX, locationY;
    protected Color color;
    protected int boarder;

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

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public double getLocationX() {
        return locationX;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBoarder() {
        return boarder;
    }

    public void setBoarder(int boarder) {
        this.boarder = boarder;
    }

    public abstract void paint();

}
