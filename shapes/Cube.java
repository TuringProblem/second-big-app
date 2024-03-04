package shapes;

import src.Volume;

public class Cube extends Square implements Volume {
    public Cube() { super(); }
    public Cube(double shape, String name) { super(shape, name); }
    @Override
    public double volume() { return Math.pow(getSide(), 3); }
}


