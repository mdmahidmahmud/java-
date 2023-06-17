package mahid.arraymanipulation;

import java.util.Scanner;

public class ArrayManipulation {
    
    int max_size = 4;
    int a[] = new int [max_size];
    int max = 0, min = 99999;
    
    
    void userInput(){
               
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n Enter your numbers:");
        int i; 
        for (i = 0; i < max_size; i++){
            a[i] = sc.nextInt();
           
        }
    }
    void maxminFinder(){
        int i;
        for (i = 0; i < max_size; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
    }

    public static void main(String[] args) {
        
        ArrayManipulation abc = new ArrayManipulation();
        
        abc.userInput();
        abc.maxminFinder();
        
        System.out.print("\n max value: " + abc.max);
        System.out.print(" \n min value: " + abc.min); 
    }
}
