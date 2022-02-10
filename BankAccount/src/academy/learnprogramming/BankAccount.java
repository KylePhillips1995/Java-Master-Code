package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor. auto populated if not put in
    public BankAccount(){
        //calls second constructor and sets to default parameter values.
        this(234234, 34000, "Steve", "steve@steve.com", "434-324-4521");
    }
    //overload the bankaccount constructor and create the new account.
    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int deposit){
        this.balance += deposit;
        System.out.println("New balance = " + balance);
    }

    public void withdraw(int withdraw){
        if(withdraw > balance){
            System.out.println("Insufficent Funds");
        }
        else{
            this.balance -= withdraw;
            System.out.println("New balance = " + balance);
        }
    }
}
