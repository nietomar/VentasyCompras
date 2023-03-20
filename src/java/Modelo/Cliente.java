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
public class Cliente {
    
    Cliente client;
    ArrayList arrayCliente=new ArrayList();
    Producto objProducto=new Producto();
    
    
    ArrayList<Producto> arrayproductos=new ArrayList();
    ArrayList<Producto> arrayItem=new ArrayList();
    Iterator <Producto> iterador=arrayproductos.iterator();
    

    private String nombre;
    private double telefono;
    private String correo;
    


    public Cliente() {
    }
    
    
    
    public Cliente(String nombre, double telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public ArrayList getArrayCliente() {
        return arrayCliente;
    }

    public void setArrayCliente(ArrayList arrayCliente) {
        this.arrayCliente = arrayCliente;
    }

    public ArrayList<Producto> getArrayproductos() {
        return arrayproductos;
    }

    public void setArrayproductos(ArrayList<Producto> arrayproductos) {
        this.arrayproductos = arrayproductos;
    }

    public ArrayList<Producto> getArrayItem() {
        return arrayItem;
    }

    public void setArrayItem(ArrayList<Producto> arrayItem) {
        this.arrayItem = arrayItem;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    
    
    
    public void registrarCliente(String nombre, double telefono, String correo){
        client=new Cliente(nombre,telefono,correo);
        arrayCliente.add(client);
    }
        
    public void registrarProducto(String nombre, float precio, int cantidad){
        objProducto=new Producto(nombre, precio, cantidad);
        arrayproductos.add(objProducto);
    }
    
    public void comprarProducto(String nombre, int cantidad){
        while (iterador.hasNext()){
        objProducto=iterador.next();
        if (nombre.equalsIgnoreCase(objProducto.getNombre()))
            {
            if (objProducto.getExistencia()<cantidad){
                
                }
                else{
                float precio=(float)objProducto.getPrecio();
                objProducto.setExistencia(objProducto.getExistencia()-cantidad);
                objProducto=new Producto(nombre, precio, cantidad);
                arrayItem.add(objProducto);
                }
            } 
        }    
    
    }
    public void venderProducto(String nombre, int cantidad){
        while(iterador.hasNext()){
            objProducto=iterador.next();
            if(nombre.equals(objProducto.getNombre())){
                objProducto.setExistencia(objProducto.getExistencia()+cantidad);
            }        
        }
    }
}
