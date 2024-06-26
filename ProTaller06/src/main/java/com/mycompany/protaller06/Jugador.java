/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protaller06;

/**
 *
 * @author CltControl
 */
public class Jugador extends Entidad {
    int vida;
    int fuerza;

    @Override
    void agregarSprite() {
        // Implementación para agregar sprites específicos del jugador
    }

    @Override
    void definirCaracteristicas() {
        // Implementación para definir las características específicas del jugador
        vida = 100;
        fuerza = 50;
    }
}
