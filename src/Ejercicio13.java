import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, potencia, resultado=1;

        System.out.println("Ingrese un número entero:");
        numero = entrada .nextInt();
        System.out.println("Ingrese la potencia a la que quiere elevar el número:");
        potencia = entrada.nextInt();

        for (int i = 0; i < potencia; i++)
            resultado *= numero;

        System.out.println(numero+" elevado a la potencia "+potencia+" es "+resultado);
    }
}
