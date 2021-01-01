import java.util.Scanner;

public class EjerciciosVariables {
    public static void main(String[] args) {
        EjerciciosVariables ejercicios = new EjerciciosVariables();
        ejercicios.Ejercicio1();
    }

    public void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca nombre\n");
        String nombre = sc.nextLine();
        System.out.println("variable con 2 decimales");
        float x = sc.nextFloat();
        System.out.println("valor del dollar");
        float dollar = sc.nextFloat();
        double pi = 3.1416153;
        double euler = 2.718281828459045;
        System.out.println(nombre);
        System.out.println(x);
        System.out.println(dollar);
        System.out.println(pi);
        System.out.println(euler);
    }

    public void Ejercicio2() {
        int a = 8;
        String c = "Colombia";
        char b = 'A';
        double e = 74548;
        int numero;
        String nombre = "persona";
        int edad;

    }
}
