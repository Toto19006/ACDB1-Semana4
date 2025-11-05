import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el valor a cancelar de 
 * una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y 
 * el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor 
 * a 65 años, se debe descontar el 10%.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKwh, con, tot, desc = 0;
        int edad;
        System.out.println("Ingrese el costo por kilovatio/hora: ");
        costoKwh = tcl.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes: ");
        con = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        tot = costoKwh * con;
        if (edad > 65) {
            desc = tot * 0.10;
            tot = tot - desc;
        }
        System.out.println("El valor a cancelar por la planilla de luz es: " + tot);
    }
}

/**
 * run:
Ingrese el costo por kilovatio/hora: 
24
Ingrese el n�mero de kilovatios consumidos en el mes: 
20000
Ingrese su edad: 
19
El valor a cancelar por la planilla de luz es: 480000.0
BUILD SUCCESSFUL (total time: 11 seconds)


 */
