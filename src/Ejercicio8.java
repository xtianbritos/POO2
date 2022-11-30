import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    static int opcion;
    static Scanner entrada = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("Elije una opción:"+
                "\n1 - Ingresar nuevo sueldo"+
                "\n2 - Calcular nómina"+
                "\n3 - Imprimir sueldos"+
                "\n0 - Salir del programa");
        opcion = entrada.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<Double> sueldos = new ArrayList<>();

        do {
            mostrarMenu();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el sueldo del empelado:");
                    sueldos.add(entrada.nextDouble());
                    break;
                }
                case 2:{
                    for (int i = 0; i < sueldos.size(); i++) {
                        if (sueldos.get(i) <1000) {
                            sueldos.set(i, sueldos.get(i) + sueldos.get(i)*15/100);
                        }
                        else {
                            sueldos.set(i, sueldos.get(i) + sueldos.get(i)*12/100);
                        }
                    }

                    System.out.println("Se la aumentado el sueldo a todos los empelados.");
                    break;
                }
                case 3: {
                    for (int i = 0; i < sueldos.size(); i++) {
                        System.out.println(sueldos.get(i));
                    }
                    break;
                }
                case 0: {
                    break;
                }
            }
        }
        while(opcion != 0);

    }
}
