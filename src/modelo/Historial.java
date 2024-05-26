/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ucoltis
 */
public class Historial {

    //Atributos
    private int codigo;
    private String descripcion;
    private Procedimiento Procedimientos;

    //Constructor que inicializa muestra lista, que se utilizará para almacenar los procedimientos de las mascotas.
    public Historial() {
        Procedimientos = new Procedimiento();
    }

    //Contructor
    public Historial(int codigo, String descripcion, Procedimiento Procedimientos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.Procedimientos = Procedimientos;
    }

    //Métodos asesores 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Procedimiento getProcedimientos() {
        return Procedimientos;
    }

    public void setProcedimientos(Procedimiento Procedimientos) {
        this.Procedimientos = Procedimientos;
    }
    
}
