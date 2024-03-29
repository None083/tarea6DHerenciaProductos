/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noeliaNewClass
 */
public abstract class Ropa extends Producto implements SeEnvia {
    
    private String marca;

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public Ropa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ropa{");
        sb.append("marca=").append(marca + " ");
        return sb.toString();
    }
    
    @Override
    public void enviar(String direccion) {
        System.out.println("El producto de la marca " + this.marca 
                + " está listo para enviar a " + direccion);
    }
    
}
