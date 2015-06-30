package evaluacion;

/**
 *
 * @author T-107
 */
public class ModeloEvaluacion {

    public  float evaluar(ExamenParcial cparcial, ExamenFinal cfinal) throws PorcentajesException{
      float pParcial=cparcial.getPorcentaje();
      float pFinal=cfinal.getPorcentaje();
      if((pParcial+pFinal)!=1.0f) throw new PorcentajesException();
        float calificacionFinal=cparcial.getCalificacion()*cparcial.getPorcentaje()+cfinal.getCalificacion()*cfinal.getPorcentaje();
    
      return calificacionFinal;
    }
}
