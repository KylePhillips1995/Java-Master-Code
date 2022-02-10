package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minimum = 0;
        int maximum = 0;
        boolean first = true;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter Number");
            boolean isAnInt = scan.hasNextInt();
            if(isAnInt){
                int test = scan.nextInt();
                if(first == true){
                    first = false;
                    minimum = test;
                    maximum = test;
                }
                else if(test < minimum){
                    minimum = test;
                }
                else if(test > maximum){
                    maximum = test;
                }
            }
            else{
                System.out.println("Invalid Input");
                break;
            }
            scan.nextLine();
        }
        System.out.println("Your min: " + minimum);
        System.out.println("Your max: " + maximum);

    }

}
