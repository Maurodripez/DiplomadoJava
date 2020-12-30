import java.util.Scanner;

public class EjerciciosOperadores {
    public static void main(String[] args) {
        EjerciciosOperadores ejercicios = new EjerciciosOperadores();
        // ejercicios.ejercicio1();
        ejercicios.ejercicio2();
        ejercicios.ejercicio3();
        ejercicios.ejercicio4();
        ejercicios.ejercicio5();
    }

    public void ejercicio1() {
        double[] notas = new double[5];
        double promedio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor, introduzca su nombre\n");
        String nombre = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            i++;
            System.out.println("por favor, introduzca su calificacion " + i + " \n");
            i--;
            notas[i] = sc.nextDouble();
            promedio = promedio + notas[i];
        }
        System.out.println("el nombre del estudiante es: " + nombre + " \n");
        System.out.println("el promedio de sus calificaciones es : " + promedio / 5 + " \n");

    }

    public void ejercicio2() {
        int numero1 = 9;
        int numero2 = 7;
        System.out.println("la suma de las dos variables es: " + (numero2 + numero1) + " \n");
        System.out.println("la resta de las dos variables es: " + (numero1 - numero2) + " \n");
        System.out.println("la multiplicacion de las dos variables es: " + (numero2 * numero1) + " \n");
        System.out.println("la division de las dos variables es: " + (numero1 / numero2) + " \n");

    }

    public void ejercicio3() {
        int numeroUno = 8;
        int numeroDos = 2;
        int numeroAuxiliar = 0;
        numeroAuxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = numeroAuxiliar;
        System.out.println("el valor de la primer variable es : " + numeroUno + " \n");
        System.out.println("el valor de la segunda variable es : " + numeroDos + " \n");
    }

    public void ejercicio4() {
        boolean estado;
        if (5 == 2 || (2 > 1)) {
            estado = true;
            System.out.println(estado);
        }else{
            
        }

    }

    public void ejercicio5() {
double resultado;
resultado = 8/2*4-3+5*7;
System.out.println(resultado);
    }

    public void ejercicio6() {
int ladoCuadrado = 8;
System.out.println("el area del cuadrado es = "+ (ladoCuadrado*ladoCuadrado));
System.out.println("el perimetro del cuadrado es = "+ (ladoCuadrado*4));
int baseTriangulo = 9;
int alturaTriangulo = 8;
System.out.println("el area del cuadrado es = "+ (ladoCuadrado*ladoCuadrado));
System.out.println("el perimetro del cuadrado es = "+ (ladoCuadrado*4));

    }
}
