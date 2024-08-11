
package ATM;
import java.util.Scanner;

class  ATMM{
    float Balance;
    int PIN=5674;
    public void checkPin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }else{
            System.out.println("Entered a valid pin:");
        }
    }
    public void menu(){
        System.out.println("enter your choice: ");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money:");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();

        }else if (opt==3){
            depositeMoney();
        } else if (opt==4) {
            return;

        }else{
            System.out.println("please enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdrawn successfully");
        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money dipsited successfully");
        menu();
    }
}

public class ATM {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ATMM sbi=new ATMM();
        sbi.checkPin();
    }
}