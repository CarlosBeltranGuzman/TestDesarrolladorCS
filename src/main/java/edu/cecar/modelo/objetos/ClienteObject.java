/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.modelo.objetos;

import edu.cecar.componentes.comunicaciones.SocketObjeto;
import edu.cecar.modelo.Users;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ClienteObject {

    public ClienteObject(String ip, int puerto) {
        try {
            SocketObjeto socketObjetoCliente = new  SocketObjeto(ip, puerto);
            OpcionObject object = new OpcionObject("Users");
            socketObjetoCliente.getSalida().writeObject(object);
            UserObject userObject = (UserObject) socketObjetoCliente.getEntrada().readObject();
            ArrayList<Users> arrayUsers = userObject.getUsers();
            arrayUsers.forEach(u -> System.out.println(u.getId()+" - "+u.getFirst_name()+" - "+u.getLast_name()));
        } catch (IOException ex) {
            Logger.getLogger(ClienteObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex){
            
        }
        
    }
    
}
