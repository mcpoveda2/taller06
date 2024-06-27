/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.protaller06;

import singleton.ConfiguracionJuego;

/**
 *
 * @author CltControl
 */
public class ProTaller06 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Codigo para uso del patron Singleton en el main
            ConfiguracionJuego config = ConfiguracionJuego.getInstancia();

            // Configurar el juego según la configuración
            System.out.println("Dimensiones de pantalla: " + config.getDimensionesPantalla());
            System.out.println("Memoria RAM mínima: " + config.getMemoriaRAMMinima() + " MB");
            System.out.println("Espacio en disco mínimo: " + config.getEspacioDiscoMinimo() + " MB");

            // Ejemplo de cambiar la configuración
            config.setDimensionesPantalla("2560x1440");
            config.setMemoriaRAMMinima(4096);
            config.setEspacioDiscoMinimo(20480);

            // Mostrar la nueva configuración
            System.out.println("Nueva configuración:");
            System.out.println("Dimensiones de pantalla: " + config.getDimensionesPantalla());
            System.out.println("Memoria RAM mínima: " + config.getMemoriaRAMMinima() + " MB");
            System.out.println("Espacio en disco mínimo: " + config.getEspacioDiscoMinimo() + " MB");
        
    }
}
