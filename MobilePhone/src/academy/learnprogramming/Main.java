package academy.learnprogramming;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone();

    //Prints menu instructions
    public static void printMenu(){
        System.out.println("****MENU****");
        System.out.println("0: Print Instructions");
        System.out.println("1: Print Contacts");
        System.out.println("2: Add New Contact");
        System.out.println("3: Update Existing Contact");
        System.out.println("4: Remove a Contact");
        System.out.println("5: Search/Find a Contact");
        System.out.println("6: Quit");
        System.out.println("************");
    }

    //Adds Contact to phone
    public static void addContact(){
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        System.out.println("Enter a number:");
        String number = scanner.nextLine();
        myPhone.addNewContact(name, number);
        System.out.println("****ADDING****");
    }

    //Updates an existing contact
    public static void updateContact(){
        myPhone.printContacts();
        System.out.println("Select a contact to Update:");
        int contactID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter a new number:");
        String newNumber = scanner.nextLine();
        myPhone.updateContact(contactID, newName, newNumber);
        System.out.println("****UPDATING****");
    }

    //Removes an existing contact
    public static void removeContact(){
        myPhone.printContacts();
        System.out.println("Select a contact to Remove:");
        int contactID = scanner.nextInt();
        myPhone.removeExistingContact(contactID - 1);
        System.out.println("****REMOVING****");
    }

    //Searches existing contact for a match.
    public static void searchContacts(){
        System.out.println("Enter a name to search for: ");
        String name = scanner.nextLine();
        System.out.println("Enter a number to search for: ");
        String number = scanner.nextLine();

        boolean search = myPhone.onFile(name, number);
        System.out.println("****SEARCHING****");
        if(search == true){
            System.out.println("the contact " + name + ": " + number + " was found. ");
        }
        else{
            System.out.println("CONTACT DOES NOT EXIST");
        }
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while(!quit){
            printMenu();
            System.out.println("Select a Menu Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printMenu();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    quit = true;
                    break;
            }
            }
        }
    }

