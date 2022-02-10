package academy.learnprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();
        addInOrder(placesToVist, "New Orleans");
        addInOrder(placesToVist, "Philly");
        addInOrder(placesToVist, "LA");
        addInOrder(placesToVist, "Chicago");
        addInOrder(placesToVist, "Atlanta");
        printList(placesToVist);

        addInOrder(placesToVist, "Philly");
        printList(placesToVist);
        vist(placesToVist);

        //        placesToVist.add("New Jersey");
//        placesToVist.add("Sydney");
//        placesToVist.add("Miami");
//        placesToVist.add("London");
//
//        printList(placesToVist);
//        placesToVist.add(1, "New York City");
//        printList(placesToVist);
//
//        placesToVist.remove(1);
//        printList(placesToVist);

    }

    private static void printList(LinkedList<String> linkedList){

        Iterator<String> i = linkedList.iterator();
        //Iterate through the linkedlist and print the value at index
        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("==================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            //check if the new city currently exists in the linked list
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //do not add
                System.out.println(newCity + " is already on the linked list as a destination!");
                return false;
            }
            else if(comparison > 0){
                //move backwards one iteration.
                stringListIterator.previous();
                //add the new city so A comes before B etc
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0){

            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void vist(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities on the list");
            return;
        } else{
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                    System.out.println("Now visiting " + listIterator.previous());
                } else{
                    System.out.println("We are at the start of the list");
                    goingForward = true;
                }
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Avaliable actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
