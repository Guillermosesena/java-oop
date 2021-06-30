public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    /**
     * Description: Builds a new object of patient class
     * @param name Name to be assigned to the patient object
     * @param email email of the the patient object
     * **/
    Patient(String name, String email){
        this.name = name;
        this.email =email;
    }

    /**
     * Description: Getter method to get name
     * @return Returns the name
     * */
    public String getName(){
        return this.name;
    }

    /**
     * Description: Set method to update name
     * @param name Name to update
     * */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Description: Getter method to get height in meters
     * @return Returns the height
     * */
    public String getHeight(){
        return this.height +" m";
    }

    /**
     * Description: Set method to update height
     * @param height Height to update
     * */
    public void setHeight(Double height){
        this.height = height;
    }

    /**
     * Description: Getter method to get weight in kilograms
     * @return Returns the weight
     * */
    public String getWeight(){
        return this.height +" kg";
    }

    /**
     * Description: Set method to update weight
     * @param weight We to update
     * */
    public void setWeight(Double weight){
        this.weight = weight;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
