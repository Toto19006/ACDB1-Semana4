import java.util.Scanner;

/**
 * Generar un solución que permita calcular y mostrar el pago mensual de un préstamo 
 * de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double mon, inte, pagoM, total;
        System.out.println("Ingrese el monto del préstamo: ");
        mon = tcl.nextDouble();
        System.out.println("Ingrese el interés mensual (en %): ");
        inte = tcl.nextDouble();
        // Calcular el pago mensual (interés simple mensual)
        pagoM = (mon * (inte / 100)) + (mon / 12);
        total = pagoM * 12;
        System.out.println("El pago mensual es: " + pagoM);
        System.out.println("El total pagado al finalizar el año es: " + total);
    }
}

/**
 * run:
Ingrese el monto del pr�stamo: 
200
Ingrese el inter�s mensual (en %): 
10
El pago mensual es: 36.66666666666667
El total pagado al finalizar el a�o es: 440.00000000000006
BUILD SUCCESSFUL (total time: 5 seconds)

 */