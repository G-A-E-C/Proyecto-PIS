/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class Conexion {
     private XStream xStream;
    public static String URL = "data/";
    
    private void conexion() {
        this.xStream = new XStream(new JettisonMappedXmlDriver());
        this.xStream.setMode(XStream.NO_REFERENCES);
        this.xStream.addPermission(AnyTypePermission.ANY);
    }
    
    public XStream getxStream() {
        if(xStream == null) conexion();
        return xStream;
    }
    
    public void setxStream(XStream xStream) {
        this.xStream = xStream;
    }
}
