package shapes;
abstract public class Shape {
    protected String name;
    public Shape() { name = ""; }
    public Shape(String name) { setName(name); }
    public void setName(String stringName) { name = stringName; }
    public String getName() { return name; }
    public void writeOutput() { System.out.printf("Name: %s\n", getName()); }
}
