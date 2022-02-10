package com.example.test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.example.test.Theatre;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
        //shallow copy. Creates an arraylist of all elements passed to constructor.
        //deep copy = same elements copied shallow = reference.
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);


        //shallow copy references the same objs from the original.
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        }
        else{
            System.out.println("Seat reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing Seat Copy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min (seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy " + seatCopy);

        ////        theatre.getSeats();
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========");
    }

    //use nested for loop to sort the list. Slower then Merge sort, but better if speed = not needed and memory is better
    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i =0; i<list.size() -1; i++){
            for(int j= i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i , j);
                }
            }
        }
    }


}
