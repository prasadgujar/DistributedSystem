/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author prasad
 */
@Stateless
@LocalBean
public class operation {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     public int add(int x, int y) {
       return  x+y;
    }
 public int sub(int x, int y) {
       return  x-y;
    }
  public int mul(int x, int y) {
       return  x*y;
    }
   public int div(int x, int y) {
       return  x/y;
    }
}
