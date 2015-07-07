/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeusuarios {
    private List<Usuario> usuarios;
    public GeneradorDeusuarios(){
        Usuario u1=new Usuario("Cris", 20, "cris_ctjmvr@hotmail.com");
        Usuario u2=new Usuario("jess", 19, "axojes@hotmail.com");
        Usuario u3=new Usuario("Pepe", 22, "pepe@gmail.com");
        
        usuarios=new ArrayList<Usuario>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
