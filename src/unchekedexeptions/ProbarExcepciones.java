 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchekedexeptions;

/**
 *
 * @author T-107
 */
public class ProbarExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aritmetic exceptions la manda cuando esta entre puros enteros al haber flotante marca infinity
        float a=5;
        int b=0;
        
        System.out.println(a+b);
        System.out.println(a/b);//run time exception codigo bien truena al momento de ejecucion termina abruptamente
        System.out.println(a-b);
        
        //Integer i=new Integer("Hola");
        //NumberFormatException al no poder convertir la cadena a un numero manda la excepcion
        int otro =5;
        //System.out.println(i+otro);
        
        int []m={2,5,6,7};
        System.out.println(m[4]);
        //ArrayIndexOutOfBoundsException surge al mandar a solicitar mas de lo que hay en un arreglo
    }    
}
