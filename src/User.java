public class User {
    static int id = 0;
    protected String name;
    protected String email;
    protected String address;
    protected String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    /**
     * Description: Getter method to get name
     * @return Returns the name
     * * */
    public String getName() {
        return name;
    }

    /**
     * Description: Set method to update name
     * @param name Name to update
     * */
    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("The phone number has to have maximum of eight digits");
        }
        else if(phoneNumber.length() == 8)
            this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User: " + name +", Email:" + email +
                "\nAddress: "+ address + " Phone: " + phoneNumber;
    }
}
