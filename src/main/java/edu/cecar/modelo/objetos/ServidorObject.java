/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.modelo.objetos;

import edu.cecar.componentes.comunicaciones.ServerSocketObjeto;
import edu.cecar.controladores.ControladorApiGoRest;
import edu.cecar.modelo.Users;
import java.io.IOException;
import java.util.ArrayList;
import us.monoid.json.JSONException;

/**
 *
 * @author carlo
 */
public class ServidorObject {

    public ServidorObject(int puerto) throws IOException, JSONException, ClassNotFoundException{
        ArrayList<Users> users = ControladorApiGoRest.ControladorApiGoRest();
        System.out.println("Espernado Cliente");
        ServerSocketObjeto socketObjeto = new ServerSocketObjeto(puerto);
        while (true) {            
            
                System.out.println("IP Cliente: " + socketObjeto.getSocket().getLocalAddress());
                OpcionObject opcionObject = (OpcionObject) socketObjeto.getEntrada().readObject();
                OpcionObject rest;
                if ("Users".equalsIgnoreCase(opcionObject.getOpcion())){
                    rest = new UserObject(users);
                }else{
                    rest = new UserObject("Servicio no valido");
                }
                socketObjeto.getSalida().writeObject(rest);
            
        }
    }
    
}
