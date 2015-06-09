
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
        Tortuga animal1=new Tortuga();
               animal1.setNombre("Japonesa");
               animal1.setEdad(12);
        Leon animal2=new Leon();
               animal2.setNombre("Africano");
               animal2.setEdad(20);
    }
    
}
