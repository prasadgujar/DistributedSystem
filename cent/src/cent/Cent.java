/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cent;

/**
 *
 * @author prasad
 */
public class Cent {

    /**
     * @param args the command line arguments
     */
    
   public int flag=0;
public int front=0;
public int rear=-1;
public boolean grant;

int[] queue=new int[10];
public void request(int p)
{

if(flag==0)
{
System.out.println("reply to"+p);
flag=1;
}
else
{
if(flag==1)
{
System.out.println("process wait "+p);
rear++;
queue[rear]=p;
}
}

}

public void release(int p)
{
flag=0;
if(queue[front]!=0)
{
System.out.println("delete from queue"+queue[front]);
request(queue[front]);
front=front+1;
System.out.println("released"+p);
}



}

    
    public static void main(String[] args) {
        // TODO code application logic here
        int p  = 5;
        Cent c = new Cent();
        c.request(p);
c.request(6);
c.request(7);
c.release(p);
c.release(6);

    }
    
}
