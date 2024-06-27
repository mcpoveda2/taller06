/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author Zambrano
 */
public class ConfiguracionJuego {
      // Atributos privados
    private String dimensionesPantalla;
    private int memoriaRAMMinima;
    private int espacioDiscoMinimo;

    // Instancia única de la clase
    private static ConfiguracionJuego instancia;

    // Constructor privado para evitar la instanciación directa
    private ConfiguracionJuego() {
        // Inicialización por defecto
        dimensionesPantalla = "1920x1080";
        memoriaRAMMinima = 2048; // En MB
        espacioDiscoMinimo = 10240; // En MB
    }

    // Método estático para obtener la única instancia de la clase
    public static ConfiguracionJuego getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionJuego();
        }
        return instancia;
    }

    // Métodos getters y setters para los atributos
    public String getDimensionesPantalla() {
        return dimensionesPantalla;
    }

    public void setDimensionesPantalla(String dimensiones) {
        this.dimensionesPantalla = dimensiones;
    }

    public int getMemoriaRAMMinima() {
        return memoriaRAMMinima;
    }

    public void setMemoriaRAMMinima(int ram) {
        this.memoriaRAMMinima = ram;
    }

    public int getEspacioDiscoMinimo() {
        return espacioDiscoMinimo;
    }

    public void setEspacioDiscoMinimo(int espacio) {
        this.espacioDiscoMinimo = espacio;
    }
}
