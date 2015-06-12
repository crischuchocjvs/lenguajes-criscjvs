
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Animal raro=new Animal();
               raro.setEdad(2);
               raro.setNombre("Rareza");*/ 
        //con abstract en la superclase animal impide crear un objeto de la misma clase
        Pollo p1=new Pollo();
        p1.setNombre("Pollito pio");
        
        Leon l1=new Leon();
        l1.setNombre("Simba");
        
        
        Leon l2=new Leon();
        l2.setNombre("Mufasa");
        
        Delfin d1=new Delfin();
        d1.setNombre("Flipper");
        
        ComportamientoRuido animales[]=new ComportamientoRuido[4]; //hacemos un arreglo
        animales[0]=p1; //asignamos valores de nuestro arreglo
        animales[1]=l1;
        animales[2]=l2;
        animales[3]=d1;
        
        for(ComportamientoRuido algo:animales){
            System.out.println(algo.hacerRuido());
        }
        
    }
    
}
