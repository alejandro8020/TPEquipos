/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.salidaArchivos.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import trabajoPractico.domain.Jugador;
import trabajoPractico.servicio.salidaArchivos.OutPutFileService;

/**
 *
 * @author Alejandro
 */
public class OutPutFileServiceImpl implements OutPutFileService {

    @Override
    public void exportJugadores(List<Jugador> jugadores, String rutaDeDestino){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDeDestino))){

            for (Jugador jugador: jugadores) {

                //Preparamos la linea del archivo
                String linea = jugador.getNombre() + ";" +
                        jugador.getApellido()+ ";" +
                        jugador.getAltura()+ ";" +
                        jugador.getPosicion()+ ";" +
                        jugador.getCantidadGoles()+ ";" +
                        jugador.getCantidadPartidos()+ ";" +
                        jugador.isEsCapitan()+ ";" +
                        jugador.getNumeroCamiseta()+ ";" +
                        jugador.getNomEquipo();

                writer.write(linea); //Escribimos en archivo
                writer.newLine(); //Salto de linea
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
