/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico2209;

import ico.fes.cosas.Reloj;

/**
 *
 * @author jordi
 */
public class RepasoBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Reloj wacho = new Reloj(); // clase, objeto --> constructor
        wacho.setHora(23);
        wacho.setMinuto(55);
        wacho.setSegundo(33);
        
        Reloj miReloj=new Reloj();
        
        while(true){
            wacho.incrementarSegundo();
            wacho.mostrarHoraActual();
        }
        
    }

}
