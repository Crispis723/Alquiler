public class Juego extends Producto {


        private String plataforma;
        private String genero;


    public Juego(String plataforma, String genero, Integer codigo, String titulo, Double precio) {
            super(codigo, titulo, precio);
            this.plataforma = plataforma;
            this.genero = genero;
        }

        public String getPlataforma () {
            return plataforma;
        }

        public void setPlataforma (String plataforma){
            this.plataforma = plataforma;
        }

        public String getGenero () {
            return genero;
        }

        public void setGenero (String genero){
            this.genero = genero;
        }
    }




