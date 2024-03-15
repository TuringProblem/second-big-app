package shapes;
import  src.Volume;
/**
 * @author Override
 * @since 03/03/2024 @15:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */
public class Glome extends Sphere implements Volume {

    /**
     * @see Glome -> Default and set Constructors
     * @see Sphere -> for name and radius (The parent class)
     */

    @SuppressWarnings("unused")
    public Glome() { super(); }
    public Glome(double radius, String name){ super(radius, name);}

    /**
     * @return -> The volume of the:
     * @see Glome
     */
    @Override
    public double volume() { return 0.5 * (Math.pow(Math.PI, 2) * Math.pow(getRadius(), 4)); }

    /**
     * Prints -> the output of the name and radius
     * @see Sphere -> for parent writeOutput()
     */

    @Override
    public void writeOutput() { super.writeOutput(); }
}
