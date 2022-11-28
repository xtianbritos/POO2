import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un dígito:");
        num = entrada.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.print(num*i + " ");
        }
    }
}
