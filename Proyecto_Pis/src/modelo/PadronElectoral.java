/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ed.lista.ListaEnlazada;

/**
 *
 * @author Walter
 */
public class PadronElectoral {
    
    private String ubicacion;
    private ListaEnlazada <String> votantes;
    private ListaEnlazada <Integer> papeleta; 

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ListaEnlazada<String> getVotantes() {
        return votantes;
    }

    public void setVotantes(ListaEnlazada<String> votantes) {
        this.votantes = votantes;
    }

    public ListaEnlazada<Integer> getPapeleta() {
        return papeleta;
    }

    public void setPapeleta(ListaEnlazada<Integer> papeleta) {
        this.papeleta = papeleta;
    }
    
}
