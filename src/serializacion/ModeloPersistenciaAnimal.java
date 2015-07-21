/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class ModeloPersistenciaAnimal {
    public void guardar (Animal animal)throws Exception{
        //paso1 crear el archivo donde se guaradara el animal
        File file=new  File("D:\\animalitos.cris");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animalito enlatado listo para llevar");
    }
}
