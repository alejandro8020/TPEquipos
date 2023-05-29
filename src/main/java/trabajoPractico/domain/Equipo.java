/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Equipo {
    private String nombreEquipo;
    private LocalDateTime fechaCreacion;   
    private List<Jugador> equipo = new ArrayList<>();
    private Tecnico entrenador = new Tecnico();
   // private List<Tecnico> entrenador = new ArrayList<>();

    public Equipo(){
    }

    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the fechaCreacion
     */
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


   /**
     * @return the equipo
     */
    public List<Jugador> getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(List<Jugador> equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the entrenador

    public List<Tecnico> getEntrenador() {
        return entrenador;
    }


     * @param entrenador the entrenador to set
    
    public void setEntrenador(List<Tecnico> entrenador) {
        this.entrenador = entrenador;
    }
     */
    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", fechaCreacion=" + fechaCreacion + ", equipo=" + equipo + ", entrenador=" + getEntrenador() + '}';
    }

    /**
     * @return the entrenador
     */
    public Tecnico getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Tecnico entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the entrenador
     */

    
    
}
