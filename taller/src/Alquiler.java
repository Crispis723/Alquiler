import  java.time.LocalDate;

public class Alquiler {
    private  Cliente clienteAlquiler ; //objetos a partir clase por relacion de afrefacion
    private  Producto productoAlquiler;
    private  LocalDate fechaAlquiler;
    private  LocalDate fechaEntrega;
    private  boolean alquilado;

    public  Alquiler(Cliente clienteAlquiler,Producto productoAlquiler, LocalDate fechaAlquiler,LocalDate fechaEntrega,  boolean alquilado){
        this.clienteAlquiler=clienteAlquiler;
        this.producto= productoAlquiler;
        this.fechaAlquiler =fechaAlquiler;
        this.fechaEntrega=null;
        this.alquilado=true;

    }

    public Cliente getClienteAlquiler() {
        return clienteAlquiler;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Producto getProductoAlquiler() {
        return productoAlquiler;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }


    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public void setClienteAlquiler(Cliente clienteAlquiler) {
        this.clienteAlquiler = clienteAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setProductoAlquiler(Producto productoAlquiler) {
        this.productoAlquiler = productoAlquiler;
    }
}



