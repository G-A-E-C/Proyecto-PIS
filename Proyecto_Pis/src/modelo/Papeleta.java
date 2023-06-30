/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ed.lista.ListaEnlazada;

/**
 *
 * @author Andy
 */
public class Papeleta {
    
    private ListaEnlazada <String> candidatos;
    private Integer id;

    public ListaEnlazada<String> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ListaEnlazada<String> candidatos) {
        this.candidatos = candidatos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
