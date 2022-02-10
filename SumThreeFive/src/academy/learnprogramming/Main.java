package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int sumCounter = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                sumCounter++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5 ");
                if(sumCounter == 5){
                    System.out.println("The Sum is " + sum);
                    break;
                }
            }
        }
        }
}
