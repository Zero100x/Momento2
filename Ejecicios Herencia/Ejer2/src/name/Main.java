package name;

import java.util.Scanner;


class Nombre {
 protected String nombre;
 protected String primerApellido;
 protected String segundoApellido;

 // Constructor
 public Nombre(String nombre, String primerApellido, String segundoApellido) {
     this.nombre = nombre;
     this.primerApellido = primerApellido;
     this.segundoApellido = segundoApellido;
 }


 public void Leer_nombre() {
     Scanner input = new Scanner(System.in);
     System.out.print("Ingrese el nombre: ");
     nombre = input.nextLine();
     System.out.print("Ingrese el primer apellido: ");
     primerApellido = input.nextLine();
     System.out.print("Ingrese el segundo apellido: ");
     segundoApellido = input.nextLine();
 }


 public void mostrar() {
     System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
 }
}


class Direccion extends Nombre {
 private String calle;
 private String ciudad;
 private String provincia;
 private String codigoPostal;

 // Constructor
 public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, String codigoPostal) {
     super(nombre, primerApellido, segundoApellido); 
     this.calle = calle;
     this.ciudad = ciudad;
     this.provincia = provincia;
     this.codigoPostal = codigoPostal;
 }


 public void nueva_direccion() {
     Scanner input = new Scanner(System.in);
     System.out.print("Ingrese la calle: ");
     calle = input.nextLine();
     System.out.print("Ingrese la ciudad: ");
     ciudad = input.nextLine();
     System.out.print("Ingrese la provincia: ");
     provincia = input.nextLine();
     System.out.print("Ingrese el código postal: ");
     codigoPostal = input.nextLine();
 }


 public void nuevo_nombre() {
     Leer_nombre();
 }


 @Override
 public void mostrar() {
     super.mostrar();  
     System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
 }
}


public class Main {
 public static void main(String[] args) {

     Direccion direccion = new Direccion("", "", "", "", "", "", "");

 
     direccion.nueva_direccion();
     direccion.nuevo_nombre();

   
     direccion.mostrar();  
 }
}
