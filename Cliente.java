
public class Cliente {

    private Integer codigo;
    private String documento;
    private String nombre;
    private String telefono;
    private String mail;

    public Cliente(Integer codigo, String documento, String nombre, String telefono, String mail) {
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;

    }

    public Integer getCodigo() {

        return codigo;

    }

    public void setCodigo(Integer codigo) {

        this.codigo = codigo;

    }

    public String getDocumento() {

        return documento;

    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}




