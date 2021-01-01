import java.util.Random;

public class CiclosFor {
    public static void main(String[] args) {
        CiclosFor ejercicios = new CiclosFor();
        // ejercicios.Factorial();
        // ejercicios.Divisores();
        // ejercicios.NumerosPerfectos();
        ejercicios.Sumatoria();
    }

    public void Factorial() {
        int factorial = 5;
        int resultado = 1;
        for (int i = 1; i <= factorial; i++) {
            resultado = resultado * i;
        }
        System.out.println("el factorial de " + factorial + " es = " + resultado);
    }

    public void Divisores() {
        int numero = 15;
        for (int i = 1; i < 15; i++) {

            if (numero % i == 0) {
                System.out.println(i + " es divisor de 15\n");
            }
        }
    }

    public void NumerosPerfectos() {
        int numero = 28;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {
            System.out.println(numero + " es un numero perfecto");
        } else {
            System.out.println(numero + " no es un numero perfecto");
        }
    }

    public void Sumatoria() {
        int sumatoria = 0;
        float resultado = 1;
        int suma = 0;
        for (int i = 0; i <= 5; i++) {
            sumatoria = sumatoria + i;

        }
        System.out.println("la raiz cuadrada de " + sumatoria + " es = " + Math.sqrt(sumatoria));
        Random random = new Random();
        int numeroRandom = random.nextInt(sumatoria + 1);
        System.out.println("el numero aleatorio entre 1 y " + sumatoria + " es " + numeroRandom);
        for (int i = 1; i <= sumatoria; i++) {

            if (sumatoria % i == 0) {
                System.out.println(i + " es divisor de " + sumatoria);
            }
        }
        for (int i = 1; i <= sumatoria; i++) {
            resultado = resultado * i;
        }
        System.out.println("el factorial de " + sumatoria + " es = " + resultado);
        for (int i = 1; i < sumatoria; i++) {
            if (sumatoria % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == sumatoria) {
            System.out.println(sumatoria + " es un numero perfecto");
        } else {
            System.out.println(sumatoria + " no es un numero perfecto");
        }

    }
}