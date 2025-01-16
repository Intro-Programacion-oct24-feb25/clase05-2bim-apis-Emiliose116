/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author utpl
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        obtenerData(dataInicial);
    }

    public static void obtenerData(String[] data) {
        int dataFinal[] = new int[6];
        int i;
        for (i = 0; i < data.length; i++) {

            dataFinal[i] = NumberUtils.toInt(data[i]);

        }
        for (i = 0; i < data.length; i++) {
            System.out.println(dataFinal[i]);
        }
    }
}
