public class Juego  extends  Producto{
    private String plataforma;
    private  String genero;


    public Juego(Integer codigo, String titulo, Double precio, String genero, String plataforma) {
        super(codigo,titulo,precio); //super se usa para l llamar
        this.genero = genero; //solo se puede con las clases hijas los metodos de clase abstract @overrid sobree escribe sobre escribiru un metodo no se instancian  estan obligada a que los hijos implementeb
        this.plataforma =plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
