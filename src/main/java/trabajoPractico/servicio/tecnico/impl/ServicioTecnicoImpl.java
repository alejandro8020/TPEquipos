/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.tecnico.impl;

import java.util.List;
import trabajoPractico.domain.Tecnico;
import trabajoPractico.servicio.entrada.console.impl.InputService;
import trabajoPractico.servicio.tecnico.ServicioTecnico;

/**
 *
 * @author Alejandro
 */
public class ServicioTecnicoImpl implements ServicioTecnico {
     @Override
    public Tecnico insertarTecnico(){
        Tecnico tecnicoNuevo = new Tecnico();
        System.out.println("INGRESE EL NOMBRE DEL TECNICO : ");
        tecnicoNuevo.setNombre(InputService.scanner.nextLine());
        System.out.println("INGRESE EL APELLIDO DEL TECNICO : ");
        tecnicoNuevo.setApellido(InputService.scanner.nextLine());
        System.out.println("INGRESE LA EDAD DEL TECNICO : ");
        tecnicoNuevo.setEdad(Integer.parseInt(InputService.scanner.nextLine()));
      return tecnicoNuevo;  
    }
    
    @Override
    public  Tecnico mostrarTecnico(Tecnico tecnico){
        System.out.println("-----------------------TECNICO---------------------");
        System.out.printf("%-20s%-20s%-20s%n","NOMBRE","APELLIDO","EDAD","POSICION","eS CAPITAN?","NUMERO DE CAMISETA");
        System.out.printf("%-20s%-20s%-20s%n",tecnico.getNombre(),tecnico.getApellido(),tecnico.getEdad());   
        
        return null;
    }
    
    
}
