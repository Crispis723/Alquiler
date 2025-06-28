import java.util.ArrayList;
import java.util.List;

public class VideoClub {

 private static VideoClub instancia;


 private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Alquiler>  alquileres;


    private VideoClub(){

        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        alquileres = new ArrayList<>();

    }


    public static synchronized VideoClub getInstancia() {
        if (instancia == null) {
            instancia = new VideoClub();
        }
        return instancia;
    }

    public boolean agregarCliente(Cliente cliente){
        if (buscarCliente(cliente.getCodigo()) == null){

            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean modificarCliente(Cliente clienteActualizado){
        Cliente clienteExistente = buscarCliente(clienteActualizado.getCodigo());
        if (clienteExistente != null) {
            clienteExistente.setNombre(clienteActualizado.getNombre());
            clienteExistente.setDocumento(clienteActualizado.getDocumento());
            clienteExistente.setTelefono(clienteActualizado.getTelefono());
            clienteExistente.setMail(clienteActualizado.getMail());

            return true;
        }

    return false;
    }

    public boolean eliminarCliente(Integer codigo){
        return  clientes.removeIf(cliente -> cliente.getCodigo().equals(codigo));
    }

    public Cliente buscarCliente(Integer codigo){
        for (Cliente cliente : clientes){

            if (cliente.getCodigo().equals(codigo)){
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> getClientes() {
        return new ArrayList<>(clientes); // Devuelve una copia
    }


    public List<Cliente> mostrarClientes(String documento, String nombre){
        List<Cliente> resultados = new ArrayList<>();
        for (Cliente cliente : clientes){
            boolean matchDoc = (documento == null || documento.isEmpty() || cliente.getDocumento().contains(nombre.toLowerCase()));
                    boolean matchNombre = (nombre == null || nombre.isEmpty() || cliente.getNombre().toLowerCase().contains(nombre.toLowerCase()));
                            if (matchDoc && matchNombre){
                                resultados.add(cliente);
                            }
        }
        return resultados;
    }






























}
