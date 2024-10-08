package libreria;

public class Libro extends Publicacion {
 private int numPaginas;
 private int anioPublicacion;

 // Constructor
 public Libro(String titulo, float precio, int numPaginas, int anioPublicacion) {
     super(titulo, precio);
     this.numPaginas = numPaginas;
     this.anioPublicacion = anioPublicacion;
 }


 @Override
 public void mostrar() {
     super.mostrar(); 
     System.out.println("Número de Páginas: " + numPaginas);
     System.out.println("Año de Publicación: " + anioPublicacion);
 }
}
