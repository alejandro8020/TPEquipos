/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Jugador extends Persona {

    private double altura;
    private String posicion;
    private int cantidadGoles;
    private int cantidadPartidos;
    private boolean esCapitan;
    private int numeroCamiseta;
    //private List<Equipo> equipo = new ArrayList<>();
    private String nomEquipo;

    public Jugador(String nombre, String apellido, double altura, String posicion, int cantidadGoles, int cantidadPartidos, boolean esCapitan, int numeroCamiseta, String nomEquipo) {
        this.altura = altura;
        this.posicion = posicion;
        this.cantidadGoles = cantidadGoles;
        this.cantidadPartidos = cantidadPartidos;
        this.esCapitan = esCapitan;
        this.numeroCamiseta = numeroCamiseta;
        this.nomEquipo = nomEquipo;
        super.nombre = nombre;
        super.apellido = apellido;
    }
    public Jugador(){};
    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the cantidadGoles
     */
    public int getCantidadGoles() {
        return cantidadGoles;
    }

    /**
     * @param cantidadGoles the cantidadGoles to set
     */
    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    /**
     * @return the cantidadPartidos
     */
    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    /**
     * @param cantidadPartidos the cantidadPartidos to set
     */
    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    /**
     * @return the esCapitan
     */
    public boolean isEsCapitan() {
        return esCapitan;
    }

    /**
     * @param esCapitan the esCapitan to set
     */
    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    /**
     * @return the numeroCamiseta
     */
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    /**
     * @param numeroCamiseta the numeroCamiseta to set
     */
    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    /**
     * @return the nomEquipo
     */
    public String getNomEquipo() {
        return nomEquipo;
    }

    /**
     * @param nomEquipo the nomEquipo to set
     */
    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +  " Nombre=" + super.nombre + " Apellido=" + super.apellido + "altura=" + altura + ", posicion=" + posicion + ", cantidadGoles=" + cantidadGoles + ", cantidadPartidos=" + cantidadPartidos + ", es Capitan=" + esCapitan + ", numeroCamiseta=" + numeroCamiseta + ", nomEquipo=" + nomEquipo + '}';
    }

}
