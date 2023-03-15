/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej3;

import java.util.Random;

/**
 *
 * @author fer
 */
public enum Voz {

    CONTRATENOR, TENOR, BARITONO, SOPRANO, MEZZOSOPRANO, CONTRALTO;
    
     public static Voz getAleatorio(){
        
        Random numeroRandom = new Random();
        
        Voz [] voces = Voz.values();
        
        //Posicion aleatorio de donde ira la voz
        int posicionRandom = numeroRandom.nextInt(0,voces.length);
        
        return voces[posicionRandom];
    }

}
