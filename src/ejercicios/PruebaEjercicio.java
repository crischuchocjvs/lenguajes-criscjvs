/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author T-107
 */
public class PruebaEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1=new Direccion(55130,"ecatepec");
        Usuario u=new Usuario("juean",42,"jcampos@gmail.com",d1);
        System.out.println(u.getDireccion().getMunicipio());
        // TODO code application logic here
    }
    
}
