
package constructores;


public class Test1 { //los constructores se agregan dentro de la clase aqui jeje xD
    int x;
    String nombre; //Clase String "nombre" es un referenciado
    float sueldo;
    
    public Test1(int valor){ //este es un constructor se llama igual que la clase
                            //si se agrega un constructor diferente al por defecto este se elimina   
    }
    public Test1(){ //este es el constructor por defecto al habaer mas de 1 constructor hay sobrecarga
        
    }
    public Test1(int x, float y){}
    public Test1(float x, int y){}
    //public Test1(int y, float x){} este marca error ya que duplica al primer constructor los nombres no importan toma el orden 
    
}
