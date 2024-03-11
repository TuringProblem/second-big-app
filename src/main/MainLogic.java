package src.main;
import shapes.*;
import src.Area;
import src.Volume;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Override
 * @since
 * @see <a href="GitHub.com/TuringProblem">GitHub Profile</a>
 */
public class MainLogic {
    ArrayList<Shape> shapes = new ArrayList<>();
    Scanner KEYBOARD = new Scanner(System.in);
    public void logic() {
        final String PROMPT = "Choose a shape: \nie [Circle, Cube, Cylinder, Glome, Shape, Sphere, Square]\nEnter a Shape: ";

        System.out.println(PROMPT);
        String response = KEYBOARD.nextLine().toLowerCase();
        switch (response) {
            case "circle" -> {
                createCircle();
                printArea(() -> );
            }
            case "cube" -> {
                createCube();
                printVolume(() -> );
            }
            case "cynlinder" -> {
                createCylinder();
                printVolume(() -> );
            }
            case "glome" -> {
                createGlome();
                printVolume(() -> );
            }
            case "sphere" -> {
                createSphere();
                printArea(() -> );
            }
            case "square" -> {
                createSquare();
                printArea(() -> );
            }

            }
    }


    public void createCircle() {
        double radius = radiusQuestion();
        shapes.add(new Circle(radius, "Circle"));
    }

    public void createCube() {
        double sides = sideQuestion();
        shapes.add(new Cube(sides, "cube"));
    }
    public void createCylinder() {
        double radius = radiusQuestion();
        double height = heightQuestion();
        shapes.add(new Cylinder(radius, "Cylinder", height));
    }
    public void createGlome() {
        double radius = radiusQuestion();
        shapes.add(new Glome(radius, "Glome"));
    }
    public void createSphere() {
        double raidus = radiusQuestion();
        shapes.add(new Sphere(raidus, "Sphere"));
    }
    public void createSquare() {
        double sides = sideQuestion();
        shapes.add(new Square(sides, "Square"));
    }


    public double radiusQuestion(){
        System.out.println("Would you like to add a radius?\n[Y/N]: ");
        String response = KEYBOARD.nextLine().toLowerCase();
        if (response.equals("y")) {
            System.out.println("Enter a raidus: ");
            return KEYBOARD.nextDouble();
        } else if (response.equals("n")) {
            return noResponse(true);
        }
        System.out.println("Invalid Answer!");
        return 0.0;
    }

    public double sideQuestion() {
        System.out.println("Enter a number of Sides: ");
        return KEYBOARD.nextDouble();
    }
    public double heightQuestion() {
        System.out.println("Enter the height: ");
        return KEYBOARD.nextDouble();
    }
    public void logic(ArrayList<Shape> shapes) {

    }

    public double noResponse(boolean value) {
        try {
            if (value) {
                System.out.println();
                logic(shapes);
            }
        } catch(Exception e) {
            System.out.println("Invalid output!");
        }
        return 0.0;
    }

    static void printArea(Area object) { System.out.println(object.area()); }
    static void printVolume(Volume object) { System.out.println(object.volume()); }
}
