package mahid.factorialnumberwithfunction;

import java.util.Scanner;

public class FactorialNumberWithFunction {
    
   public int factorial(int x){
        
     int f = 1 , i;
     
     for(i = 1;i <= x; i++){
         f = f * i;
     }
     
     return f;
    
    }
    public static void main(String[] args) {
        
        int n, fact;
        
        Scanner sc = new Scanner(System.in);
        FactorialNumberWithFunction abc = new FactorialNumberWithFunction();
        
        System.out.print("Enter Your Number: ");
        n = sc.nextInt();
        
        fact = abc.factorial(n);
        
        System.out.print("Your Factorial Number: "+fact);
        
    }
}
