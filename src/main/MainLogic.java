package src.main;
import shapes.*;
import src.Area;
import src.Volume;
import java.util.Scanner;
import java.util.function.Supplier;

/**
 * @author Override
 * @since 03/14/2022 @00:33
 * @see <a href="Github.com/TuringProblem">GitHub Profile</a>
 */

public class MainLogic {
    Scanner KEYBOARD = new Scanner(System.in);

    /**
     * @see ShapeType -> enum for static dimensions if the object is 2D -> output "Two Dimensional" : object is 3D -> "Three Dimensional
     * Using Enum due to these objects never needing to change.
     */
    public enum ShapeType{
        TWO_DIMENSIONAL("Two Dimensional"),
        THREE_DIMENSIONAL("Three Dimensional");
        final String dimensions;
        ShapeType(String dimensions){this.dimensions = dimensions;}
    }
    /**
     * Static variables for the enum -> twoD == twoDimensional && threeD == threeDimensional
     * @see ShapeType -> for more context behind variable
     */
    private static final ShapeType twoD = ShapeType.TWO_DIMENSIONAL;
    private static final ShapeType threeD = ShapeType.THREE_DIMENSIONAL;

    /**
     * Boolean checker for if the value
     * @param isTwoD -> if true, print 2D, else it's 3d so print's 3D
     */
    public void printDimension(boolean isTwoD) {
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
     * -------------------------------------------------------------
     * Using a Switch Expression -> based on user input, the values get added into the object of the user's choice
     * based on what the user inputs, the object will either output the Volume() or the Area()
     */

    final String PROMPT = "Choose a shape: \nie [Circle, Cube, Cylinder, Glome, Shape, Sphere, Square]\nEnter a Shape: ";

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


        System.out.println(PROMPT);
        String response = KEYBOARD.nextLine().toLowerCase();
        switch (response) {
            case "circle" -> {
                double userRadius = radiusPrompt.get();
                Circle myCircle = new Circle(userRadius, "Circle");
                myCircle.writeOutput();
                printArea(myCircle);
                printDimension(true);
            }
            case "cube" -> {
                double userShape = sidePrompt.get();
                Cube myCube = new Cube(userShape, "Cube");
                myCube.writeOutput();
                printVolume(myCube);
                printDimension(false);

            }
            case "cylinder" -> {
                double userHeight = heightPrompt.get();
                double userRadius = radiusPrompt.get();
                Cylinder myCylinder = new Cylinder(userRadius, "Cylinder", userHeight);
                myCylinder.writeOutput();
                printVolume(myCylinder);
                printDimension(false);
            }
            case "glome" -> {
                double userRadius = radiusPrompt.get();
                Glome myGlome = new Glome(userRadius, "Glome");
                myGlome.writeOutput();
                printVolume(myGlome);
                printDimension(false);
            }
            case "sphere" -> {
                double userRadius = radiusPrompt.get();
                Sphere mySphere = new Sphere(userRadius, "Sphere");
                mySphere.writeOutput();
                printVolume(mySphere);
                printDimension(false);
            }
            case "square" -> {
                double userSide = sidePrompt.get();
                Square mySquare = new Square(userSide, "Square");
                mySquare.writeOutput();
                printArea(mySquare);
                printDimension(true);
            }
        }
    }

    /**
     * Both methods are set to print out the Area(), and Volume() for the object passed
     */

    static void printArea(Area object) { System.out.printf("Area: %,5f\n", object.area()); }
    static void printVolume(Volume object) { System.out.printf("Volume: %,5f\n",object.volume()); }
}
