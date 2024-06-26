/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protaller06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public abstract class Entidad {
    String nombre;
    List<String> acciones = new ArrayList<>();

    void addAccion(String accion) {
        acciones.add(accion);
    }

    abstract void agregarSprite();
    abstract void definirCaracteristicas();
}