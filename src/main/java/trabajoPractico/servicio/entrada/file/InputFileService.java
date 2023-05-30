/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.entrada.file;

/**
 *
 * @author Alejandro
 */
import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.domain.Jugador;

public interface InputFileService {

    //Cargar productos por archivo
    List<Jugador> cargarJugadoresPorArchivo(String rutaArchivo, Equipo equipo);
}