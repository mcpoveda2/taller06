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
public class Accion {
    private String nombre;
    private ArrayList<String> sprites = new ArrayList<>();

    //Constructor
    //Getters y Setters

    public void agregarSprites(String sprite) {
        sprites.add(sprite);
    }

}
