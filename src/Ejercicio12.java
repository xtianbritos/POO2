import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] boletos = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el rpecio del boleto "+(i+1));
            boletos[i] = entrada.nextInt();
        }

        System.out.println("Se comrparon 500 boletos con el precio de $"+boletos[0]+" haciendo la ganancia de $"+(500*boletos[0])+
                "\nSe comrparon 1000 boletos con el precio de $"+boletos[1]+" haciendo la ganancia de $"+(1000*boletos[1])+
                "\nSe comrparon 200 boletos con el precio de $"+boletos[2]+" haciendo la ganancia de $"+(200*boletos[2])+
                "\nSe comrparon 1300 boletos con el precio de $"+boletos[3]+" haciendo la ganancia de $"+(1300*boletos[3])+
                "\nSe comrparon 600 boletos con el precio de $"+boletos[4]+" haciendo la ganancia de $"+(600*boletos[4]));
    }
}
