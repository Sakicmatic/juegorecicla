package juego;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        //Crea un objeto jFjuego
        juego ecoR = new juego();
        ecoR.setVisible(true);
        //Al cerrar, el programa terminará su ejecución
        ecoR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
