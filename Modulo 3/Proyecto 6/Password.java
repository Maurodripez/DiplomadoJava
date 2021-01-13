import java.util.Random;

public class Password {
    int longitud;
    String password;

    public Password() {
        longitud = 10;
        password = "";
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    public void generar() {
        Random random = new Random();
        int randomValue;
        for (int i = 0; i < longitud; i++) {
            randomValue = random.nextInt(122 - 48) + 48;
            char caracter = (char) randomValue;
            password = password + caracter;
        }
        System.out.println(password);
    }

    public void validar() {
        int mayus = 0;
        int minus = 0;
        int num = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 91 && password.charAt(i) <= 122) {
                minus++;
            } else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                mayus++;

            } else if (password.charAt(i) >= 48 && password.charAt(i) <= 64) {
                num++;
            }
        }
        if (num >= 5 && mayus >= 2 && minus <= 1) {
            System.out.println("es una contrasena segura");
        } else {
            System.out.println("no ees una contrasena segura");
        }
    }

}
