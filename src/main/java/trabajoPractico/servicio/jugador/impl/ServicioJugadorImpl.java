/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.jugador.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.domain.Jugador;
import trabajoPractico.servicio.entrada.console.impl.InputService;
import trabajoPractico.servicio.jugador.ServicioJugador;

/**
 *
 * @author Alejandro
 */
public class ServicioJugadorImpl implements ServicioJugador {
     @Override
    public Jugador insertarJugador(String equipo){
         Jugador jugadorNuevo = new Jugador();
         System.out.println("INGRESE EL NOMBRE DEL JUGADOR : ");
         jugadorNuevo.setNombre(InputService.scanner.nextLine());
         System.out.println("INGRESE EL APELLIDO DEL JUGADOR : ");
         jugadorNuevo.setApellido(InputService.scanner.nextLine());
         System.out.println("INGRESE EL ALTURA DEL JUGADOR : ");
         jugadorNuevo.setAltura(Double.parseDouble(InputService.scanner.nextLine()));
         System.out.println("INGRESE LA POSICION DEL JUGADOR : 1.ARQUERO 2.DEFENSOR 3.MEDIOCAMPISTA 4.DELANTERO");
         String var =InputService.scanner.nextLine();
         switch(var) {
         case "1":
           jugadorNuevo.setPosicion("ARQUERO");
           break;
         case "2":
           jugadorNuevo.setPosicion("DEFENSOR");
           break;
         case "3":
           jugadorNuevo.setPosicion("MEDIOCAMPISTA");
           break;
         case "4":
           jugadorNuevo.setPosicion("DELANTERO");
           break;
         default:
           System.out.println("DIGITO UNA OPCION NO VALIDA, ESCRIBA LA POSICION DIRECTAMENTE ");
           jugadorNuevo.setPosicion(InputService.scanner.nextLine());
        }
         
         jugadorNuevo.setCantidadGoles(0);
         jugadorNuevo.setCantidadPartidos(0);
         while (true) {
             System.out.println("EL JUGADOR ES CAPITAN S=SI N=NO : ");
             String capitan = (InputService.scanner.nextLine());
             if ("S".equals(capitan)) {
                 jugadorNuevo.setEsCapitan(true);
                 break;
             } else if ("N".equals(capitan)) {
                 jugadorNuevo.setEsCapitan(false);
                 break;
             } else {
                 System.out.println("Vuelve a ingresar S o N");
             }
         }
         System.out.println("INGRESE EL NUMERO DE CAMISETA DEL JUGADOR : ");
         jugadorNuevo.setNumeroCamiseta(Integer.parseInt(InputService.scanner.nextLine()));
         jugadorNuevo.setNomEquipo(equipo);
      return jugadorNuevo;  
    }
    
    
    @Override
    public  Jugador mostrarJugadoresCompletos(List<Jugador> jugadores){
        List<Jugador> productosLinked = new LinkedList<>();
        productosLinked =jugadores;
        Jugador aux=null;
        Jugador aux2=null;
        System.out.println("-----------------------JUGADORES---------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n","NOMBRE","APELLIDO","ALTURA","POSICION","ES CAPITAN?","NUMERO DE CAMISETA");
        for (int i=0; i<jugadores.size();i++){
            for (int j=i+1; j<jugadores.size();j++){
                if(jugadores.get(j).getNombre().compareToIgnoreCase(jugadores.get(i).getNombre())<0){
                    aux = jugadores.get(j);
                    aux2 = jugadores.get(i);
                    jugadores.remove(j);
                    jugadores.add(j, aux2);
                    jugadores.remove(i);
                    jugadores.add(i, aux);
                    
                }
            }
        }
        /*Collections.sort(productosLinked,new Sortbyroll());
         public class Sortbyroll implements Comparator<Jugador>{
                public int compare(Jugador a, Jugador b)
               {
                   return a.getNombre().compareToIgnoreCase(b.getNombre());
               }

            }
        
        */
        
        for (Jugador listaJugadores:jugadores) {
               String var = listaJugadores.isEsCapitan() ? "SI" : "NO";
               System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%n",listaJugadores.getNombre(),listaJugadores.getApellido(),listaJugadores.getAltura(),
                        listaJugadores.getPosicion(),var,listaJugadores.getNumeroCamiseta());
        }        
        return null;
    }
    
     @Override
     public  Jugador buscarJugadores(List<Equipo> equipoList){
         List<Jugador> auxiliar = new ArrayList<>();
         List<Jugador> jugadores = new ArrayList<>();         
         System.out.println("INGRESE EL NOMBRE DEL JUGADOR A BUSCAR : ");
         String busqueda = InputService.scanner.nextLine();
        for (Equipo equipos:equipoList) {
            auxiliar = equipos.getEquipo();
            for (Jugador buscar:auxiliar){
                if(buscar.getNombre().equals(busqueda)){
                    jugadores.add(buscar);
                }
                
            }        
        }
        System.out.println("-----------------------JUGADORES ENCONTRADOS ---------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n","NOMBRE","APELLIDO","POSICION","ES CAPITAN?","NOMBRE DEL EQUIPO");
        for (Jugador listaJugadores:jugadores) {
            String aux = listaJugadores.isEsCapitan() ? "SI" : "NO";
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%n",listaJugadores.getNombre(),listaJugadores.getApellido(),
                listaJugadores.getPosicion(),aux,listaJugadores.getNomEquipo());
        }
        return null;
    }
    
}

