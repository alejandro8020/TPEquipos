/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.salidaArchivos;

import java.io.IOException;
import java.util.List;
import trabajoPractico.domain.Jugador;

public interface OutPutFileService {
    void exportJugadores(List<Jugador> jugadores, String rutaDeDestino);    
}
