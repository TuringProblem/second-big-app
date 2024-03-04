package shapes;

import src.Area;

public class Square extends Shape implements Area {
    private double side;
    Square() {
        super();
        side = 0;
    }
    Square(double sides, String name) {
        super(name);
        side = sides;
    }
    public void setSide(double side) {this.side = side; }
    public double getSide() { return side; }
    /**
     * need to implement the code for the area of a sqr
     */
    @Override
    public double area() { return Math.pow(getSide(), 2.0); }
}

