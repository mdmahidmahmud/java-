package mahid.factorialwithoutfunction;

import java.util.Scanner;

public class FactorialWithoutFunction {

    public static void main(String[] args) {
        
        int x;
        int f = 1;
        int i;  
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Number:");
        x = sc.nextInt();
        
        for(i = 1; i <= x; i++){
           f = f*i;
        }
        
        
        System.out.print("your number : " +f);
        
    }
}
