package src.main;
import shapes.*;
import src.Area;
import src.Volume;
import java.util.Scanner;
import java.util.function.Supplier;
public class MainLogic {
    Scanner KEYBOARD = new Scanner(System.in);

    /**
     * @see ShapeType -> enum for static dimensions
     */
    public enum ShapeType{
        TWO_DIMENSIONAL("Two Dimensional"),
        THREE_DIMENSIONAL("Three Dimensional");
        final String dimensions;
        ShapeType(String dimensions){this.dimensions = dimensions;}
    }
    private final ShapeType twoD = ShapeType.TWO_DIMENSIONAL;
    private final ShapeType threeD = ShapeType.THREE_DIMENSIONAL;

    public void printDimenstion(boolean isTwoD) {
        if (isTwoD) {
            System.out.printf("Dimension: %s", twoD.dimensions);
        } else {
            System.out.printf("Dimension: %s", threeD.dimensions);
        }
    }
    /**
     * Using Supplier<T> interface -> functional interface from java.util.function library
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html">Java 8 Api</a>a
     * Only returns an output, not an input
     */
    public void logic() {

        Supplier<Double> radiusPrompt = () -> {
            System.out.println("Enter a Radius: ");
            return KEYBOARD.nextDouble();
        };
        Supplier<Double> heightPrompt = () -> {
            System.out.println("Enter a Height: ");
            return KEYBOARD.nextDouble();
        };
        Supplier<Double> sidePrompt = () -> {
            System.out.println("Enter a side: ");
            return KEYBOARD.nextDouble();
        };

        final String PROMPT = "Choose a shape: \nie [Circle, Cube, Cylinder, Glome, Shape, Sphere, Square]\nEnter a Shape: ";
        System.out.println(PROMPT);
        String response = KEYBOARD.nextLine().toLowerCase();
        switch (response) {
            case "circle" -> {
                double userRadius = radiusPrompt.get();
                Circle myCircle = new Circle(userRadius, "Circle");
                myCircle.writeOutput();
                printArea(myCircle);
                printDimenstion(true);
            }
            case "cube" -> {
                double userShape = sidePrompt.get();
                Cube myCube = new Cube(userShape, "Cube");
                myCube.writeOutput();
                printVolume(myCube);
                printDimenstion(false);

            }
            case "cylinder" -> {
                double userHeight = heightPrompt.get();
                double userRadius = radiusPrompt.get();
                Cylinder myCylinder = new Cylinder(userRadius, "Cylinder", userHeight);
                myCylinder.writeOutput();
                printVolume(myCylinder);
                printDimenstion(false);
            }
            case "glome" -> {
                double userRadius = radiusPrompt.get();
                Glome myGlome = new Glome(userRadius, "Glome");
                myGlome.writeOutput();
                printVolume(myGlome);
                printDimenstion(false);

            }
            case "sphere" -> {
                double userRadius = radiusPrompt.get();
                Sphere mySphere = new Sphere(userRadius, "Sphere");
                mySphere.writeOutput();
                printVolume(mySphere);
                printDimenstion(false);
            }
            case "square" -> {
                double userSide = sidePrompt.get();
                Square mySquare = new Square(userSide, "Square");
                mySquare.writeOutput();
                printArea(mySquare);
                printDimenstion(true);
            }
        }
    }
    static void printArea(Area object) { System.out.printf("Area: %,5f\n", object.area()); }
    static void printVolume(Volume object) { System.out.printf("Volume: %,5f\n",object.volume()); }
}
