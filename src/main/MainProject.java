package src.main;

import shapes.Circle;
import shapes.Cylinder;
import shapes.Shape;
import shapes.Square;
import src.Area;
import src.Volume;

import java.util.ArrayList;
import java.util.Scanner;
public class MainProject implements Printable {
    static Scanner KEYBOARD = new Scanner(System.in);
    @Override
    public void print() {

    }
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        System.out.println("Choose a shape: \nie [Circle, Cube, Cylinder, Glome, Shape, Sphere, Square]\nEnter a Shape: ");
        String shape = KEYBOARD.nextLine().toLowerCase();
        switch (shape) {
            case "circle":
                System.out.println("Enter the radius: ");
                double radius = KEYBOARD.nextDouble();
                KEYBOARD.nextLine();
                System.out.println("Do you want a name for the shape? [y/n]");
                String name = KEYBOARD.nextLine().toLowerCase();
                if (name.equals("y") {
                System.out.println("Enter a name: ");
                String shapeName = KEYBOARD.nextLine();
                shapes.add(new Circle(radius, shapeName));
                
                }
            }
        }

    }
    static void printArea(Area object) {
        System.out.println(object.area());
    }
    static void printVolume(Volume object) {
        System.out.println(object.volume());
    }
}
