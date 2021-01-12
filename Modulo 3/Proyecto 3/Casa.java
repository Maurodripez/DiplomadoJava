public class Casa {
    private String ciudad = "CDMX";
    private String barrio = "Tlalpan";
    private String color = "Amarilla";
    private int pisos = 1;
    private int habitaciones = 3;
    private int banos = 1;
    private int cocinas = 1;

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public int getPisos() {
        return pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public int getCocinas() {
        return cocinas;
    }

    public Casa(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    public Casa(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    public Casa(int pisos, int habitaciones, int banos, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
    }
}
