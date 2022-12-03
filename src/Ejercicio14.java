import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0, numero, potencia, resultado=1;

        System.out.println("Ingrese un número entero:");
        numero = entrada .nextInt();
        System.out.println("Ingrese la potencia a la que quiere elevar el número:");
        potencia = entrada.nextInt();

        while(i < potencia) {
            resultado *= numero;
            i++;
        }

        System.out.println(numero+" elevado a la potencia "+potencia+" es "+resultado);
    }
}
