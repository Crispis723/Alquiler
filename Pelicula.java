
public class Pelicula extends Producto {

    private Integer duracion;
    private String idioma;
    private GeneroPelicula genero;

    public Pelicula (Integer duracion, String idioma, GeneroPelicula genero, Integer codigo, String titulo, double precio){
        super(codigo, titulo, precio);

        this.duracion = duracion;
        this.genero = genero;
        this.idioma = idioma;

    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGeneroPelicula(GeneroPelicula genero) {
        this.genero = genero;
    }
}





