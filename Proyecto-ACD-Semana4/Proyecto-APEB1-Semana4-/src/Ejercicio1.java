import java.util.Scanner;

import java.util.Scanner;

/**
 * Generar un algoritmo que permite calcular y presentar el área de un
 * triángulo. Los datos deben ser pedidos al usuario.
 *
 * @author Tomás Herrera Bravo
 * @version 1.0
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double b, H, r;
        System.out.print("Dame la base y altura del triangulo: ");
        b = tcl.nextDouble();
        H= tcl.nextDouble();
        r = (b * H) / 2;
        System.out.println("Area del triangulo es : " + r);
    }
}
/**
 * run:
Dame la base y altura del triangulo: 6

10
Area del triangulo es : 30.0
BUILD SUCCESSFUL (total time: 1 minute 27 seconds)

 */
