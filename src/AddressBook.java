import java.util.*;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyAddressBook = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo aBuddyInfo){
        buddyAddressBook.add(aBuddyInfo);
    }
    public void removeBuddy(BuddyInfo aBuddyInfo){
        buddyAddressBook.remove(buddyAddressBook.lastIndexOf(aBuddyInfo));
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}



