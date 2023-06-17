package mahid.statebank;

import java.util.Scanner;

public class StateBank {
    
    public void withdrawmoney(Client x , int money){
        
        int deposite = x.getDeposite();
        
        if(deposite > money){
            deposite = deposite - money;
            x.setDeposite(deposite);
            
            System.out.print("\n withdrow money: " + money);
            System.out.print("\n your curent valance is: " + deposite);
        }
        else{
            System.out.print("\n No valance !"+ money + "you can try again \n Thank you");
        } 
    }

    public static void main(String[] args){
        
        int a, b;
        
        Scanner srs = new Scanner(System.in);
        System.out.print("Enter your name: "); 
        a = srs.nextInt();
        
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter your money: ");
        b = abc.nextInt();
        
        StateBank sb = new StateBank();
        
        Client asik = new Client();
        asik.setId (20);
        asik.setNamne ("Ashikur Rahaman");
        asik.setMobile(015);
        asik.setDeposite(20000);
        
        Client mahid = new Client();
        mahid.setId(5);
        mahid.setNamne("Mahid Mahmud");
        mahid.setMobile(016);
        mahid.setDeposite(30000);

        System.out.print("Your prives balanc is " + mahid.getDeposite());
        sb.withdrawmoney(mahid,b);
        //System.out.print(mahid.getDeposite());
    }
}
