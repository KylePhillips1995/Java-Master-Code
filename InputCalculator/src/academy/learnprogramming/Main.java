package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;

        while(true){
            System.out.println("Enter a number");
            boolean isAnInt = scan.hasNextInt();
            if(!isAnInt){
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            else{
                int test = scan.nextInt();
                counter++;
                sum += test;
                average = (double)Math.round(sum / counter);
            }
            scan.nextLine();
        }
    }
}
