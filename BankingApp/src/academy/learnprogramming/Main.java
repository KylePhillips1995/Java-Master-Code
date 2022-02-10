package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("TD Bank");
        bank.addBranch("Delran");
        bank.addCustomer("Delran", "Kyle", 1000);
        bank.addCustomer("Delran", "Katie", 1000);
        bank.addCustomer("Delran", "Willie", 5);

        bank.addBranch("Cinnaminson");
        bank.addCustomer("Cinnaminson", "Kathy", 10);

        bank.addCustomerTransaction("Delran", "Kyle", 50);
        bank.addCustomerTransaction("Delran", "Kyle", 100);
        bank.addCustomerTransaction("Delran", "Katie", 1000);

        bank.listCustomers("Delran", true);
    }
}
