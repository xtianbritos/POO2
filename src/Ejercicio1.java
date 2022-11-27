import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num, sumaImpares=0, sumaPares=0, cantPares=0;
        Scanner entrada = new Scanner(System.in);

        for(int i=1; i<=270; i++) {
            System.out.println("Ingrese un número entero:");
            num = entrada.nextInt();

            if(num % 2 == 0){
                sumaPares+= num;
                cantPares++;
            }
            else {
                sumaImpares+= num;
            }
        }

        System.out.println("La suma de los números impares es: "+sumaImpares+
                "\ny el promedio de los números pares es: "+sumaPares/cantPares);

    }
}
