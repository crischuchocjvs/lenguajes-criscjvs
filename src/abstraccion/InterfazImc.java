/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
public static void main (String []oso){

    Imc imc=new Imc(80,1.67f); //clase, nombre objeto constructor = inicializa los valores de los atributos
        imc.setpeso(90);
        System.out.println(imc.calcular());
        System.out.println(imc.getPeso());
    
        //Primitivos integrales
        byte b=2; //2^8
        short s=2; //2^16
        int i=2;  //2^32 es el tipo por defecto
        long l=2; //2^64 se ocupa normalmente para los ID

        b=(byte)s;// casting forzado forza a un dato mas grande a caber en uno mas pequeño puede haber perdida de presicion
                    // ej. 4000 puede variar a x numero entre -128 y 127
        s=b; //promocion directa o casting directo no marca error ya que uno mas chico cabe en uno mas grande
        i=(int)l;
        i=s;
        s=(short)i;
        
        float f=2.0f;//2^32
        double d=2.0;//2^64
        
        boolean valor=false; //solo puede contener  true o false false es el por defecto
        
        Imc otro=new Imc();
        otro.setFlaco(true);
        System.out.println(otro.isFlaco());
}}