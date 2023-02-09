import java.util.*;
class ATM
{
    public static void main (String args[])
    {
        //declare and initialize balance,withdraw and deposit

        int balance = 50000 , withdraw , deposit , TransferAmount ;

        try (//create Scanner class object to get choice of user
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Account User ID : ");
            String AccountHolder = sc.nextLine();

            System.out.println("Enter the transfer money account user ID");
            String NewAccountHolder = sc.nextLine();


            System.out.println("Enter the pin number : ");

            int pin_No = sc.nextInt();
            if(pin_No!=8428)
            {

                System.out.println("Wrong pin Number!! ");

                System.exit(0);
            }

            if(pin_No ==8428)
            {
                while(true)
                {
                    System.out.println("----------------------------------------");
                    System.out.println("**WELCOME***");
                    System.out.println("Chosen 1 for Withdraw");
                    System.out.println("Chosen 2 for Deposit");
                    System.out.println("Chosen 3 for Check Balance");
                    System.out.println("Chosen 4 for Transfer money");
                    System.out.println("Chosen 5 for Quit");
                    System.out.println("Chosen the operation you want to perform : ");
                    int choice = sc.nextInt();
                    System.out.println("----------------------------------------------");
                    switch(choice)
                    {
                        case 1 :
                            System.out.println("Account Holder Name : "+ AccountHolder);
                            System.out.println("Enter money to be withdraw : ");
                            withdraw = sc.nextInt();
                            if(balance >= withdraw)
                            {
                                balance = balance - withdraw;
                                System.out.println("Congratulations succesfully withdraw money");
                                System.out.println("Your Balance is " + balance);
                            }
                            else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;
                        case 2 :
                            System.out.println("Account Holder Name : "+ AccountHolder);
                            System.out.println("Enter money to be deposited : ");
                            deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("Your Balance is " + balance);
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("Account Holder Name : " + AccountHolder);
                            System.out.println("Balance : " + balance);
                            System.out.println("");
                            break;
                        case 4:

                            System.out.println("Transfer money Account Holder Name : " + NewAccountHolder);
                            System.out.println("Enter the amount to transfer : ");
                            TransferAmount = sc.nextInt();
                            if(balance >= TransferAmount)
                            {
                                balance = balance -  TransferAmount;
                                System.out.println("Congratulations succesfully transfer money");
                                System.out.println("Your Balance is " + balance);
                            }
                            else {
                                System.out.println("Insufficient Balance");
                            }
                            System.out.println("");
                            break;

                        case 5:
                            System.exit(0);
                    }
                }
            }
        }
    }
}
