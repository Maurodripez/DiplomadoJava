public class Libro {
    String autor;
    String titulo;
    int paginas;
    int paginas2;

    public Libro(String autor, String titulo, int paginas, int paginas2) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.paginas2 = paginas2;
    }

    public void mostrarLibro() {
        System.out.println("el libro " + titulo + " del autor " + autor + " tiene " + paginas + " paginas");
    }

    public void compararLibros() {
        if (paginas > paginas2) {
            System.out.println("Demian es mas largo");
        } else {
            System.out.println("Siddhartha es mas largo");
        }
    }
}
