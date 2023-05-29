/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico.servicio.entrada.console;

import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public interface  InputServiceInterface {
    void createScanner(); //Firmas
    Scanner getScanner();
    void closeScanner();
    
}
