/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.jugador;

import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.domain.Jugador;

/**
 *
 * @author Alejandro
 */
public interface ServicioJugador {
    Jugador InsertarJugador(String equipo);
    Jugador MostrarJugadoresCompletos(List<Jugador> jugadores);
    Jugador BuscarJugadores(List<Equipo> equipoList);
}
