/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author noelia
 */
public final class Musica extends Producto {
    
    private String grupo;

    public Musica(String grupo, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public Musica() {
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musica{");
        sb.append("grupo=").append(grupo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
