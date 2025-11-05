import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el valor de la planilla 
 * de teléfono de un casa. Se debe ingresar el costo por minutos, el número de 
 * minutos consumidos en el mes.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double c, min, val;
         System.out.print("Ingrese el costo por minuto: $");
        c = tcl.nextDouble();
        System.out.println("Ingrese sus minutos consumidos en el mes: ");
        min = tcl.nextInt();
        val = c*min;
        System.out.println("El valor de su planilla este mes es de: $" + val);
    }
}

/**
 * run:
Ingrese el costo por minuto: $2
Ingrese sus minutos consumidos en el mes: 
10000
El valor de su planilla este mes es de: $20000.0
BUILD SUCCESSFUL (total time: 6 seconds)

 */