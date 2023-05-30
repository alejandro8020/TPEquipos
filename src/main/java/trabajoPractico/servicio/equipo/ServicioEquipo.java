/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.equipo;

import java.util.List;
import trabajoPractico.domain.Equipo;

/**
 *
 * @author Alejandro
 */
public interface  ServicioEquipo {
    Equipo crearEquipo();
    Equipo crearEquipoConintegrantes();
    Equipo MostrarEquipoCompletos(List<Equipo> equipos);
    Equipo BuscarEquipo(List<Equipo> equipoList);
    Equipo BuscarEquipoCompleto(List<Equipo> equipoList);
    List<Equipo> EliminarEquipoCompleto(List<Equipo> equipoList);
    Equipo crearEquipoConArchivo();
    
}

