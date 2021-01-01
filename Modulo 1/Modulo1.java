import java.util.Random;

public class Modulo1 {
//inicio de math
    public void ejercicio1() {
        int base = 1;
        int exponente = 0;
        System.out.println(Math.pow(base, exponente));
    }

    public void ejercicio2() {
        for (int i = 1; i < 7; i++) {
            int raiz[] = { 2, 8, 9, 27, 28, 55, 121 };
            System.out.println("la raiz de " + raiz[i] + " = " + Math.sqrt(raiz[i]));
        }
    }

    public void ejercicio3() {
        Random random = new Random();
        int nota[] = { 0, 0, 0, 0, 0 };
        float promedio = 0;
        for (int i = 0; i < 5; i++) {
            nota[i] = random.nextInt(11);
            promedio = promedio + nota[i];
            System.out.println("el numero random es = " + nota[i]);
        }
        System.out.println("el promedio de los 5 numeros es = " + promedio / 5);
    }

    public void ejercicio4() {
        Random random = new Random();
        double nota[] = { 0, 0 };
        for (int i = 0; i < 2; i++) {
            nota[i] = random.nextDouble() * 100;
            System.out.println("el numero random es = " + Math.floor(nota[i]));
        }
        System.out.println("el mayor numero es = " + Math.max(nota[0], nota[1]));
        if (nota[0] > nota[1]) {
            System.out.println("el mayor numero es = " + nota[0]);
        } else
            System.out.println("el mayor numero es = " + nota[1]);
    }
//final de math

    public static void main(String[] args) {
        Modulo1 ejercicios;
        ejercicios = new Modulo1();
        ejercicios.ejercicio1();
        ejercicios.ejercicio2();
        ejercicios.ejercicio3();
        ejercicios.ejercicio4();
    }
}