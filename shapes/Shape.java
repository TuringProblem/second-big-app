package shapes;

public class Shape {
    protected String name;
    Shape() {

    }
    Shape(String name) {
        this.name = name;
    }
    public void setName(String stringName) {
        name = stringName;
    }
    public String getName() {
        return name;
    }
}
