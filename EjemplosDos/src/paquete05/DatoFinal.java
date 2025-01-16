/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class DatoFinal {
    
    public static double obtenerPromedio(double[] n){
        
        double suma = 0;
        double promedio;
        
        for (int i = 0; i < n.length; i++) {
            suma = suma + n[i];
        }
        
        promedio = suma / n.length;
        return promedio;
    }
    
    public static double obtenerMejorNota(double[] n){
        double mayor;
        int i;
        mayor = n[0];
        for(i = 0 ; i < n.length ; i++){
            if(n[i] > mayor){
                mayor = n[i];
            }
        }
        return mayor;
    }
}
