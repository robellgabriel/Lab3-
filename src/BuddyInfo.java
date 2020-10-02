public class BuddyInfo {

    public String name;
    public String address;
    public String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        System.out.println("Hello world!");

        BuddyInfo Homer = new BuddyInfo("Robell", "Carleton", "613");

        System.out.println("Hello "+Homer.getName());

    }
}
