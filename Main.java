public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de gestion de video club ===");


        //1. el controlador obtiene la instancia unica de VideoClub

        VideoClub miVideoClub = VideoClub.getInstancia();

        //4.crear y agregar clientes

        System.out.println("\n--- Agregando Clientes ---");
        Cliente cliente1 = new Cliente(1,"12312323A","Juan Perez","555-1234", "juan.perez@gmail.com");
        Cliente cliente2 = new Cliente(2, "3923182B", "Ana Garcia", "555-5678", "ana.garcia@gmail.com");
        miVideoClub.agregarCliente(cliente1);
        miVideoClub.agregarCliente(cliente2);


        System.out.println("Cliente registrados:");
        miVideoClub.getClientes().forEach(System.out::println);

        //5.Modificar un cliente
        System.out.println("\n--- Modificar un cliente ---");
        Cliente clienteModificado = new Cliente(1, "12312323A", "Juan Perez", "555-1234", "juan.perez@gmail.com");
        miVideoClub.modificarCliente(clienteModificado);
        System.out.println("Cliente con codigo 1 despues de la modificacion:");
        System.out.println(miVideoClub.buscarCliente(1));


        //6.Buscar un cliente por nombre

        System.out.println("\n--- Buscando clientes por nombre 'Ana' ---");
        miVideoClub.mostrarClientes("", "Ana").forEach(System.out::println);


    }
}