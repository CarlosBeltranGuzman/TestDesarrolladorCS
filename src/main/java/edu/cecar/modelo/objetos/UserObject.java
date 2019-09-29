/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.modelo.objetos;

import edu.cecar.modelo.Users;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class UserObject extends OpcionObject implements Serializable{
    private static final long serialVersionUID = 1420672609912364060L;
    private ArrayList<Users> users;
    private Users user;

    public UserObject(String opcion) {
        super(opcion);
    }

    
    public UserObject(ArrayList<Users> users) {
        this.users = users;
    }

    public UserObject() {
    }

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
