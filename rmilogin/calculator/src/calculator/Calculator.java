/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.rmi.RemoteException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author prasad
 */
public class Calculator extends UnicastRemoteObject implements calculatorinterface{
    
    public Calculator() throws RemoteException
    {
        String a,b;
    }
    public String  check (String a, String b) throws RemoteException
    {
        if(!a.equals(b))
        {
            return "valid user";
        }
        else
        {
            return "invalid user";
        }
    }
   
    /**
     * @param args the command line arguments
     */
 
    
}
