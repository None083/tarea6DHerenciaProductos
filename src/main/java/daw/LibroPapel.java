/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public LibroPapel() {
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("LibroPapel{");
        sb.append("numPaginas=").append(numPaginas);
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El producto de Libro tipo LibroPapel "
                + this.getDescripcion() + " está listo para enviar a " + direccion);
    }
    
    @Override
    public void leer() {
        System.out.println("Abres el libro de papel para comenzar a leer");
    }

}
