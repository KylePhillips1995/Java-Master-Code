package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //uses constructor to create account obj
        BankAccount myAcc = new BankAccount(1304241, 40000, "Kyle", "kphillips@myacc.com", "532-425-2553");


        VipCustomer vip1 = new VipCustomer();
        System.out.println("VIP Customer Name: " + vip1.getName());
        System.out.println("VIP Credit Limit: " + vip1.getCreditLimit());
        System.out.println("VIP email: " + vip1.getEmail());

        VipCustomer vip2 = new VipCustomer("Katie", "ksiniscalco@gmail.com");
        System.out.println("VIP Customer Name: " + vip2.getName());
        System.out.println("VIP Credit Limit: " + vip2.getCreditLimit());
        System.out.println("VIP email: " + vip2.getEmail());

        VipCustomer vip3 = new VipCustomer("Kelsey", 600, "ksiniscalco@gmail.com");
        System.out.println("VIP Customer Name: " + vip3.getName());
        System.out.println("VIP Credit Limit: " + vip3.getCreditLimit());
        System.out.println("VIP email: " + vip3.getEmail());


        System.out.println("Acc Number: " + myAcc.getAccountNumber());
        System.out.println("Customer Name: " + myAcc.getCustomerName());
        System.out.println("Customer Email: " + myAcc.getEmail());
        System.out.println("Customer Phone: " + myAcc.getPhoneNumber());
        System.out.println("Customer Balance " + myAcc.getBalance());

        myAcc.deposit(50000);
        myAcc.withdraw(40000);
    }
}
