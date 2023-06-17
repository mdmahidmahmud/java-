package mahid.leapyearwithfunction;

import java.util.Scanner;

public class LeapYearWithFunction {
    
    public void addition(int x){
        
        if(x % 4 == 0){
            System.out.print("this year is leap year: "+x);
        }else if(x % 400 == 0){
            System.out.print("this year is leap year: "+x);
        }else if(x % 100 == 0){
            System.out.print("this year is not leap year: "+x);
        }else{
            System.out.print("this year is not lear year: "+x);
        }
    }

    public static void main(String[] args) {
        
        int a;
        
        Scanner scr = new Scanner(System.in);
        LeapYearWithFunction abc = new LeapYearWithFunction();
        
        System.out.print("Enter your year: ");
        a = scr.nextInt();
        
        //Function Call
        abc.addition(a);  
    }
}
