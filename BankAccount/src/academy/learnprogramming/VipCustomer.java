package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("Bobby", 700, "bobbyB@bobbyb.com");
    }

    public VipCustomer(String name, String email) {
        this.creditLimit = 500;
        this.name = name;
        this.email = email;
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
