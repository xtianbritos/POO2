package ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        int posMayorSueldo, mayorSueldo;
        Scanner input = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        ArrayList<Trabajador> sueldos = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            sueldos.add(new Trabajador());
            System.out.println("\nIngrese el nombre del trabajador "+(i+1));
            sueldos.get(i).setNombre(input.nextLine());
            System.out.println("Ingrese el sueldo del trabajador "+(i+1)+":");
            sueldos.get(i).setSueldo(entrada.nextInt());
        }

        mayorSueldo = sueldos.get(0).getSueldo();
        posMayorSueldo = 0;

        for (int i = 1; i < sueldos.size(); i++) {
            if(mayorSueldo < sueldos.get(i).getSueldo()) {
                mayorSueldo = sueldos.get(i).getSueldo();
                posMayorSueldo = i;
            }
        }

        System.out.println("El empleado con mayor sueldo es "+sueldos.get(posMayorSueldo).getNombre()+
                " con un sueldo de $"+sueldos.get(posMayorSueldo).getSueldo());
    }
}
