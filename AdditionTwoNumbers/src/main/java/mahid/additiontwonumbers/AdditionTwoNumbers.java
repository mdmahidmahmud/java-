package mahid.additiontwonumbers;

import java.util.Scanner;

public class AdditionTwoNumbers
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        
        System.out.print("\nEnter a Fasr Nmumber: ");
        a = sc.nextInt();
        
        System.out.print("\n Enter a Secent Number: ");
        b = sc.nextInt();
        
        result = a + b;
        
        System.out.print("\n Your Addisition is:" + result);
        
        
    }
}
