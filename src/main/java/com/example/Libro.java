package com.example;

public class Libro {
//atributo 
private String titulo; 
private String autor; 
private int paginas;

// constructores 


public Libro(){
    this.titulo="desconocido";
    this.autor="Anonimo";
    this.paginas= 0 ;
}

public Libro(String Titulo, String autor, int paginas){
    this.titulo= Titulo;
    this.autor= autor;
    this.paginas= paginas ;
}

public Libro(String Titulo, String autor){
    this.titulo= Titulo;
    this.autor= autor;
}

//metodos getter and setter 
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public int getPaginas() {
    return paginas;
}
public void setPaginas(int paginas) {
    this.paginas = paginas;
}



public String mostrarDetalles() {
    return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
}






 
}
