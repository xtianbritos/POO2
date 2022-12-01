import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float total;

        System.out.println("Ingrese el total a pagar:");
        total = input.nextFloat();

        if(total <= 500) {
            System.out.println("No se le aplicó descuento. Su total a pagar es $"+total);
        }else if (total <= 1000) {
            System.out.println("Se le aplicó 5% de descuento. Su total a pagar es $"+(total-total*5/100));
        }else if (total <= 7000) {
            System.out.println("Se le aplicó 11% de descuento. Su total a pagar es $"+(total-total*11/100));
        }else if (total <= 15000) {
            System.out.println("Se le aplicó 18% de descuento. Su total a pagar es $"+(total-total*18/100));
        }else {
            System.out.println("Se le aplicó 25% de descuento. Su total a pagar es $"+(total-total*25/100));
        }
    }
}
