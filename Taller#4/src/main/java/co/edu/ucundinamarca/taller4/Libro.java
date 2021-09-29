
package co.edu.ucundinamarca.taller4;

public class Libro {
    
    private String Titulo;
    private String Autor;
    private String isbn;
    
    public Libro (String titulo, String autor, String isbn){
        this.Titulo = titulo;
        this.Autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
}
