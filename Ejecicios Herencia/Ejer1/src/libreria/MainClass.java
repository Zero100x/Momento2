package libreria;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de páginas: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Año de publicación: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine();  

        Libro libro = new Libro(tituloLibro, precioLibro, numPaginas, anioPublicacion);

        System.out.println("Ingrese los datos del disco:");
        System.out.print("Título: ");
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración (en minutos): ");
        float duracion = scanner.nextFloat();

        Disco disco = new Disco(tituloDisco, precioDisco, duracion);

        System.out.println("\nDatos del libro:");
        libro.mostrar();

        System.out.println("\nDatos del disco:");
        disco.mostrar();

        scanner.close();
    }
}

