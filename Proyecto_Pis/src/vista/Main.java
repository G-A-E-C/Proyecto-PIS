/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.DAO.PartidoPDAO;
import controlador.ed.lista.ListaEnlazada;
import java.io.IOException;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PartidoPDAO partidos = new PartidoPDAO();
        ListaEnlazada<String> candidatos = new ListaEnlazada<>();
        candidatos.insertar("11002349234");
        candidatos.insertar("11002349234");
        candidatos.insertar("11053549234");
        candidatos.insertar("11002759234");
        candidatos.insertar("11002349234");
        candidatos.insertar("11002343434");
        
        partidos.getPartido().setNombre("Los Walters");
        partidos.getPartido().setIdeologia("Clasista");
        partidos.getPartido().setNumLista(7);
        partidos.getPartido().setNumLista(7);
        partidos.getPartido().setCandidatos(candidatos);
        
        partidos.guardarPartido();
        
        
    }
}
