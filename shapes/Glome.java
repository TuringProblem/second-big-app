package shapes;
import  src.Volume;
public class Glome extends Sphere implements Volume {
    private double r;
    private String n;

    /**
     *
     * @see sphere -> need to come back and fix this constructors.
     */
    public Glome () {
        double r = 0;
        String n = "";

    }
    public Glome(double r, String n){
        super(r, n);
    }


}
