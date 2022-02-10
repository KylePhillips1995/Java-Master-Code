package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double variable1 = 20.00d;
        double variable2 = 80.00d;

        double sum = variable1 + variable2;

        sum *= 100.00;

        double sumRemainder = sum % 40.00;

        boolean isRemainder = false;

        if(sumRemainder == 0){

            isRemainder = true;
            System.out.println("There is no remainder " + isRemainder);
        }

        else{

            System.out.println("There is a remainder: " + isRemainder);
            System.out.println("The remainder is: " + sumRemainder);

        }

    }
}
