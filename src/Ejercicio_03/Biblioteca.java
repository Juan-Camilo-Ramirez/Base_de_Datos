package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> colección;

    public Biblioteca() {
        colección = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        colección.add(libro);
    }

    public void prestarLibro(String título) {
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

    public void devolverLibro(String título) {
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
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 =new Libro("La María", "Jorge Isaacs");

        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);

        miBiblioteca.prestarLibro("1984");
        miBiblioteca.devolverLibro("1984");

        miBiblioteca.buscarLibros("soledad");
        miBiblioteca.buscarLibros("María");
    }
}