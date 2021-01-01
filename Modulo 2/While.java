public class While {
    public static void main(String[] args) {
        While ejercicios = new While();
        ejercicios.InvertirPalabra();

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

}
