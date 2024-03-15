package shapes;
import src.Volume;

/**
 * @author Override
 * @since 03/03/2024 @15:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */

public class Sphere extends Circle implements Volume {

    /**
     * @see Sphere -> default, and set Constructors for the "Sphere" shape
     * @see Circle -> Super class that Sphere extends from -- allowing us to grab the radius from parent class
     */

    public Sphere() { super(); }
    public Sphere(double radius, String name){ super(radius, name); }

    /**
     * @return The volume of a Sphere
     */

    @Override
    public double volume() { return ((double) 4 / 3) * Math.PI * Math.pow(getRadius(), 3); }

    /**
     * Prints out the output for the values set -> we don't have a new variable, so we call the parent writeOutput()
     * @see Circle -> for writeOutput() method
     */

    @Override
    public void writeOutput() { super.writeOutput(); }
}
