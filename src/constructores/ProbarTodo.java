
package constructores;

import javax.swing.JFrame;


public class ProbarTodo {


    public static void main(String[] args) {
        Test1 objeto1=new Test1(5); //new crea los objetos nombre es lo anterior a new copnstructor= Test1 despues del new
        Test1 objeto2=new Test1();
        
        JFrame ventana=new JFrame("Mi primer ventana");//JFrame es una clase ya existente y solo hay que importarla
                ventana.setSize(400, 400);//con esto damos tamaño al objeto ventrana
                ventana.setVisible(true);//con esto damos instruccion al objeto de ser visible
   }
    
}
