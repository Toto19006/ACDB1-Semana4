import java.util.Scanner;
/**
 * Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar 
 * de un número ingresado por el usuario; solo en el caso que el valor del número 
 * esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tabla;
        System.out.print("Que tabla deseas que te presente: ");
        tabla = tcl.nextInt();
        if ((tabla >= 2) && (tabla <= 6))
        {
            System.out.println(tabla + " * " + 1 + " = " + (tabla*1));
            System.out.println(tabla + " * " + 2 + " = " + (tabla*2));
            System.out.println(tabla + " * " + 3 + " = " + (tabla*3));
            System.out.println(tabla + " * " + 4 + " = " + (tabla*4));
            System.out.println(tabla + " * " + 5 + " = " + (tabla*5));
            System.out.println(tabla + " * " + 6 + " = " + (tabla*6));
            System.out.println(tabla + " * " + 7 + " = " + (tabla*7));
            System.out.println(tabla + " * " + 8 + " = " + (tabla*8));
            System.out.println(tabla + " * " + 9 + " = " + (tabla*9));
            System.out.println(tabla + " * " + 10 + " = " + (tabla*10));
            System.out.println(tabla + " * " + 11 + " = " + (tabla*11));
            System.out.println(tabla + " * " + 12 + " = " + (tabla*12));
        }
        else
            System.out.println("NO SE PUEDE PRESENTAR ESTA TABLA");
    }
}

/**
 * run:
Que tabla deseas que te presente: 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20
2 * 11 = 22
2 * 12 = 24
BUILD SUCCESSFUL (total time: 5 seconds)
 */