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
public class PartidoPolitico {
    private String nombre;
    private Integer id;
    private String ideologia;
    private Integer numLista;
    private ListaEnlazada<String> candidatos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }

    public Integer getNumLista() {
        return numLista;
    }

    public void setNumLista(Integer numLista) {
        this.numLista = numLista;
    }

    public ListaEnlazada<String> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ListaEnlazada<String> candidatos) {
        this.candidatos = candidatos;
    }
    
}
