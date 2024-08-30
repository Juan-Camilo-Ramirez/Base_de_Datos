//Java, Intelillij
package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> colección;

    public Biblioteca() {
        colección = new ArrayList<>();
    }

    public void agre_Libro(Libro libro) {
        colección.add(libro);
    }

    public void pres_Libro(String título) {
        for (Libro libro : colección) {
            if (libro.getTítulo().equalsIgnoreCase(título)) {
                if (libro.estáDisponible()) {
                    libro.marcarComoPrestado();
                    System.out.println("Libro prestado: " + libro.getTítulo());
                } else {
                    System.out.println("El libro no está disponible para préstamo.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado en la biblioteca.");
    }

    public void devol_Libro(String título) {
        for (Libro libro : colección) {
            if (libro.getTítulo().equalsIgnoreCase(título)) {
                if (!libro.estáDisponible()) {
                    libro.marcarComoDisponible();
                    System.out.println("Libro devuelto: " + libro.getTítulo());
                } else {
                    System.out.println("El libro ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado en la biblioteca.");
    }

    public void buscarLibros(String consulta) {
        System.out.println("Resultados de búsqueda:");
        for (Libro libro : colección) {
            if (libro.getTítulo().toLowerCase().contains(consulta.toLowerCase()) ||
                    libro.getAutor().toLowerCase().contains(consulta.toLowerCase())) {
                System.out.println("- Título: " + libro.getTítulo() +
                        ", Autor: " + libro.getAutor() +
                        ", Disponible: " + (libro.estáDisponible() ? "Sí" : "No"));
            }
        }
    }


    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El cantar del miocid", "Anonimo");
        Libro libro3 =new Libro("La María", "Jorge Isaacs");
        Libro libro4 =new Libro("Las estrellas son negras", "Arnoldo Palacios");
        Libro libro5 =new Libro("Fabulas y verdades", "Rafael Pombo");

        miBiblioteca.agre_Libro(libro1);
        miBiblioteca.agre_Libro(libro2);
        miBiblioteca.agre_Libro(libro3);
        miBiblioteca.agre_Libro(libro4);
        miBiblioteca.agre_Libro(libro5);

        miBiblioteca.pres_Libro("El Cantar del miocid");
        miBiblioteca.pres_Libro("Cien años de soledad");
        miBiblioteca.pres_Libro("La María");
        miBiblioteca.devol_Libro("El cantar del miocid");

        miBiblioteca.buscarLibros("soledad");
        miBiblioteca.buscarLibros("María");
        miBiblioteca.buscarLibros("Cantar");
        miBiblioteca.buscarLibros("estrellas");
        miBiblioteca.buscarLibros("fabulas");
    }
}