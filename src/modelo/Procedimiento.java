/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ucoltis
 */
public class Procedimiento {

    //Atributos
    private int codigo;
    private String nombre;
    
    //Constructor vacio
    public Procedimiento() {
    }

    //Constructor
    public Procedimiento(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Métodos asesores 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
