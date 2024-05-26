/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ucoltis
 */
public class Mascota {
    
    //Atributos
    private int codigo;
    private String nombreResponsable;
    private String nombreMascota;
    private String raza;
    private String numeroContacto;
    private ArrayList<Historial> historials;
    
    //Constructor que inicializa muestra lista, que se utilizará para almacenar los historiales de las mascotas.
    public Mascota() {
        historials = new ArrayList();
    }
    
    //Contructor
    public Mascota(int codigo, String nombreResponsable, String nombreMascota, String raza, 
            String numeroContacto, ArrayList<Historial> historials) {
        this.codigo = codigo;
        this.nombreResponsable = nombreResponsable;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.numeroContacto = numeroContacto;
        this.historials = historials;
    }
    
    //Métodos asesores 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public ArrayList<Historial> getHistorials() {
        return historials;
    }

    public void setHistorials(ArrayList<Historial> historials) {
        this.historials = historials;
    }
    
    
}
