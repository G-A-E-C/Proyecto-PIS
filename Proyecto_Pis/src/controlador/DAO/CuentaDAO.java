/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import java.io.IOException;
import modelo.Cuenta;

/**
 *
 * @author Miguel
 */
public class CuentaDAO extends AdaptadorDao<Cuenta> {
    private Cuenta cuenta;
    
    public CuentaDAO() {
        super(Cuenta.class);
    }
    
    public void guardarCuenta() throws IOException {
        cuenta.setId(generarID());
        guardar(cuenta);
        cuenta = null;
    }
    
}
