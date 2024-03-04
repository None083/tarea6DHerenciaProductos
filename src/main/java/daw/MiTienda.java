/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author noelia
 */
public class MiTienda {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        //Productos
        Producto pantalon1 = new Pantalon("L", "Zara", "12345",
                25.99, 1.21, "Vaqueros rectos"); //conversion implícita
        Ropa pantalon2 = new Pantalon("M", "Pull&Bear", "67891",
                19.99, 1.21, "Flare jeans"); //conversion implícita

        Musica musica1 = new Musica("Black Keys", "45678",
                15.99, 1.21, "Dropout Boogie");
        Producto musica2 = new Musica("Dolores Forever", "78945",
                18.99, 1.21, "Somday Best"); //conversion implícita

        Libro libro1 = new LibroPapel(320, "12345678", "56128",
                9.99, 1.10, "Rechicero"); //conversion implícita
        LibroPapel libro2 = new LibroPapel(360, "78952146", "71593",
                7.99, 1.10, "Matilda");
        LibroDigital libro3 = new LibroDigital(600, "45612589", "74125",
                9.49, 1.10, "Alas de sangre");
        Producto libro4 = new LibroDigital(520, "75689412", "85264",
                8, 1.10, "Las brujas de viaje"); //conversion implícita

        listaProductos.add(pantalon1);
        listaProductos.add(pantalon2);
        listaProductos.add(musica1);
        listaProductos.add(musica2);
        listaProductos.add(libro1);
        listaProductos.add(libro2);
        listaProductos.add(libro3);
        listaProductos.add(libro4);

        //Mostrar productos
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------------");

        //Ordenación por precio utilizando comparator
        Comparator<Producto> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        Collections.sort(listaProductos, criterioPrecio);

        for (Producto p : listaProductos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------------");

        //Ordenación por codigo utilizando comparator
        Comparator<Producto> criterioCodigo = (p1, p2) -> p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
        Collections.sort(listaProductos, criterioCodigo);
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------------");

        //Búsqueda binaria
        System.out.println("Búsqueda de libro existente: "
                + Collections.binarySearch(listaProductos, libro4, criterioCodigo));
        System.out.println("Búsqueda de libro no existente: "
                + Collections.binarySearch(listaProductos,
                        new LibroDigital(0, "", "12", 0, 0, ""),
                        criterioCodigo));
        System.out.println("-----------------------------------------------");
        
        //Guardar libros en lista de libros
        List<Libro> listaLibros = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p); //conversion explícita
            }
        }
        
        //Mostrar lista con iterator
        Iterator<Libro> iterador = listaLibros.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        System.out.println("-----------------------------------------------");
        
        //Ordenar con comparable
        Collections.sort(listaLibros);
        for (Libro l : listaLibros) {
            System.out.println(l);
        }
        System.out.println("-----------------------------------------------");
        
        //Imprimir método descargar o enviar
        for (Libro l : listaLibros) {
            if(l instanceof LibroPapel){
                ((LibroPapel) l).enviar("Calle Manzanito, 2"); //conversion explícita
            }
            if(l instanceof LibroDigital){
                ((LibroDigital) l).descargar(); //conversion explícita
            }
        }
        System.out.println("-----------------------------------------------");
        
        System.out.println("Contiene la lista de productos musica1? " + listaProductos.contains(musica1));
        System.out.println("Contiene la lista de libros musica1? " + listaLibros.contains(musica1));
        System.out.println("-----------------------------------------------");
        
        //Guardar productos SeEnvia
        List<SeEnvia> listaSeEnvia = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaSeEnvia.add((SeEnvia) p); //conversion explícita
            }
        }
        
        //Imprimir método interfaz SeEnvia
        for (SeEnvia s : listaSeEnvia) {
            s.enviar("Calle Manzanares, 3");
        }
        System.out.println("-----------------------------------------------");
        
        //Imprimir método abstacto leer
        for (Libro l : listaLibros) {
            l.leer();
        }
        
    }
}
