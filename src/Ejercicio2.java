public class Ejercicio2 {

    public static void main(String[] args) {

        int num=2, suma=2;

        while(num <= 1800) {
            System.out.print(num+" ");
            num += 3;
            suma += num;
            System.out.print(num+" ");
            num += 2;
            suma += num;
        }

        System.out.println("\nLa suma de todos los términos es: "+suma);
    }
}
