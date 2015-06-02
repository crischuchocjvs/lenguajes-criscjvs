
package referenciados;

/**
 *
 * @author T-107
 */
public class ProbarString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hola="hola";                     //Clase String 2 formas de uso sirven lo mismo
        String hola2=new String("Hola 2");
         int []enteros= {4,24,12,-7};
         int otro[]={34,3};
         String bb[]={"primero","este es otro","uno mas","el ultimo"}; //estos son arreglos
         System.out.println(bb.length);//length da el tamaño del arreglo
         
         int mas[]=new int[3]; //otra forma de crear un arreglo implicitamente "todos los arreglos en java son tratados como objetos"
         int primitivo;
         System.out.println(mas[1]);
    }
    
}
