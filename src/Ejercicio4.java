import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        float sue;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su sueldo:");
        sue = entrada.nextFloat();

        if(sue < 1000) {
            System.out.println(sue + sue*15/100);
        }
        else {
            System.out.println(sue + sue*12/100);
        }
    }
}
