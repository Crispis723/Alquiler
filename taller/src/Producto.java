public abstract class Producto{
    //
    private  Integer codigo;
    private  String titulo;
    private  Double precio;

    public Producto(Integer codigo, String titulo, Double precio){
        this.codigo=codigo;
        this.titulo=titulo;
        this.precio=precio;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
