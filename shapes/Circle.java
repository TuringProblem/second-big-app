package shapes;
import src.Area;

public class Circle extends Shape implements Area {

    /**
     * @see Circle -> A circle has a Raidus
     */

    private double radius;

    /**
     * @see Circle -> default and set constructors for "Circle" Shape
     * @see Shape -> Super class that Circle extends from --
     * -> allowing us to grab the name of the shape from parent class
     */

    public Circle() {
        super();
        radius = 0;
    }
    public Circle(double radius, String name){
        super(name);
        setRadius(radius);
    }

    /**
     * @param radius -> sets the radius for:
     * @see Circle
     */

    public void setRadius(double radius) { this.radius = radius; }

    /**
     * @return -> gets the radius value for:
     * @see Circle
     */

    public double getRadius() { return radius; }

    /**
     * @return -> The area of:
     * @see Circle
     */

    @Override
    public double area() { return Math.PI * Math.pow(getRadius(), 2); }

    /**
     * Prints -> the output of the name "Circle" From parent class, and the "Radius"
     */

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Radius: %,5f\n", getRadius());
    }
}
