package shapes;
import  src.Volume;
public class Glome extends Sphere implements Volume {

    /**
     * @see  -> need to come back and fix this constructors.
     */
    public Glome () { super(); }
    public Glome(double radius, String name){ super(radius, name);}
    @Override
    public double volume() { return 0.5 * (Math.pow(Math.PI, 2) * Math.pow(getRadius(), 4)); }
}
