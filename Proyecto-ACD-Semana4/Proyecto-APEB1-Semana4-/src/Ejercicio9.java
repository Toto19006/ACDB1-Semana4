import java.util.Scanner;

/**
 * Desarrolle una solución que determine el estado académico de una persona 
 * estudiante en una asignatura universitaria a partir de una calificación de 
 * evaluación continua, una calificación de examen final y un porcentaje de asistencia. 
 * La regla institucional establece que:
 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota 
 * final redondeada a un decimal.
 * @author Tomás Herrera B
 * @version 1.0
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evalContinua, examenFinal, notaFinal;
        double asistenciaMin, asistenciaReal;
        double pesoEval = 0.4;   // 40% evaluación continua
        double pesoExamen = 0.6; // 60% examen final
        double notaMinExamen = 7.0; // nota mínima para aprobar el examen
        System.out.println("Ingrese la nota de evaluación continua: ");
        evalContinua = tcl.nextDouble();
        System.out.println("Ingrese la nota del examen final: ");
        examenFinal = tcl.nextDouble();
        System.out.println("Ingrese la asistencia mínima requerida (en %): ");
        asistenciaMin = tcl.nextDouble();
        System.out.println("Ingrese su porcentaje de asistencia (en %): ");
        asistenciaReal = tcl.nextDouble();
        // Verificar asistencia mínima
        if (asistenciaReal < asistenciaMin) {
            System.out.println("Reprobado por falta de asistencia.");
        } else if (examenFinal < notaMinExamen) {
            System.out.println("Reprobado por nota insuficiente en el examen final.");
        } else {
            // Calcular nota final combinada
            notaFinal = (evalContinua * pesoEval) + (examenFinal * pesoExamen);
            notaFinal = Math.round(notaFinal * 10.0) / 10.0;
            if (notaFinal >= 7.0) {
                System.out.println("Aprobado con nota final: " + notaFinal);
            } else if (notaFinal >= 7.0) {
                System.out.println("Supletorio con nota final: " + notaFinal);
            } else {
                System.out.println("Reprobado con nota final: " + notaFinal);
            }
        }
    }
}
    
/**
 * run:
Ingrese la nota de evaluaci�n continua: 
8
Ingrese la nota del examen final: 
5
Ingrese la asistencia m�nima requerida (en %): 
10
Ingrese su porcentaje de asistencia (en %): 
10
Reprobado por nota insuficiente en el examen final.
BUILD SUCCESSFUL (total time: 9 seconds)
 */