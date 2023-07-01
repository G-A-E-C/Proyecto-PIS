/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import controlador.ed.lista.ListaEnlazada;
import java.io.IOException;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public interface InterfaceDao<T>{
    public void guardar(T obj) throws IOException;
    public void actualizar(T obj, Integer pos) throws IOException;
    public ListaEnlazada<T> listar();
    public T obtener(Integer id);
}
