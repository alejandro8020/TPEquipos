/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.equipo.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.domain.Jugador;
import trabajoPractico.servicio.entrada.console.impl.InputService;
import trabajoPractico.servicio.equipo.ServicioEquipo;
import trabajoPractico.servicio.jugador.ServicioJugador;
import trabajoPractico.servicio.jugador.impl.ServicioJugadorImpl;
import trabajoPractico.servicio.tecnico.ServicioTecnico;
import trabajoPractico.servicio.tecnico.impl.ServicioTecnicoImpl;


/**
 *
 * @author Alejandro
 */
public class ServicioEquipoImpl implements ServicioEquipo{
    private final ServicioJugador servicioJugador = new ServicioJugadorImpl();
    private final ServicioTecnico servicioTecnico = new ServicioTecnicoImpl();
    
    @Override
    public Equipo crearEquipo() {
        Equipo equipoNuevo = new Equipo();
        System.out.println("INGRESE EL NOMBRE DEL EQUIPO : ");
        // String nombreProducto = entrada.nextLine(); Es lo mismo
        equipoNuevo.setNombreEquipo(InputService.scanner.nextLine());
        equipoNuevo.setFechaCreacion(LocalDateTime.now());
        //ServicioJugadorImpl;
                  

      return equipoNuevo;  
    }
    @Override
    public Equipo crearEquipoConintegrantes(){
        Equipo equipoNuevoConJugadores = new Equipo();
        equipoNuevoConJugadores=crearEquipo();
        while(true){
            equipoNuevoConJugadores.getEquipo().add(servicioJugador.InsertarJugador(equipoNuevoConJugadores.getNombreEquipo()));
            System.out.println("¿DESEA INGRESAR OTRO JUGADOR? SI=S NO=N ");
            String otroJugador=(InputService.scanner.nextLine());
            if ("N".equals(otroJugador)){
                break;
            }else if("S".equals(otroJugador)){
                System.out.println("----SE INGRESARA OTRO JUGADOR -----");
            }else {
                System.out.println("----OPCION NO VALIDA, NO SE INSERTARA OTRO JUGADOR");
                break;
            }        
        } 
        //equipoNuevoConJugadores.getEntrenador().add(servicioTecnico.InsertarTecnico()); 
        equipoNuevoConJugadores.setEntrenador(servicioTecnico.InsertarTecnico());
    
    return equipoNuevoConJugadores;  
    }
    
    @Override
    public  Equipo MostrarEquipoCompletos(List<Equipo> equipos){
        for (Equipo listaEquipos:equipos) {
            System.out.println("-----------------------EQUIPO---------------------");
            System.out.printf("%-20s%-20s%n", "NOMBRE DEL EQUIPO", "FECHA DE CREACIÓN");
            System.out.printf("%-20s%-20s%n", listaEquipos.getNombreEquipo(), listaEquipos.getFechaCreacion());
            servicioTecnico.MostrarTecnico(listaEquipos.getEntrenador());
            servicioJugador.MostrarJugadoresCompletos(listaEquipos.getEquipo());
        }
        return null;
    }
    
    public  Equipo BuscarEquipo(List<Equipo> equipoList){
         Equipo auxiliar = new Equipo();  
         Jugador capitan = new Jugador();
         List<Jugador> jugadores = new ArrayList<>();  
         System.out.println("INGRESE EL NOMBRE DEL EQUIPO A BUSCAR : ");
         String busqueda = InputService.scanner.nextLine();
        for (Equipo equipos:equipoList) {
            if (equipos.getNombreEquipo().equals(busqueda)) {
                auxiliar = equipos;
                jugadores = auxiliar.getEquipo();
                for (Jugador buscar : jugadores) {
                    if (buscar.isEsCapitan()) {
                        capitan = buscar;
                    }
                }
            }
        }    
        System.out.println("-----------------------EQUIPO ENCONTRADO ---------------------");
        System.out.printf("%-20s%-30s%-20s%n","NOMBRE","NOMBRE DEL ENTRENADOR","NOMBRE DEL CAPITAN");
        System.out.printf("%-20s%-30s%-20s%n",auxiliar.getNombreEquipo(),auxiliar.getEntrenador().getNombre(),capitan.getNombre());
        
        return null;
    }
    
    @Override
    public  Equipo BuscarEquipoCompleto(List<Equipo> equipoList){
         List<Equipo> auxiliar = new ArrayList<>();   
         System.out.println("INGRESE EL NOMBRE DEL EQUIPO A BUSCAR : ");
         String busqueda = InputService.scanner.nextLine();
        for (Equipo equipos:equipoList) {
            if (equipos.getNombreEquipo().equals(busqueda)) {
                auxiliar.add(equipos);
                MostrarEquipoCompletos(auxiliar);                
            }
        }
        return null;
    }
    
    
}
