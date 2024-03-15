package shapes;
import src.Volume;
/**
 * @author Override
 * @since 03/03/2024 @15:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */
public class Cylinder extends Circle implements Volume {

    /**
     * @see Cylinder -> A cylinder has a height
     */

    private double height;

    /**
     * @see Cylinder -> Default and set Constructors
     * @see Circle -> for radius and name (The parent class)
     */

    @SuppressWarnings("unused")
    public Cylinder() {
        super();
        height = 0.0;
    }
    public Cylinder(double radius, String name, double height) {
        super(radius, name);
        setHeight(height);
    }

    /**
     * @return -> Gets the height for:
     * @see Cylinder
     */

    public double getHeight() { return height; }

    /**
     * @param height -> Sets the height value for:
     * @see Cylinder
     */

    public void setHeight(double height) {this.height = height;}

    /**
     * @return -> The volume of the:
     * @see Cylinder
     */

    @Override
    public double volume() { return Math.PI * Math.pow(getRadius(), 2) * getHeight(); }

    /**
     * Prints -> the output of the name, radius, and height
     * @see Circle -> for parent writeOutput()
     */

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Height: %,5f\n", getHeight());
    }
}
