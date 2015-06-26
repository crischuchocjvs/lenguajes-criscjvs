/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author T-107
 */
public class Bebida {
    String tipo;
    String [] bebidas;
    
    public String[] obtenerRecomendaiones(){
        if(tipo.equals("alcoholicas")){
        String []alcohol={"cerveza sol","creveza indio","whisky","pulque","Tonayan"};
        return alcohol;
        
        }else{
            String []sinalcohol={"Agua","coca-cola","pepsi","agua mineral","red bull"};
            return sinalcohol;
        }
        } 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    
    
      
}
