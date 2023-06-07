/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.entrada.file.impl;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import trabajoPractico.domain.Equipo;
import trabajoPractico.domain.Jugador;
import trabajoPractico.servicio.entrada.file.InputFileService;

/**
 *
 * @author Alejandro
 */
public class InputFileServiceImpl implements InputFileService {

    @Override
    public List<Jugador> cargarJugadoresPorArchivo(String rutaArchivo, Equipo equipo) {
        //Inicializamos lista de productos
        List<Jugador> jugadores = new ArrayList<>();

        try{
            //Lineas del archivo
            List<String> lineas = FileUtils.readLines(new File(rutaArchivo), StandardCharsets.UTF_8);

            //Cada linea es un producto
            for (String linea: lineas) {
                //Partes de la linea
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String apellido = partes[1];
                double altura = Double.parseDouble(partes[2]);
                String posicion = partes[3];
                int cantidadGoles = Integer.parseInt(partes[4]);
                int cantidadPartidos = Integer.parseInt(partes[5]);
                boolean esCapitan = Boolean.parseBoolean(partes[6]);
                int numeroCamiseta = Integer.parseInt(partes[7]);               

                Jugador jugador = new Jugador(nombre,apellido,altura,posicion,cantidadGoles,cantidadPartidos,esCapitan,numeroCamiseta,equipo.getNombreEquipo());
                jugadores.add(jugador);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }catch (NullPointerException n){
            System.out.println("ERROR AL LEER EL ARCHIVO");
            throw new RuntimeException(n);
        }
        return jugadores;
    }
}
