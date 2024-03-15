package shapes;
import src.Volume;
/**
 * @author Override
 * @since 03/03/2024 @15:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */
public class Cube extends Square implements Volume {

    /**
     * @see Cube -> Default and set Constructors
     * @see Square -> for the Default and set Constructs (The parent class)
     */

    @SuppressWarnings("unused")
    public Cube() { super(); }
    public Cube(double shape, String name) { super(shape, name); }

    /**
     * @return -> The volume of the:
     * @see Square
     */

    @Override
    public double volume() { return Math.pow(getSide(), 3); }

    /**
     * Prints -> the output of name and sides
     * @see Square -> for parent writeOutput()
     */

    @Override
    public void writeOutput() { super.writeOutput(); }
}


