/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class ObjetoBuilder extends EntidadBuilder {
    public String tipo;
    public int peso;

    public ObjetoBuilder(Entidad entidad) {
        super(entidad);
    }

    public void definirEntidad(String nombre) {
        entidad.nombre=nombre;
    }

    public void definirAcciones() {
        Accion accion1 = new Accion("Brillar");
        entidad.acciones.add(accion1);
    }

    public void definirSprites() {
        entidad.acciones.get(0).agregarSprites("brillar.png");
    }

    public void definirCaracteristicas() {
        this.tipo = "Arma";
        this.peso = 50;
        // Settear características específicas del jugador
    }
}
