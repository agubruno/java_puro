package com.kaitzen;

public class App 
{
    public static void main( String[] args )
    {
        Libro libro1 = new Libro();
        libro1.setAutor("nombreautor");
        libro1.setEditorial("editorial");
        
        libro1.prestamo("Martin");
        libro1.devolucion();
        
        Libro libro2 = new Libro("nombrelibro","nobreautor","nobreeditorial");

        libro2.prestamo("Malta");
        

        System.out.println(libro1 .ToString());
        System.out.println(libro2 .ToString());

    }
}
