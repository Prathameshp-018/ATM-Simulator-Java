import java.util.Scanner;

public class atm_project {
    public static void main(String[] args){

        float balance=10000;
        float Deposit;
        int user=0;
        float Withdraw;
        
        Scanner sc=new Scanner(System.in);
        

        while(user!=4){

            System.out.println("====== ATM MENU =====");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money ");
            System.out.println("4. Exit ");
            System.out.println("     ");

            System.out.print("Enter your choice: ");
            user=sc.nextInt();

            
            if(user==1){
            System.out.println("Your Balance is: "+balance);
            }
            else if(user==2){
            System.out.print("Enter amount to deposit: ");
            Deposit=sc.nextFloat();

            balance=Deposit + balance;
            System.out.println("Depost Successful !");
            System.out.println("Your Balance is: "+balance);

            }
            else if(user==3){
            System.out.print("Enter Amount to Withdraw: ");
            Withdraw=sc.nextFloat();

            if(Withdraw<=balance){
                balance=balance-Withdraw;
                System.out.println("Withdrawal Successful! ");

                System.out.println("Remainig Balance: "+balance);

            }
            else{
                System.out.println("Insufficient Balance! ");
            }
            }
            else if(user==4){
            System.out.println("Thank you for using ATM! ");
            }
            else{
            System.out.println("Invalide Choice!");
            }


        }

        sc.close();


    }
    
}
