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
            System.out.println("select any option from menu");
            System.out.println("1.addition \n");
            System.out.println("2.Substraction \n");
            System.out.println("3.Multiplication \n");
            System.out.println("4.Division \n");
            int choice  = sc.nextInt();
            int x,y;
            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("result:"+c.add(x, y));
                }
                   case 2:
                {
                    System.out.println("enter two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("result:"+c.sub(x, y));
                }
                   case 3:
                {
                    System.out.println("enter two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("result:"+c.mul(x, y));
                }
                   case 4:
                {
                    System.out.println("enter two number");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("result:"+c.div(x, y));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
