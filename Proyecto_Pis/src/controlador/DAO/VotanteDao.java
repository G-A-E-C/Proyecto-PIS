/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import java.io.IOException;
import modelo.Votante;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class VotanteDao extends AdaptadorDao<Votante>{
    private Votante votante;
    
    public VotanteDao() {
        super(Votante.class);
    }

    public Votante getVotante() {
        if(votante == null) votante = new Votante();
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }
     //Permite generar un ID para un votatnte y guardarlo. 
    public void guardarVotante() throws IOException{
        
        guardar(votante);
        votante = null;
    }
}
