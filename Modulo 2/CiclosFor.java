public class CiclosFor {
    public static void main(String[] args) {
        CiclosFor ejercicios = new CiclosFor();
        ejercicios.Factorial();
        ejercicios.Divisores();
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
    public void NumerosPerfectos(){
        
    }
}