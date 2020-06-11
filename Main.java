import java.util.Scanner;

import entities.Circle;
import entities.Figura2D;
import entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Figura2D fig = null;
        int opt = 0;
        do {
            System.out.println("***** PAINT *****");
            System.out.println("1 Circle ");
            System.out.println("2 Rectangle ");
            System.out.println("0 exit. Choice option: ");
            opt = input.nextInt();
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Circle *****");
                    fig = new Circle();
                    break;
                case 2:
                    System.out.println("**** 2 Rectangle ****");
                    fig = new Rectangle();
                    break;
                default:
                    System.out.println("OT Incorrecto");
                    break;
            }
            fig.paint();
            fig.calArea();
        } while (opt != 0);
    }
}