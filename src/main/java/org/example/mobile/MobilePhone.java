package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber, List<Contact> myContacts){
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }
            myContacts.add(contact);
            return true;

    }
    public boolean updateContact(Contact oldOne, Contact newOne){
        if (myContacts.contains(oldOne)){
            int indexOld = myContacts.indexOf(oldOne);
            myContacts.set(indexOld, newOne);
            return true;
        } else return false;
    }
    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }else {
            return false;
        }
    }
    public int findContact(Contact contact){
        if (myContacts.contains(contact)){
            int index = myContacts.indexOf(contact);
            return index;
        }else return -1;
    }
    public int findContact(String name){
        if (myContacts.contains(name)){
            int index = myContacts.indexOf(name);
            return index;
        }else return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
    public void printContact(){
        System.out.println("Contact List:");
        for (Contact contact: myContacts){
            System.out.println(contact.getName() + "->" + contact.getPhoneNumber());
        }
}

    public String getMyNumber(){
        return this.myNumber;
    }
    public List<Contact> getMyContacts(){
        return myContacts;
    }
}
