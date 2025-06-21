import  java.util.ArrayList; // permite almacenar de forma dinamica
//es composicion no herencia
public class GeneroPelicula{
    private ArrayList  nombre;


    public GeneroPelicula(ArrayList nombre) {
        this.nombre = nombre;
    }

    public ArrayList getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }
}
