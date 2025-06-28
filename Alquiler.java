import java.time.LocalDate;


public class Alquiler {
    private Cliente clienteAlquiler;
    private Producto productoAlquiler;
    private LocalDate fechaEntrega;
    private LocalDate fechaAlquiler;
    private boolean alquilado;



    public Alquiler(Cliente clienteAlquiler, Producto productoAlquiler,LocalDate fechaEntrga, LocalDate fechaAlquiler, boolean alquilado) {
        this.clienteAlquiler = clienteAlquiler;
        this.productoAlquiler = productoAlquiler;
        this.fechaEntrega = fechaEntrga;
        this.fechaAlquiler = fechaAlquiler;
        this.alquilado = alquilado;

    }
    public Cliente getClienteAlquiler(){

        return clienteAlquiler;

    }

    public void setClienteAlquiler(Cliente clienteAlquiler) {


        this.clienteAlquiler = clienteAlquiler;

    }

    public Producto getProductoAlquiler() {
        return productoAlquiler;
    }

    public void setProductoAlquiler(Producto productoAlquiler) {
        this.productoAlquiler = productoAlquiler;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean getalquilado(boolean alquilado) {
        return alquilado;
    }

    public void setalquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
}


