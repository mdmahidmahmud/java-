package mahid.biggernumberwithfunction;

import java.util.Scanner;

public class BiggerNumberWithFunction {
    
    public static void addition(int x, int y){
        
        if(x > y){
            System.out.print("your bigger number is " + x);
        }else{
            System.out.print("your bigger number is " + y);
        }
    }

    public static void main(String[] args) {
        
        int a, b;
        
        Scanner sc = new Scanner(System.in);
        //BiggerNumberWithFunction mahid = new BiggerNumberWithFunction();
        //BiggerNumberWithFunction mahid = new BiggerNumberWithFunction();
        
        
        System.out.print("Enter your fast number: ");
        a = sc.nextInt();
        
        System.out.print("Enter your secent number: ");
        b = sc.nextInt();
        
        addition(a, b);
        
    }
}
