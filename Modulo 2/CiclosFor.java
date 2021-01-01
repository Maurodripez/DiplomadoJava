public class CiclosFor {
    public static void main(String[] args) {
        CiclosFor ejercicios = new CiclosFor();
        ejercicios.Factorial();
        ejercicios.Divisores();
        ejercicios.NumerosPerfectos();
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
}