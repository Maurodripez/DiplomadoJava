public class Main {
    public static void main(String[] arg) {

        Casa casa1 = new Casa("CDMX", "Tepito", "obra negra");
        Casa casa2 = new Casa("Chimalhuacan", "Tostado", 1);
        Casa casa3 = new Casa(2, 3, 2, 4);
        System.out.println(casa1.getCiudad());
        System.out.println(casa1.getBarrio());
        System.out.println(casa1.getColor());
        System.out.println(casa2.getCiudad());
        System.out.println(casa2.getBarrio());
        System.out.println(casa2.getPisos());
        System.out.println(casa3.getPisos());
        System.out.println(casa3.getHabitaciones());
        System.out.println(casa3.getBanos());
        System.out.println(casa3.getCocinas());
    }
}
