public class Patient {
    private String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;
    private double height;
    String blood;

    /**
     * Description: Build a new object of patient class
     * @name Name to be assigned to the patient object
     * @email email of the the patient object
     * **/
    Patient(String name, String email){
        this.name = name;
        this.email =email;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
