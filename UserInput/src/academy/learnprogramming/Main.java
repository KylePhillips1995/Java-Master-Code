package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int inputSum = 0;
        while(true)
        {
            int order = counter + 1;
            System.out.println("Enter your " + order + " number");
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt){
                int input = scan.nextInt();
                inputSum += input;
                counter++;
                if(counter == 10){
                    break;
                }
            }
            else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println(inputSum);
        scan.close();
    }
}


