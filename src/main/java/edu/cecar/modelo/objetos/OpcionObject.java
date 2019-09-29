/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.modelo.objetos;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class OpcionObject implements Serializable{
    private static final long serialVersionUID = 1420672609912364060L;
    private String opcion;

    public OpcionObject(String opcion) {
        this.opcion = opcion;
    }

    public OpcionObject() {
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
}
