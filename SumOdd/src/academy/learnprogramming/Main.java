package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int start = -4;
        int end = 6;
        System.out.println(sumOdd(start, end));
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;
        for (int i = 0; i <= number; i++) {
            if (number < 0) {
                isOdd = false;
            } else if (i % 2 == -0) {
                isOdd = false;
            } else {
                isOdd = true;
            }
        }
        return isOdd;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        if((start > end) || (start < 0) || (end < 0)){
            sum = -1;
        }
        return sum;
    }

}
