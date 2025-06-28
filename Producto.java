public class Producto {
    private Integer codigo;
    private String titulo;
    private double precio;
    public Producto(Integer codigo, String titulo, Double precio){
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}




