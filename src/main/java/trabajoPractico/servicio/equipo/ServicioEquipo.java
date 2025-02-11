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
    Equipo mostrarEquipoCompletos(List<Equipo> equipos);
    Equipo buscarEquipo(List<Equipo> equipoList);
    Equipo buscarEquipoCompleto(List<Equipo> equipoList);
    List<Equipo> eliminarEquipoCompleto(List<Equipo> equipoList);
    Equipo crearEquipoConArchivo();
    
}

