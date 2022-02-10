package academy.learnprogramming;
import java.util.ArrayList;
public class MobilePhone{

    //initalize an arraylist of Contacts Obj
    ArrayList<Contacts> myPhone = new ArrayList<Contacts>();

    //functions needed quit, print myPhone, add new contact, update existing contact, remove contact, and search/find a contact

    //Prints out myPhone stored in myPhone
    public void printContacts(){
        System.out.println("****PRINTING CONTACTS****");
        for(int i = 0; i < myPhone.size(); i++){
            Contacts contact = myPhone.get(i);
            System.out.println((i + 1) + ". " + "Name: " + contact.getName() + " Number: " + contact.getPhoneNumber());
        }
        System.out.println("**************************");
    }

    //adds a new contact to the cellphone contact list.
    public void addNewContact(String name, String number){
        Contacts contact = new Contacts(name, number);
        myPhone.add(contact);
    }

    //Creates a new contact obj and determines its position. Then calls the private update Contact to update the contact.
    public void updateContact(int position, String name, String number){
        Contacts contact = new Contacts(name, number);
        position -= 1;
        updateContact(position, contact);
    }

    //updates the requested contact.
    private void updateContact(int position, Contacts contact){
        myPhone.set(position, contact);
        System.out.println("***The Contact has been updated***");

    }

    //remove existing contact
    public void removeExistingContact(int position){
        if(position >= 0){
            myPhone.remove(position);
        }
    }
//
//    //removes the obj in the position requested.
//    private void removeExistingContact(int position){
//        myPhone.remove(position);
//    }

    //locates the myPhone index
    private int findContact(String name, String number){
        Contacts contact = new Contacts(name, number);
        System.out.println(myPhone.indexOf(contact));
        return myPhone.indexOf(contact);
    }

    //determines if the contact exists.
    public boolean onFile(String name, String number) {
        int position = findContact(name, number);
        if (position >= 0) {
            return true;
        }
        return false;
    }












}


