/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import java.io.IOException;
import modelo.PartidoPolitico;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class PartidoPDAO extends AdaptadorDao<PartidoPolitico>{
    private PartidoPolitico partido;
    public PartidoPDAO() {
        super(PartidoPolitico.class);
    }

    public PartidoPolitico getPartido() {
        if(partido == null) partido = new PartidoPolitico();
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }
    
    public void guardarPartido() throws IOException{
        partido.setId(generarID());
        guardar(partido);
        partido = null;
    }
    
}
