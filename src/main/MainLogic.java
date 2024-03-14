package src.main;
import shapes.*;
import src.Area;
import src.Volume;
import java.util.Scanner;
import java.util.function.Supplier;
public class MainLogic {
    Scanner KEYBOARD = new Scanner(System.in);
    public enum ShapeType{
        TWO_DIMENSIONAL("Two Dimensional"),
        THREE_DIMENSIONAL("Three Dimensional");
        final String dimensions;
        ShapeType(String dimensions){this.dimensions = dimensions;}
    }
    private final ShapeType twoD = ShapeType.TWO_DIMENSIONAL;
    private final ShapeType threeD = ShapeType.THREE_DIMENSIONAL;


    public void logic() {
        /**
         * Using Supplier<T> interface -> functional interface from java.util.function library
         * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html">Java 8 Api</a>
         */
        Supplier<Double> radiusPrompt = () -> {
            System.out.println("Enter a Radius: ");
            return KEYBOARD.nextDouble();
        };
        Supplier<Double> heightPrompt = () -> {
            System.out.println("Enter a Height: ");
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
                printArea(myCircle::area);
            }
            case "cube" -> {

            }
            case "cylinder" -> {

            }
            case "glome" -> {

            }
            case "" -> {

            }
        }

        
    }
    static void printArea(Area object) { System.out.println("Area: " + object.area()); }

    static void printVolume(Volume object) { System.out.println("Volume: " + object.volume()); }



}
