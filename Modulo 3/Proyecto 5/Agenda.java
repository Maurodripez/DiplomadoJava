public class Agenda {
    Contacto contacto1 = new Contacto();
    Contacto contacto2 = new Contacto();

    public void registrarContacto() {
        contacto1.setNombre("Pedro");
        contacto1.setNumero(55442599);
        contacto2.setNombre("Pablo");
        contacto2.setNumero(55442599);
    }

    public void listarContactos() {
        System.out.println(contacto1.getNombre());
        System.out.println(contacto1.getNumero());
        System.out.println(contacto2.getNombre());
        System.out.println(contacto2.getNumero());
    }

    public void buscarContacto() {
        System.out.println("buscando a Pablo");
        System.out.println(contacto2.getNombre());
        System.out.println(contacto2.getNumero());
    }

    public void disponibles() {
        System.out.println("estos son los contactos disponibles");
        System.out.println(contacto1.getNombre());
        System.out.println(contacto1.getNumero());
        System.out.println(contacto2.getNombre());
        System.out.println(contacto2.getNumero());
    }
}
