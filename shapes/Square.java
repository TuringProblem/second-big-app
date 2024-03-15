package shapes;
import src.Area;
/**
 * @author Override
 * @since 03/03/2024 @ 20:52
 * @see <a href="https://github.com/TuringProblem">GitHub Profile</a>
 */
public class Square extends Shape implements Area {

    /**
     * @see Square -> A Square has a sides, which is a double value.
     */

    private double side;

    /**
     * @see Square -> Default and set Constructors
     * @see Shape -> for name (The super class)
     */

    public Square() {
        super();
        side = 0;
    }
    public Square(double sides, String name) {
        super(name);
        setSide(sides);
    }

    /**
     * @param side -> Sets the side value for:
     * @see Square
     */

    public void setSide(double side) {this.side = side; }

    /**
     * @return -> Gets the side value for:
     * @see Square
     */

    public double getSide() { return side; }

    /**
     * Calculates -> Area of the:
     * @see Square
     */

    @Override
    public double area() { return Math.pow(getSide(), 2.0); }

    /**
     * Prints -> the output for name, and sides
     * @see Shape -> for parent writeOutput()
     */

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Sides: %,.5f\n", getSide());
    }
}

