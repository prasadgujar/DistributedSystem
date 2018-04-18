/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankersalgo;

/**
 *
 * @author prasad
 */

import java.util.Scanner;

public class Bankersalgo {

    /**
     * @param args the command line arguments
     */
    int max[][];

int need[][];

int available[][];

int allocation[][];

int np,nr;



public void input(){

Scanner input=new Scanner(System.in);

System.out.println("Enter no. of Process and no. of Resource ");

np=input.nextInt();

nr=input.nextInt();

max=new int[np][nr];

need=new int[np][nr];

available=new int[1][nr];

allocation=new int[np][nr];



System.out.println("Enter Allocation Matrix");

for(int i=0;i<nr;i++){

char c= (char) ((char) 65+i);

System.out.print(c+"\t");

}

System.out.println();

for(int i=0;i<np;i++){

for(int j=0;j<nr;j++){

allocation[i][j]=input.nextInt();

}

}

System.out.println("Enter Max Matrix");

for(int i=0;i<nr;i++){

char c= (char) ((char) 65+i);

System.out.print(c+"\t");

}

System.out.println();

for(int i=0;i<np;i++){

for(int j=0;j<nr;j++){

max[i][j]=input.nextInt();

}

}

System.out.println("Enter Available Matrix");

for(int i=0;i<nr;i++){

char c= (char) ((char) 65+i);

System.out.print(c+"\t");

}

System.out.println();

for(int i=0;i<nr;i++){

available[0][i]=input.nextInt();

}

input.close();

}


public void cal_need(){

for(int i=0;i<np;i++){

for(int j=0;j<nr;j++){

need[i][j]=max[i][j]-allocation[i][j];

}

}

}



public boolean check(int p){

for(int i=0;i<nr;i++){

if(available[0][i]<need[p][i]){

return false;

}

}

return true;

}



public void alogrithm(){

cal_need();

int c=0;

boolean status[]=new boolean[np];

while(c<np){

boolean allocated=false;

for(int i=0;i<np;i++){

if( !status[i] && check(i)){

status[i]=true;

allocated=true;

c++;

System.out.println("Allocated process : "+i);

for(int j=0;j<nr;j++){

available[0][j]=available[0][j]+allocation[i][j];

}

}

}

if(!allocated) break; //if no allocation



}

if(c==np) //if all processes are allocated

System.out.println("\nSafely allocated");

else

System.out.println("All proceess cant be allocated safely");

}

    public static void main(String[] args) {
        // TODO code application logic here
        Bankersalgo obj=new Bankersalgo();

obj.input();

obj.alogrithm();
    }
    
}
/*
Enter no. of Process and no. of Resource 
5  3
Enter Allocation Matrix
A	B	C	
0        1      0
2       0       0
3 0 2
2 1  1
0 0 2
Enter Max Matrix
A	B	C	
7 5 3
3 2 3
9 0 1
2 2 2
4 3 3
Enter Available Matrix
A	B	C	
3 3 2
Allocated process : 3
Allocated process : 4
Allocated process : 1
Allocated process : 2
Allocated process : 0

Safely allocated
*/