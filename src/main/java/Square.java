import java.awt.*;

public class Square extends Shape {
    private int length;

    public Square(Turtle turtle, double locationX, double locationY, Color color, int boarder, int length) {
        super(turtle, locationX, locationY, color, boarder);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void paint() {

    }
}
