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
    Circle CIRCLE = new Circle();
    Cube CUBE = new Cube();
    Cylinder CYLINDER = new Cylinder();
    Glome GLOME = new Glome();
    Sphere SPHERE = new Sphere();
    Square SQUARE = new Square();
    Scanner KEYBOARD = new Scanner(System.in);


    public void logic() {
        final String PROMPT = "Choose a shape: \nie [Circle, Cube, Cylinder, Glome, Shape, Sphere, Square]\nEnter a Shape: ";

        System.out.println(PROMPT);
        String response = KEYBOARD.nextLine().toLowerCase();
        switch (response) {
            case "circle" -> {
                createCircle();
                printArea(() -> CIRCLE.area());
            }
            case "cube" -> {
                createCube();
                printVolume(() -> CUBE.volume());
            }
            case "cynlinder" -> {
                createCylinder();
                printVolume(() -> CYLINDER.volume());
            }
            case "glome" -> {
                createGlome();
                printVolume(() -> GLOME.volume());
            }
            case "sphere" -> {
                createSphere();
                printArea(() -> SPHERE.area());
            }
            case "square" -> {
                createSquare();
                printArea(() -> SQUARE.area());
            }
            }

    }


    public void createCircle() {
        double radius = radiusQuestion();
        CIRCLE.setRadius(radius);
        shapes.add(new Circle(CIRCLE.getRadius(), "Circle"));
    }

    public void createCube() {
        double sides = sideQuestion();
        CUBE.setSide(sides);
        shapes.add(new Cube(CUBE.getSide(), "cube"));
    }
    public void createCylinder() {
        double radius = radiusQuestion();
        double height = heightQuestion();
        CYLINDER.setRadius(radius);
        CYLINDER.setHeight(height);
        shapes.add(new Cylinder(CYLINDER.getRadius(), "Cylinder", CYLINDER.getHeight()));
    }
    public void createGlome() {
        double radius = radiusQuestion();
        GLOME.setRadius(radius);
        shapes.add(new Glome(GLOME.getRadius(), "Glome"));
    }
    public void createSphere() {
        double raidus = radiusQuestion();
        SPHERE.setRadius(raidus);
        shapes.add(new Sphere(SPHERE.getRadius(), "Sphere"));
    }
    public void createSquare() {
        double sides = sideQuestion();
        SQUARE.setSide(sides);
        shapes.add(new Square(SQUARE.getSide(), "Square"));
    }

    public double radiusQuestion(){
        System.out.println("Enter a raidus: ");
        return KEYBOARD.nextDouble();
    }

    public double sideQuestion() {
        System.out.println("Enter a number of Sides: ");
        return KEYBOARD.nextDouble();
    }
    public double heightQuestion() {
        System.out.println("Enter the height: ");
        return KEYBOARD.nextDouble();
    }
    static void printArea(Area object) { System.out.println(object.area()); }

    static void printVolume(Volume object) { System.out.println(object.volume()); }
}
