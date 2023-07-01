/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import java.io.IOException;
import modelo.PadronElectoral;

/**
 *
 * @author andy
 */
public class PadronEDAO extends AdaptadorDao<PadronElectoral>{
    private PadronElectoral padron;
    
    public PadronEDAO() {
        super(PadronElectoral.class);
    }

    public PadronElectoral getPadron() {
        if(padron == null){
            padron = new PadronElectoral();
        }
        return padron;
    }

    public void setPadron(PadronElectoral padron) {
        this.padron = padron;
    }
    
    public void guardarPadron() throws IOException{
        padron.setId(generarID());
        guardar(padron);
        padron = null;
    }
    
    
    
}
