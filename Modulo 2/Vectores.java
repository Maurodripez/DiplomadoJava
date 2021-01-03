import java.util.Scanner;
import java.util.Random;

public class Vectores {
    public static void main(String[] args) {
        Vectores ejercicios = new Vectores();
        // ejercicios.Ejercicio1();
        // ejercicios.Ejercicio2();
        ejercicios.Ejercicio3();
    }

    public void Ejercicio1() {
        float promedio = 0;
        int personas = 0;
        float[] vector = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el peso de las 5 personas");
        for (int i = 0; i <= 4; i++) {
            vector[i] = sc.nextFloat();
            promedio = promedio + vector[i];
        }
        System.out.println("el promedio del peso es: " + promedio / 5);
        for (int i = 0; i <= 4; i++) {
            if (vector[i] > (promedio / 5)) {
                personas++;
            }
        }
        System.out.println("la cantidad de perosnas que superan el peso son: " + personas);
        System.out.println("la cantidad de perosnas que no superan el peso son: " + (5 - personas));
    }

    public void Ejercicio2() {
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];
        float promA = 0;
        float promB = 0;
        Random random = new Random();
        for (int i = 0; i <= 9; i++) {
            grupoA[i] = random.nextInt(10) + 1;
            grupoB[i] = random.nextInt(10) + 1;
            promA = grupoA[i] + promA;
            promB = grupoB[i] + promB;
        }
        System.out.println("el promedio del grupo A es: " + (promA / 10));
        System.out.println("el promedio del grupo B es: " + (promB / 10));
        System.out.println("el promedio de los grupos es: " + ((promA + promB) / 20));
        if (promA > promB) {
            System.out.println("el grupo con el promedio mas alto es: A");
        } else if (promB > promA) {
            System.out.println("el grupo con el promedio mas alto es: B");
        } else
            System.out.println("los dos grupos tienen el mismo promedio");
    }

    public void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce palabra");
        String palabra = sc.nextLine();
        char[] letra = palabra.toCharArray();
        System.out.println("la letra es " + letra[1]);
        System.out.println("el tamano de la cadena es "+letra.length);

    }
}
