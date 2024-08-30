//Java, Intelillij
package Ejercicio_03;

class Libro {
    private String título;
    private String autor;
    private boolean disponible;

    public Libro(String título, String autor) {
        this.título = título;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estáDisponible() {
        return disponible;
    }

    public void marcarComoPrestado() {
        disponible = false;
    }

    public void marcarComoDisponible() {
        disponible = true;
    }
}
