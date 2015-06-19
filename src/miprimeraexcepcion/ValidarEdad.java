/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexcepcion;

/**
 *
 * @author T-107
 */
public class ValidarEdad {
    //throws = lanza seguido de la excepcion
    public static void  validar(int edad)throws MenorDeEdadException{
        if(edad<18)throw  new MenorDeEdadException();
        //si la edad es menor a 18 "throw" se lanza la excepcion y se interrumpe la ejecucion
    }
}
