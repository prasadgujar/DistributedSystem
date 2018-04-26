/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author prasad
 */
public class calculatorclient {
       public static void main(String[] args) throws NotBoundException,RemoteException, MalformedURLException {
        // TODO code application logic here
        Scanner sc  =  new Scanner(System.in);
        try
        {
            calculatorinterface c = (calculatorinterface) Naming.lookup("//localhost:1090/Calculator");
            System.out.println("client is connected to server");
            System.out.println("Please  Enter Userid And Password");
            
            String x = sc.nextLine();
            String y = sc.nextLine();
            System.out.println(c.check(x, y));
       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
