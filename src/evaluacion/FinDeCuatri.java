/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class FinDeCuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear onjetod e tipo examenparcial
        ExamenParcial eParcial=new ExamenParcial();
        eParcial.setCalificacion(7);
        eParcial.setPorcentaje(0.3f);
        ExamenFinal eFinal=new  ExamenFinal();
        eFinal.setCalificacion(10);
        eFinal.setPorcentaje(0.7f);
        
        ModeloEvaluacion modelo=new ModeloEvaluacion();
        
        try {
            System.out.println(modelo.evaluar(eParcial, eFinal));
        } catch (PorcentajesException ex) {
            Logger.getLogger(FinDeCuatri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
