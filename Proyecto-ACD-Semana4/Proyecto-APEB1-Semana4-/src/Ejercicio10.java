import java.util.Scanner;
/**
 * El programa debe calcular el área del polígono. La figura se compone de un
 * cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya
 * base mide lo mismo que uno de los lados del cuadrado, y un rectángulo (D)
 * cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la
 * altura mide lo mismo que la altura de los triángulos. Se pide que haga un programa
 * que calcule el área total. Por cultura general, sabemos que el área de un
 * rectángulo se calcula multiplicando su base por su altura; el área de un
 * triángulo rectángulo se calcula multiplicando su base por su altura, y luego
 * dividiendo el resultado entre dos; finalmente, el área de un cuadrado se
 * calcula elevando al cuadrado la medida de uno de sus lados.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
      Scanner tcl = new Scanner(System.in);
        double ladoCuadrado, alturaTri, areaCua, areaTris, areaRec, areaTo;      
        System.out.println("Ingrese la medida del lado del cuadrado: ");
        ladoCuadrado = tcl.nextDouble();       
        System.out.println("Ingrese la altura de los triángulos rectángulos: ");
        alturaTri = tcl.nextDouble();        
        // Área del cuadrado
        areaCua = Math.pow(ladoCuadrado, 2);        
        // Área de los tres triángulos (3 triángulos iguales)
        areaTris = 3 * ((ladoCuadrado * alturaTri) / 2);        
        // Área del rectángulo
        areaRec = ladoCuadrado * alturaTri;        
        // Área total
        areaTo = areaCua + areaTris+ areaRec;        
        System.out.println("El área total del polígono es: " + areaTo); 
    }
}
/**
 * run:
Ingrese la medida del lado del cuadrado: 
10
Ingrese la altura de los tri�ngulos rect�ngulos: 
23
El �rea total del pol�gono es: 675.0
BUILD SUCCESSFUL (total time: 8 seconds)

 */