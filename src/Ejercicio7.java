import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int[] notas = new int[20];
        int sumaNotas=0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese la nota del alumno "+ (i+1) +":");
            notas[i] = entrada.nextInt();
            sumaNotas += notas[i];
        }

        Arrays.sort(notas);

        System.out.println("Promedio general: "+ sumaNotas/20);
        System.out.println("Calificaciones en orden inverso:");

        for (int i = 19; i >= 0; i--) {
            System.out.print(notas[i] + " ");
        }
    }
}
