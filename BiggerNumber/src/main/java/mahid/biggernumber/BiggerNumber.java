package mahid.biggernumber;

import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Enter Your Number: ");
        a = sc.nextInt();
        
        System.out.print("Enter Your Number: ");
        b = sc.nextInt();
        
        if (a > b){
            System.out.print("your Bigger Number is a: "+a);
        }
        else{
            System.out.print("your Bigger Number is b: "+b);
        }
    }
}
