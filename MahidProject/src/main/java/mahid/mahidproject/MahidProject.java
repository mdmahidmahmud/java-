package mahid.mahidproject;

import java.util.Scanner;

public class MahidProject {
    
    public int add(int x, int y, int z){        
        return x + y + z;     
    }

    public static void main(String[] args){
       
       Scanner mah = new Scanner(System.in);
       MahidProject mahid = new MahidProject();
       
       int a, b, c, sumations;
       
       System.out.print("Enter Your Fast Number: ");
       a = mah.nextInt();
       
       System.out.print("Enter Your Secent Number: ");
       b = mah.nextInt();
       
       System.out.print("Enter Your Thred Number: ");
       c = mah.nextInt();
       
       sumations = mahid.add(a, b,c);
       
       System.out.print("Sumasition is: "+sumations);
       
    }
}
