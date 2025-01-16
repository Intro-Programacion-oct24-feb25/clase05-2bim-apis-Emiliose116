/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
//importamos todo lo quye necesitamos
//ejemplo:
//import nommbredepaquete.Clase
import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete6.ImprimirMensaje;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
        ImprimirMensaje.imprimirMensaje(valorA, valorB, suma, multiplicacion);
        //NombreDeLaClase.nombreDelMetodo()
        /*Estoy llamando a un metod del paquete06 el cual me permite presnetar 
        los datos, es importante decir que previamente tenemos que importar las 
        clases donde se encuentran los, metodos que necesitamos*/
    }
}
