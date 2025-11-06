import java.awt.*;

public class Square extends Shape {
    private int width, height;

    public Square(Turtle turtle, double locationX, double locationY, Color color, int boarder, int width, int height) {
        super(turtle, locationX, locationY, color, boarder);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void paint() {
        World w = new World(this.width, this.height, this.getColor());
        Square square = new Square(new Turtle(w), getLocationX(), getLocationY(), getColor(), getBoarder(), getWidth(), getHeight());

    }
}
