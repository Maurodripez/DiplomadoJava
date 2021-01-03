import java.util.Random;

public class Matrices {
    public static void main(String[] args) {
        Matrices ejercicios = new Matrices();
        // ejercicios.Ejercicio1();
        // ejercicios.Ejercicio2();
        ejercicios.Ejercicio3();
    }

    public void Ejercicio1() {
        int[] pares = new int[10];
        int[] impares = new int[10];
        int[] suma = new int[10];
        Random random = new Random();
        int numeroRandom = 0;
        int contXp = 0;
        int contXi = 0;
        for (int a = 0; a <= 9; a++) {
            numeroRandom = random.nextInt(100);
            if (numeroRandom % 2 == 0) {
                pares[contXp] = numeroRandom;
                contXp++;
            } else if (numeroRandom % 2 != 0) {
                impares[contXi] = numeroRandom;
                contXi++;
            }
        }
        for (int i = 0; i <= 9; i++) {
            suma[i] = pares[i] + impares[i];
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(suma[i]);
        }

    }

    public void Ejercicio2() {
        int valorMax = 0;
        Random random = new Random();
        int[][] matriz = new int[5][3];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                matriz[i][j] = random.nextInt(50);
                System.out.println(matriz[i][j]);
                if (matriz[i][j] > valorMax) {
                    valorMax = matriz[i][j];
                }
            }
        }
        System.out.println("el numero maximo es: " + valorMax);
    }

    public void Ejercicio3() {
        Random random = new Random();
        int[][] matriz = new int[3][4];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz[i][j] = random.nextInt(50);
                System.out.println(matriz[i][j]);
            }
        }
        // primera fila
        System.out.println("la primera fila es: " + matriz[0][0] + "," + matriz[1][0] + "," + matriz[2][0]);
        System.out.print("la segunda columna es:\n" + matriz[1][0] + "\n" + matriz[1][1] + "\n" + matriz[1][2] + "\n"
                + matriz[1][3]);
        System.out.println("la tercera fila es: " + matriz[2][0] + "," + matriz[2][1] + "," + matriz[2][2]);
    }
}
