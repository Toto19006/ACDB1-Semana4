import java.util.Scanner;
/**
 * Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
 * calcular y mostrar el total de gastos de los hijos del padre de familia.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double h1, h2, h3, respuesta;
        System.out.println("Ingrese el gasto de su primer hijo");
        h1 = tcl.nextDouble();
        System.out.println("Ingrese el gasto de su segundo hijo");
        h2 = tcl.nextDouble();
        System.out.println("Ingrese el gasto de su tercer hijo");
        h3 = tcl.nextDouble();
        respuesta = h1 + h2 + h3;
        System.out.println("El gasto total de los tres hijos es: "+respuesta);
    }
}

/**
 * run:
Ingrese el gasto de su primer hijo
20
Ingrese el gasto de su segundo hijo
300
Ingrese el gasto de su tercer hijo
10
El gasto total de los tres hijos es: 330.0
BUILD SUCCESSFUL (total time: 8 seconds)

 */
