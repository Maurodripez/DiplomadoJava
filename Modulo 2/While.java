public class While {
    public static void main(String[] args) {
        While ejercicios = new While();
        // ejercicios.InvertirPalabra();
        // ejercicios.Palindroma();
        // ejercicios.ConteoVocales();
        ejercicios.Sucesion();

    }

    public void InvertirPalabra() {
        String palabra = "Programacion";
        String invertida = "";
        int cont = palabra.length() - 1;
        while (cont >= 0) {
            invertida = invertida + palabra.charAt(cont);
            cont--;
        }
        System.out.println(invertida);
    }

    public void Palindroma() {
        String palabra = "ana";
        String invertida = "";
        int cont = palabra.length() - 1;
        while (cont >= 0) {
            invertida = invertida + palabra.charAt(cont);
            cont--;
        }
        // el equals se utiliza para comparar cadenas
        if (invertida.equals(palabra)) {
            System.out.println("la palabra " + invertida + " si es un palindromo");
        }
    }

    public void ConteoVocales() {
        String frase = "Porta fames dis aenean platea neque semper? Conubia eleifend"
                + "commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer"
                + "purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis"
                + "scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra"
                + "fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam"
                + "maecenas elit cum.";
        int vocales = 0;
        int aux = frase.length() - 1;
        while (aux >= 0) {
            if (frase.charAt(aux) == 'a' || frase.charAt(aux) == 'e' || frase.charAt(aux) == 'i'
                    || frase.charAt(aux) == 'o' || frase.charAt(aux) == 'u') {
                vocales++;
            }
            aux--;
        }
        System.out.println("la cantidad de vocales en la frase son: " + vocales);

    }

    public void Sucesion() {
        int once = 11;
        int cont = 0;
        System.out.println("la sucesion es");
        while (cont <= 25) {
            System.out.println(once);
            once = once + 11;
            cont++;
        }
    }

}
