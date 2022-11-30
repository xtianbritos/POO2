import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        ArrayList numeros = new ArrayList<>();

        do {
            System.out.println("\nElija una opción:"+
                    "\n1 - Ingresar un número"+
                    "\n2 - Calcular el mayor y el menor de los números"+
                    "\n3 - Mostrar los números");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingresa un número entero:");
                    numeros.add(entrada.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Mayor: "+Collections.max(numeros));
                    System.out.println("Menor: "+Collections.min(numeros));
                    break;
                }
                case 3: {
                    numeros.forEach(System.out::println);
                    break;
                }
            }
        }
        while (opcion == 1 || opcion == 2 || opcion == 3);
    }
}
