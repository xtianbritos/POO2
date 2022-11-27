import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int mat;
        float cal1, cal2, cal3, cal4, cal5, prom;
        String aprobado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la matrícula del alumno:");
        mat = entrada.nextInt();
        System.out.println("Ingrese su primera calificación:");
        cal1 = entrada.nextFloat();
        System.out.println("Ingrese su segunda calificación:");
        cal2 = entrada.nextFloat();
        System.out.println("Ingrese su tercera calificación:");
        cal3 = entrada.nextFloat();
        System.out.println("Ingrese su cuarta calificación:");
        cal4 = entrada.nextFloat();
        System.out.println("Ingrese su quinta calificación:");
        cal5 = entrada.nextFloat();

        prom = (cal1 + cal2 + cal3 + cal4 + cal5)/5;

        aprobado = prom>=6? "APROBADO" : "NO APROBADO";


        System.out.println("MATRÍCULA: "+mat+
                "\nPROMEDIO: "+prom+
                "\n"+aprobado);
    }
}
