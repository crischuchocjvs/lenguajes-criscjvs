package referenciados;

/**
 *
 * @author T-107
 */
public class ProbarReferenciados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer entero=new Integer("4");//Esta es una clase wrapper notese que Integer va con mayuscula la "" convierte un string a entero
        Float flotante=new Float("7.5");
        float operacion=entero+flotante;
        System.out.println(operacion);//se pueden manejar sin problema primitivos como wrapper
    }
    
}
