/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Producto {
    private String nombre;
    private double precio;
    private int existencia;
    
    
    public Producto() {
    }

    public Producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    ArrayList<Producto> arrayproductos=new ArrayList();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    


}
