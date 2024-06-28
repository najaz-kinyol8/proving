
package spotify_project;

/**
 *
 * @author FAbi  
 */
public class Spotify_Project {
    // Clase interna Cancion
    public static class Cancion {
        // Atributos de la clase Cancion: Estas son las propiedades(caracterisiticas de una clase) de cada objeto de la clase Cancion
        private int idDeLaCancion;
        private String titulo;
        private String autor;
        private int duracion;
        private int anoDeCreacion;

        // Constructor de la clase Cancion: Se usa para inicializar los atributos cuando se crea un nuevo objeto Cancion
        public Cancion(int idDeLaCancion, String titulo, String autor, int duracion, int anoDeCreacion) {
            this.idDeLaCancion = idDeLaCancion;
            this.titulo = titulo;
            this.autor = autor;
            this.duracion = duracion;
            this.anoDeCreacion = anoDeCreacion;
        }

        /* Metodos getters: Permiten obtener los valores de los atributos de un objeto Cancion.
           Retorna valor, no necesita parametros      */
        public int getIdDeLaCancion() {
            return idDeLaCancion;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getDuracion() {
            return duracion;
        }

        public int getAnoDeCreacion() {
            return anoDeCreacion;
        }

        /* Metodos setters: Permiten modificar los valores de los atributos de un objeto Cancion
           siempre pide valor como parametro para guardarlo en el atributo correspondiente, no retorna valor      */       
        public void setIdDeLaCancion(int idDeLaCancion) {
            this.idDeLaCancion = idDeLaCancion;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public void setAnoDeCreacion(int anoDeCreacion) {
            this.anoDeCreacion = anoDeCreacion;
        }
    }

    // Metodo principal del programa
    public static void main(String[] args) {
        // Instanciación de objetos: Crear objetos de la clase Cancion usando el constructor
        Cancion cancion1 = new Cancion(1, "Billie Jean", "Michael Jackson", 273, 1982);
        Cancion cancion2 = new Cancion(2, "jefe de jefes", "Los tigres del norte", 202, 2015);

        // Uso de getters para obtener y mostrar la informacion de los objetos
        mostrarInformacionCancion(cancion1);
        mostrarInformacionCancion(cancion2);

        // Modificacion de los atributos de los objetos usando setters
        cancion1.setTitulo("bad");
        cancion2.setDuracion(210);

        // Mostrar la informacion modificada de los objetos
        System.out.println("\nInformación modificada de las canciones:");
        mostrarInformacionCancion(cancion1);
        mostrarInformacionCancion(cancion2);
    }

    // Metodo auxiliar para mostrar la informacioin de una cancion
    public static void mostrarInformacionCancion(Cancion cancion) {
        System.out.println("ID: " + cancion.getIdDeLaCancion());
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duracion: " + cancion.getDuracion() + " segundos");
        System.out.println("Año de Creación: " + cancion.getAnoDeCreacion());
        System.out.println();
    }
}