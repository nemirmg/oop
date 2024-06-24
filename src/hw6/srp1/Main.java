package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.SquareDrawer;
import srp1.figure.Drawer;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Drawer sd = new SquareDrawer(square.getSide());
        sd.draw();
    }
}
