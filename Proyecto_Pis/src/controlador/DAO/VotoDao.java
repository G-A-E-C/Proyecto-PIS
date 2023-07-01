/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import java.io.IOException;
import modelo.Voto;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class VotoDao extends AdaptadorDao<Voto>{
    
    private Voto voto;
    
    public VotoDao() {
        super(Voto.class);
    }

    public Voto getVoto() {
        if(voto == null) voto = new Voto();
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }
     //Permite generar un ID para un voto y guardarlo. 
    public void guardarVoto() throws IOException{
        voto.setId(generarID());
        guardar(voto);
        voto = null;
    }
    
    
    
    
}
