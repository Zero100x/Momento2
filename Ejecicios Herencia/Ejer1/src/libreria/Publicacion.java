package libreria;


public class Publicacion {
 protected String titulo;
 protected float precio;

 // Constructor
 public Publicacion(String titulo, float precio) {
     this.titulo = titulo;
     this.precio = precio;
 }


 public void mostrar() {
     System.out.println("Título: " + titulo);
     System.out.println("Precio: " + precio);
 }
}
