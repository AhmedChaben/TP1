

package paqClases;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal{
    public static void main(String[] args) {
         int entero=5;
        float flotante=1.5f, promedio=0f;
        double doble=500;
        String s= new String("Hola mundo");
        System.out.println("\n"+entero+"\n"+ flotante+"\n"+doble+"\n"+ s);
        ArrayList<Float> Flotantes= new ArrayList<Float>();
        Flotantes.add(9.8f);
        Flotantes.add(2.73f);
        Flotantes.add(3.14f);
        Flotantes.add(1.56f);
        for (int i=0; i<Flotantes.size();i++){
            promedio+=Flotantes.get(i);
        }
        promedio=promedio/Flotantes.size();
        System.out.println(promedio);
    }
    
}
