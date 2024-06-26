/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protaller06;

/**
 *
 * @author CltControl
 */
public class Enemigo extends Entidad {
    String tipo;
    int poder;

    @Override
    void agregarSprite() {
        // Implementación para agregar sprites específicos del enemigo
    }

    @Override
    void definirCaracteristicas() {
        // Implementación para definir las características específicas del enemigo
        tipo = "Goblin";
        poder = 30;
    }
}
