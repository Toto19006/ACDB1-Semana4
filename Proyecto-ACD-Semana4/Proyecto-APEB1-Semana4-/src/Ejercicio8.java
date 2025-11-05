import java.util.Scanner;

/**
 * Se debe generar una solución que permita calcular y mostrar el valor total a 
 * pagar mensual de servicios digitales de una persona. Los servicios digitales
 * son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 
 * años se descuenta el 20% del total mensual.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtube, dropbox, spotify, tot, desc = 0;
        int edad;
        System.out.println("Ingrese el costo mensual de Netflix: ");
        netflix = tcl.nextDouble();
        System.out.println("Ingrese el costo mensual de YouTube Premium: ");
        youtube = tcl.nextDouble();
        System.out.println("Ingrese el costo mensual de Dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.println("Ingrese el costo mensual de Spotify: ");
        spotify = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        tot = netflix + youtube + dropbox + spotify;
        if (edad < 30) {
            desc = tot * 0.20;
            tot = tot- desc;
        }
        System.out.println("El valor total a pagar por los servicios digitales es: " + tot);
    }
}

/**
 * run:
Ingrese el costo mensual de Netflix: 
12
Ingrese el costo mensual de YouTube Premium: 
15
Ingrese el costo mensual de Dropbox: 
10
Ingrese el costo mensual de Spotify: 
11
Ingrese su edad: 
19
El valor total a pagar por los servicios digitales es: 38.4
BUILD SUCCESSFUL (total time: 14 seconds)

 */