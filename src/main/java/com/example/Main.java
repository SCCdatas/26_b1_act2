package com.example;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro(); 
        l1.mostrarDetalles(); // Salida esperada con valores por defecto

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

      

        System.out.println(l1.mostrarDetalles());
        System.out.println(l2.mostrarDetalles());
        System.out.println(l3.mostrarDetalles());


        
    } 


    
}