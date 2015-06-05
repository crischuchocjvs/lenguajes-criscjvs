package arreglos;

public class ProbarArreglo {

    public static void main(String[] args) {

        int x[]={1,45,-12,7};
        
        int y[]=new int [3];
        y[0]=34;
        y[1]=12;
        y[2]=45;
        
        int z[]=new int[]{3,-12,9};
        String hola="Hola";
        
        for(int i=0;i<x.length;i++){
            System.out.println("Este elemento tiene un valor de:"+x[i]);
        }
        
        for(int m:x){
            System.out.println("Este elemento tiene un valor de"+m);
        }
        
        byte []algo= hola.getBytes();
            for(byte b:algo){
                System.out.println((char)b);
            }
    }
    
}
