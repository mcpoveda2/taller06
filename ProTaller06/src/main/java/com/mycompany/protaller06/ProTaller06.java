/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.protaller06;

import Builder.*;

/**
 *
 * @author CltControl
 */
public class ProTaller06 {

    public static void main(String[] args) {
        EntidadBuilder builder = new JugadorBuilder();
        EntidadDirector director = new EntidadDirector(builder);

        director.construirEntidad("Jugador1");
        Entidad jugador = director.getEntidad();

        jugador.dibujar();
        jugador.actualizar();

    }
}
