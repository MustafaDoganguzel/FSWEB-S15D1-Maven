package org.example.mobile;

public class Contact {
    private String name;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {

    if(((Contact)obj).name.equals(name) && ((Contact)obj).phoneNumber.equals(phoneNumber)){
     return true;
    }
    return  false;
    }
}
