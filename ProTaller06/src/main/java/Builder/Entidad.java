/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.util.ArrayList;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class Entidad {
    private String nombre;
    private ArrayList<Accion> acciones = new ArrayList<>();

    //Getters y Setters
    public void dibujar() {
        System.out.println("Dibujando entidad " + nombre);
        //Logica de dibujar
    }

    public void actualizar() {
        System.out.println("Actualizando entidad " + nombre);
        //Logica de actualizar
    }

}
