/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.modeloTabla;

import controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Candidato;

/**
 *
 * @author santiago
 */
public class modeloTablaCandidato extends AbstractTableModel {

    ListaEnlazada<Candidato> candidato = new ListaEnlazada<>();

    @Override
    public int getRowCount() {
        return candidato.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Candidato c = null;
        try {
            c = candidato.get(rowIndex);
        } catch (Exception e) {
        }
        switch (columnIndex) {
            case 0:
                return (c != null) ? c.getNombre() : "No definido";
            case 1:
                return "No definido";
            case 2:
                return "No definido";
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Partido Politico";
            case 2:
                return "Lista";
            default:
                return null;
        }
    }

}
