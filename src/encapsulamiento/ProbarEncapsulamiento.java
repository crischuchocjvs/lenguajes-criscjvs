
package encapsulamiento;

public class ProbarEncapsulamiento {

    public static void main(String[] args) {
        Usuario u1=new Usuario();//creamos objeto u1 constructor Usuario
        u1.setEdad(20);
        System.out.println("Tu edad es:"+u1.getEdad());
    }
    
}
