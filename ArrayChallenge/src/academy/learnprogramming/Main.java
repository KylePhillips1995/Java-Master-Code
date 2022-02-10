package academy.learnprogramming;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(10);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values of your choice. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("The value at index " + i + " is " + array[i]);
        }
    }

    //sorts the array
    public static void sortIntegers(int[] array){
       //holds the place of the value when swapping via sort.
        int placeHolder = 0;
        //use flag to continue the loop even after the value has been replaced. Continue until the array has been looped through entirely.
        boolean flag = true;
        while(flag) {
            flag = false;

            //loops through and sorts in decending order. Can also be done starting at int i = 0 if we do if(array[i] < array[i + 1]
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    placeHolder = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = placeHolder;
                    flag = true;
                }
            }
        }
    }
}
