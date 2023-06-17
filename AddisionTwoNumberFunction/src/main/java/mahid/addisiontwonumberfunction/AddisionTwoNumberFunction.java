package mahid.addisiontwonumberfunction;

import java.util.Scanner;

public class AddisionTwoNumberFunction{
    
    public int add (int x, int y){
        return  x + y ;
    }
   
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       
       AddisionTwoNumberFunction abc = new AddisionTwoNumberFunction();
       
       int a, b, result;
       
       System.out.print("Enter Your Fast Number: ");
       a = sc.nextInt();
       
       System.out.print("Enter Your Secent Number: ");
       b = sc.nextInt();
       
       result =abc.add(a,b) ;
       
       System.out.print("your addition: "+ result);
       //abc.add();
    
   }
}
