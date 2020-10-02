import java.util.*;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyAddressBook;

    public AddressBook(){
        buddyAddressBook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo aBuddyInfo){
        if (buddyAddressBook != null){
            buddyAddressBook.add(aBuddyInfo);
        }

    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < buddyAddressBook.size()){
            return buddyAddressBook.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public void newMethod(){

    }

}

//changes made from website repository

