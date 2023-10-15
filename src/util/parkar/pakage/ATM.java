package util.parkar.pakage;

//    ATM INTERFACE
//        We have all come across ATMs in our cities and it is built on Java. This complex project consists
//        of five different classes and is a console-based application. When the system starts the user is
//        prompted with user id and user pin. On entering the details successfully, then ATM functionalities
//        are unlocked. The project allows to perform following operations:
//
//        Transaction History
//        Withdraw
//        Deposit
//        Transfer
//        Exit


import java.util.Scanner;

class ATM_interface{
    float bal;
    int pin = 1612;

    public void checkpin(){
        System.out.println("enter your pin :");
        Scanner in = new Scanner(System.in);
        int enteredpin = in.nextInt();
        if(enteredpin == pin){
            menu();
        }else{
            System.out.println("pin is not valid");
        }
    }

    public void menu() {
        System.out.println("Enter your Choice :");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Transfer money");
        System.out.println("5. Exit");

        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();

        if(opt == 1){
            checkbal();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            Deposit();
        }else if (opt == 4) {
            transferM();
        } else if (opt == 5) {
            return;
        }
        else{
            System.out.println("enter valid choice");
        }




    }

    public void transferM() {
        System.out.println("enter the amount :");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        bal = bal + amount;
        System.out.println("transfer successful");
        menu();

    }

    public void Deposit() {
        System.out.println("enter the amount :");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        bal = bal + amount;
        System.out.println("deposit successful");
        menu();


    }

    public void withdraw() {
        System.out.println("enter amount :");
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        if(amount > bal){
            System.out.println("insufficient balance");
        }
        else{
            bal = bal - amount;
            System.out.println("your money is withdrawl");
        }

        menu();

    }

    public void checkbal() {
        System.out.println("your balance :" +bal);
        menu();
    }



}
public class ATM {

    public static void main(String[] args) {
        ATM_interface obj = new ATM_interface();
        obj.checkpin();

    }
}
