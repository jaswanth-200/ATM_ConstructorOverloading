import java.util.Scanner;
class Account{
    String AccountNumber;
    int balance;
    String AccountType;
    Account()
    {
        this.AccountNumber="CANARA7842833088";
        this.balance=500;
        this.AccountType="Savings";
    }
    Account(String AccountNumber,int balance,String AccountType)
    {
        this.AccountNumber=AccountNumber;
        this.balance=balance;
        this.AccountType=AccountType;
        
    }
    
    public void setDetails(String AccountNumber,int balance,String AccountType)
    {
        this.AccountNumber=AccountNumber;
        this.balance=balance;
        this.AccountType=AccountType;
    }
    public void getDetails()
    {
        System.out.println(AccountNumber);
        System.out.println(balance);
        System.out.println(AccountType);
        
    }
    public int Deposit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    public void Withdrawal(int withdrawalAmount)
    {
        if(withdrawalAmount<balance)
        {
            balance=balance-withdrawalAmount;
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    public int getBalance()
    {
        return balance;
    }
}
public class ATM{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account number: ");
        String AccountNumber=sc.nextLine();
        System.out.print("Enter Account Type: ");
        String AccountType=sc.nextLine();
        System.out.print("Enter balance: ");
        int balance=sc.nextInt();
        System.out.print("Enetr Deposit Amount: ");
        int amount=sc.nextInt();
        System.out.print("Enter Withdrawal Amount: ");
        int w=sc.nextInt();
        Account obj=new Account(AccountNumber, balance, AccountType);
        //Account obj=new Account();
        obj.setDetails(AccountNumber, balance, AccountType);
        obj.Deposit(amount);
        obj.Withdrawal(w);
        System.out.println("Available balance: "+obj.getBalance());
        
    }
}