public class CiclosFor {
    public static void main(String[] args) {
        CiclosFor ejercicios = new CiclosFor();
        ejercicios.Factorial();
    }

    public void Factorial() {
        int factorial = 5;
        int resultado = 1;
        for (int i = 1; i <= factorial; i++) {
            resultado = resultado * i;
        }
        System.out.println("el factorial de " + factorial + " es = " + resultado);
    }
}