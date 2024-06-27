/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public abstract class EntidadBuilder {
    protected Entidad entidad;

    public Entidad getEntidad() {
        return entidad;
    }

    

    public abstract void definirEntidad(String nombre);
    public abstract void definirAcciones();
    public abstract void definirSprites();
    public abstract void definirCaracteristicas();

}
