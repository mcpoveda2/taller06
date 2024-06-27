/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class EntidadDirector {
    private EntidadBuilder builder;

    public EntidadDirector(EntidadBuilder builder) {
        this.builder = builder;
    }

    public void construirEntidad(String nombre) {
        builder.definirEntidad(nombre);
        builder.definirAcciones();
        builder.definirSprites();
        builder.definirCaracteristicas();
    }

    public Entidad getEntidad() {
        return builder.getEntidad();
    }

}
