package mahid.arrywithfunction2;

import java.util.Scanner;

public class Arrywithfunction2{
    
    int max_size = 4;
    int a[] = new int [max_size];
    int max = 0, min = 99999;
    
    void userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int i;
        for(i = 0 ; i < max_size; i++ ){
            a[i] = sc.nextInt();
        }
    }
    void supInput(){
        int i;
        int j;
        for( i = 0; i < max_size - i; i++){
            for(j = i + 1 ; j < max_size; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
       Arrywithfunction2 abc = new Arrywithfunction2();
       
       abc.userInput();
       abc.supInput();
       
       System.out.print("\n max value:" + abc.a[abc.max_size - 1]);
       System.out.print("\n min value:" + abc.a[0]);
    }
}
