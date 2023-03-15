/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fer
 */
public class Coro {

    public static List<Voz> generarVoces(int numero) {

        if (numero < 6) {

            throw new IllegalArgumentException("Introduce un numero mayor o igual a 6");
        }

        List<Voz> voces = new ArrayList<>();

        for (int i = 0; i < numero; i++) {
            
            voces.add(Voz.getAleatorio());
            
        }

        return voces;

    }
    
    
    
    
    
    
    
    

    public List<Voz> getNumeroCorosMixtos(List<Voz> voces) {

        for (int i = 0; i < voces.size(); i++) {

        }

        return voces;
    }

    public Voz buscarVozMasRepetida(List<Voz> voces) {

        int tenor = 0;
        int baritono = 0;
        int contralto = 0;
        int mezzosoprano = 0;
        int contratenor = 0;
        int soprano = 0;
        String mayorrepetido = "";

        for (int i = 0; i < voces.size(); i++) {

            if (voces.contains(Voz.BARITONO)) {

                baritono++;
            } else if (voces.contains(Voz.CONTRALTO)) {

                contralto++;
            } else if (voces.contains(Voz.CONTRATENOR)) {

                contratenor++;
            } else if (voces.contains(Voz.MEZZOSOPRANO)) {

                mezzosoprano++;
            } else if (voces.contains(Voz.SOPRANO)) {

                soprano++;
            } else if (voces.contains(Voz.TENOR)) {

                tenor++;
            }

        }

        if (baritono > contralto && baritono > contratenor && baritono > mezzosoprano && baritono > soprano && baritono > tenor) {

            return Voz.BARITONO;

        }else if(tenor > contralto && tenor > contratenor && tenor > mezzosoprano && tenor > soprano && tenor > baritono){
            
            return Voz.TENOR;
            
        }else if(contralto > tenor && contralto > contratenor && contralto > mezzosoprano && contralto > soprano && contralto > baritono){
            
            return Voz.CONTRALTO;
            
        }else if(contratenor > contralto && contratenor > tenor && contratenor > mezzosoprano && contratenor > soprano && contratenor > baritono){
            
            return Voz.CONTRATENOR;
            
        }else if(mezzosoprano > contralto && mezzosoprano > contratenor && mezzosoprano > tenor && mezzosoprano > soprano && mezzosoprano > baritono){
            
            return Voz.MEZZOSOPRANO;
            
        }else{
            
           return Voz.SOPRANO;
        }

        
    }
}
