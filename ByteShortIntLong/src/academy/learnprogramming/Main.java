package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("My Min Value is: " + myMinIntValue + " My Max Value: " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("BYte Minimum Value = " + myMinByteValue);
        System.out.println("BYte Max Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        byte myChallengeByte = 10;
        short myChallengeShort = 100;
        int myInt = 1000;
        long myLong = 50000l + 10L * (myChallengeByte + myChallengeShort + myInt);
        System.out.println(myLong);
    }
}
