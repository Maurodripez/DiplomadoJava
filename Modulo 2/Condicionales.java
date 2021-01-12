import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Condicionales ejercicios = new Condicionales();
        // ejercicios.Ejercicio1();
        ejercicios.Ejercicio3();
    }

    public void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor. introduce tu edad");
        int edad = sc.nextInt();
        if (edad >= 0 && edad <= 5) {
            System.out.println("eres un infante");
        } else if (edad > 5 && edad <= 10) {
            System.out.println("eres un nino");
        } else if (edad > 10 && edad <= 15) {
            System.out.println("eres un pre adolescente");
        } else if (edad > 15 && edad <= 18) {
            System.out.println("eres un adolescente");
        } else if (edad > 18 && edad <= 25) {
            System.out.println("eres un pre adulto");
        } else if (edad > 25 && edad <= 40) {
            System.out.println("eres un adulto");
        } else if (edad > 40 && edad <= 55) {
            System.out.println("eres un pre anciano");
        } else if (edad > 55) {
            System.out.println("eres un anciano");
        }
    }

    public void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor. introduce un numero");
        int numero = sc.nextInt();
        String numeroString = Integer.toString(numero);
        if (numeroString.length() <= 4) {
            System.out.println("la cantidad de digitos son: " + numeroString.length());
        } else {
            System.out.println("Error,son mas de 4 digitos");
        }
    }

    public void Ejercicio3() {
        int a, b, c = 0;
        int edades[] = new int[5];
        System.out.println(edades[2]);

    }
}
