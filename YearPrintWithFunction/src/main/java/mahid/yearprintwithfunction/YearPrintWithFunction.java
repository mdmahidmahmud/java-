package mahid.yearprintwithfunction;

import java.util.Scanner;

public class YearPrintWithFunction {
    
    public void addition (int x){
        
        if(x < 20){
            System.out.print("you r very child");
        }else if(x < 40){
            System.out.print("you r adult");
        }else if(x < 60){
            System.out.print("you r man");
        }else{
            System.out.print("you r very old");
        }
        
    }

    public static void main(String[] args) {
        int a;
        
        Scanner abc = new Scanner(System.in);
        YearPrintWithFunction acr = new YearPrintWithFunction();
        
        System.out.print("Enter your year: ");
        a = abc.nextInt();
        
        acr.addition(a);
        
        
    }
}
