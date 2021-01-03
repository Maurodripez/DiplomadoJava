import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Case ejercicios = new Case();
        ejercicios.Ejercicio1();
        ejercicios.Ejercicio2();

    }

    public void Ejercicio1() {
        int casos;
        System.out.println("Que tipo de motor tienes?");
        Scanner sc = new Scanner(System.in);
        casos = sc.nextInt();
        switch (casos) {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo");
                break;
            case 1:
                System.out.println("Agua");
                break;
            case 2:
                System.out.println("Gasolina");
                break;
            case 3:
                System.out.println("Hormigon");
                break;
            default:
                System.out.println("No existe un valor valido");
        }
    }

    public void Ejercicio2() {
        int casos;
        int valor1;
        int valor2;
        System.out.println("Que calculo quieres hacer?");
        System.out.println("0-suma\n1-resta\n2-multi\n3-div");
        Scanner sc = new Scanner(System.in);
        casos = sc.nextInt();
        System.out.println("introduce los 2 valores\n");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        switch (casos) {
            case 0:
                System.out.println("la suma es = " + (valor1 + valor2));
                break;
            case 1:
                System.out.println("la resta es = " + (valor1 - valor2));
                break;
            case 2:
                System.out.println("la multi es = " + (valor1 * valor2));
                break;
            case 3:
                System.out.println("la div es = " + (valor1 / valor2));
                break;
            default:
                System.out.println("No existe un valor valido");
        }
    }
}
