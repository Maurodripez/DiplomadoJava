public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("CDMX");
        ciudad.setPais("Mexico");
        ciudad.setPresidente("Peje");
        ciudad.setPoblacion(100);
        System.out.println(ciudad.getNombre());
        System.out.println(ciudad.getPais());
        System.out.println(ciudad.getPresidente());
        System.out.println(ciudad.getPoblacion());
    }
}
