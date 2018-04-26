/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj.login;

import javax.ejb.Stateless;

/**
 *
 * @author prasad
 */
@Stateless
public class loginexample implements loginexampleRemote {

    @Override
    public String validateuser(String username, String pass) {
        if(!"ok".equals(pass))
        {
            return "valid user";
        }
        else
        {
            
            return "invalid user";
        }
    }

  

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
