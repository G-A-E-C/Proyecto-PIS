/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.DAO;

import controlador.ed.lista.ListaEnlazada;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabrielalejandroespinzacoronel
 */
public class AdaptadorDao<T> implements InterfaceDao<T> {

    private Conexion conexion;
    private Class clazz;
    private String url;

    public AdaptadorDao(Class clazz) {
        this.conexion = new Conexion();
        this.clazz = clazz;
        this.url = conexion.URL + clazz.getSimpleName().toLowerCase() + ".json";
    }

    @Override
    public void guardar(T obj) throws IOException {
        ListaEnlazada<T> lista = listar();

        lista.insertar(obj);

        conexion.getxStream().alias(lista.getClass().getName(), ListaEnlazada.class);
        conexion.getxStream().toXML(lista, new FileWriter(url));
    }

    @Override
    public void actualizar(T obj, Integer pos) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaEnlazada<T> listar() {
        ListaEnlazada<T> lista = new ListaEnlazada<>();

        if (new File(this.url).exists()) {
            lista = (ListaEnlazada<T>) conexion.getxStream().fromXML(new File(this.url));
        }

        return lista;
    }

    @Override
    public T obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer generarID() {
        return listar().size() + 1;
    }
    
}

