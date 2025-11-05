import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el costos de una computadora 
 * de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, tec, pnt, rat, vf;
        System.out.println("Ingrese el valor del CPU: ");
        cpu = tcl.nextDouble();
        System.out.println("Ingrese el valor del teclado: ");
        tec = tcl.nextDouble();
        System.out.println("Ingrese el valor del raton: ");
        pnt = tcl.nextDouble();
        vf = cpu + tec + pnt;
        System.out.println("El costo total de la computadora es: "+ vf);
    }
}

/**
 * run:
Ingrese el valor del CPU: 
20000
Ingrese el valor del teclado: 
10000
Ingrese el valor del raton: 
20
El costo total de la computadora es: 30020.0
BUILD SUCCESSFUL (total time: 7 seconds)

 */