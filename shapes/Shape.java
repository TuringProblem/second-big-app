package shapes;
/**
 * @author Override
 * @since 03/03/2024 @15:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */
abstract public class Shape {

    /**
     * @see Shape -> A shape has a name, which is a String value
     */

    protected String name;

    /**
     * @see Shape -> Default and set Constructors of the class
     */

    public Shape() { name = ""; }
    public Shape(String name) { setName(name); }

    /**
     * @param stringName -> Sets the name for:
     * @see Shape
     */

    public void setName(String stringName) { name = stringName; }

    /**
     * @see Shape -> Gets the name that has been set
     * @return -> Name of the shape
     */

    public String getName() { return name; }

    /**
     * @see Shape -> Writes the output for the shape name
     */
    public void writeOutput() { System.out.printf("Name: %s\n", getName()); }
}
