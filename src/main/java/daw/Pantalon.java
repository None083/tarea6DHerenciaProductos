/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public final class Pantalon extends Ropa {
    
    private String talla;

    public Pantalon(String talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public Pantalon() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El producto de Ropa tipo pantalón de talla " 
                + this.talla + " está listo para enviar a " + direccion);
    }

}
