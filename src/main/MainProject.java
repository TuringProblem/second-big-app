package src.main;

import shapes.Square;
import java.util.Scanner;
public class MainProject {
    Scanner KEYBOARD = new Scanner(System.in);
    public static void main(String[] args) {
        Square sq = new Square(12, "Square");
        System.out.println(sq.area());
    }
}
