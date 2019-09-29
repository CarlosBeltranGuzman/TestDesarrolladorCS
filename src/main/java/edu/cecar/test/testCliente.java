/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.test;

import edu.cecar.modelo.objetos.ClienteObject;
import java.io.IOException;

/**
 *
 * @author carlo
 */
public class testCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ClienteObject clienteObject = new ClienteObject("192.168.1.16", 17000);
    }
}
