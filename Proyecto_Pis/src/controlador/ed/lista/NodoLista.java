/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.ed.lista;

/**
 *
 * @author Andy
 */
public class NodoLista<E> {

    private E info;
    private NodoLista sig;

    public NodoLista() {
        sig = null;
        info = null;
    }

    public NodoLista(NodoLista sig, E info) {
        this.sig = sig;
        this.info = info;

    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

}
