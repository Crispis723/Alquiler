public class Cliente {
    private Integer codigo;
    private String documento;
    private String nombre;
    private String telefono;
    private String email;



    //Constructor get, obtener , set, cambiar
    public void Cliente(Integer codigo, String  documento, String  nombre, String  telefono , String  email){
        this.codigo = codigo; // el nombre del atributo  = parametro de constructor
        this.documento = documento;
        this.nombre = nombre;
        this.telefono= telefono;
        this.email=email;

    }

    public Integer getCodigo() {
        return codigo; // para inicializar la varibale
    }

    public void setCodigo(Integer codigo){
       this.codigo   = codigo; //set para modificarlo osea signarle valor
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


