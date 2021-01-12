public class Main {
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        System.out.println("Registrando nuevos contactos");
        agenda.registrarContacto();
        System.out.println("Registro exitoso");
        System.out.println("estos son todos los contactos");
        agenda.listarContactos();
        agenda.buscarContacto();
        agenda.disponibles();
    }
}