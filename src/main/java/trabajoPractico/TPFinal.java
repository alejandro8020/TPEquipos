/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package trabajoPractico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.servicio.entrada.console.impl.InputService;
import trabajoPractico.servicio.equipo.ServicioEquipo;
import trabajoPractico.servicio.equipo.impl.ServicioEquipoImpl;
import trabajoPractico.servicio.jugador.ServicioJugador;
import trabajoPractico.servicio.jugador.impl.ServicioJugadorImpl;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class TPFinal {

    public static void main(String[] args) {
        List<Equipo> equipoList = new LinkedList<>();        
        ServicioEquipo servicioEquipo = new ServicioEquipoImpl();
        ServicioJugador servicioJugador = new ServicioJugadorImpl();
        
        while (true){
        
        System.out.println("-------------SISTEMA DE CREACION DE EQUIPOS---------------------------");
        System.out.println("MENU");
        System.out.println("1. CREAR EQUIPO");
        System.out.println("2. MOSTRAR EQUIPOS");
        System.out.println("3. BUSCAR JUGADOR");
        System.out.println("4. BUSCAR EQUIPO RESUMIDO");
        System.out.println("5. BUSCAR EQUIPO COMPLETO");
        System.out.println("6. ELIMINAR EQUIPO COMPLETO");
        System.out.println("7. CREAR EQUIPO CON CARGA DE JUGADORES POR ARCHIVO");
        System.out.println("8. SALIR");
        Scanner lectura = InputService.getScanner();
        String var = lectura.nextLine();
        
        
        if ("1".equals(var)){            
            while(true){            
                equipoList.add(servicioEquipo.crearEquipoConintegrantes());
                System.out.println("-------------EQUIPO CREADO----------------------");
                System.out.println("DESEA CREA OTRO EQUIPO SI=S N=NO");                
                String crear=(InputService.scanner.nextLine());
                if ("N".equals(crear)){
                    break;
                }else if("S".equals(crear)){
                    System.out.println("----PROCEDA A CREAR OTRO EQUIPO -----");
                }else {
                    System.out.println("----OPCION NO VALIDA, SE MOSTRARA EL MENU PRINCPAL");
                    break;
                }
            }
        }
        
        if ("2".equals(var)){            
            servicioEquipo.MostrarEquipoCompletos(equipoList);                
        }
        if ("3".equals(var)){            
            servicioJugador.BuscarJugadores(equipoList);
        }
        if ("4".equals(var)){            
            servicioEquipo.BuscarEquipo(equipoList);
        }
        if ("5".equals(var)){            
            servicioEquipo.BuscarEquipoCompleto(equipoList);
        }
        if ("6".equals(var)){            
            servicioEquipo.EliminarEquipoCompleto(equipoList);
            System.out.println("-------------EQUIPO ELIMINADO SATISFACTORIAMENTE-------------");
        }
        if ("7".equals(var)){            
            equipoList.add(servicioEquipo.crearEquipoConArchivo());
        }
        if ("8".equals(var)){            
            System.exit(0);
        }//Lista de productos mas caros
        
    }
    }
}
