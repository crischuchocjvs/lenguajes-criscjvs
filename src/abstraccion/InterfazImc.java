/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
public static void main (String []oso){

    Imc imc=new Imc(80,1.67f); //clase, nombre objeto constructor = inicializa los valores de los atributos
        System.err.println(imc.calcular());
    }    
}