/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.domain;

/**
 *
 * @author Alejandro
 */
public class Tecnico extends Persona{
    private int edad;

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Tecnico{" +  " Nombre=" + super.nombre + " Apellido=" + super.apellido + " edad=" + edad + '}';
    }
    
}
