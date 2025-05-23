package org.example.part3_dsa_collections.map;

public class Book {

    private String titlu;
    private String autor;
    public int an;

    public Book(String titlu, String autor, int an) {
        this.titlu = titlu;
        this.autor = autor;
        this.an = an;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAn() {
        return an;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", an=" + an +
                '}';
    }
}
