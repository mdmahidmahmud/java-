package mahid.java_array;

import java.util.Scanner;

public class Java_array {
    
    int max_size = 4;
    int a[] = new int [max_size];
    int max = 0, min = 99999;
    
    void UserInput(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        
        int i;
        for(i = 0; i < max_size ; i++){
            a[i] = sc.nextInt();
        }  
    }
    void UserOutput(){
        
        int i;
        for(i = 0 ; i < max_size; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
    }
    
    public static void main(String[] args){
        
        Java_array acd = new Java_array();
        
        acd.UserInput();
        acd.UserOutput();
        
        System.out.print("\n max value:"+ acd.max);
        System.out.print("\n min value:"+ acd.min);
        
    }
}
