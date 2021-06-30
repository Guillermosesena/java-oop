public class Doctor {
    //Attributes
    static int id = 0;//autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building the Doctor object");
    }

    //Function overloading
    /**
     * Description: Build a new object of doctor class
     * @name Name to be assigned to the doctor object
     * @speciality Speciality to be assigned to the doctor object
     * **/
    Doctor(String name, String speciality){
        System.out.println("The name assigned to the doctor object is: "+ name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Methods
    /**
     * Description: Print the name of the doctor.
     * */
    public void showName()
    {
        System.out.println(name);
    }

    /**
     * Description: Print the id of the last doctor object created.
     * */
    public void showId()
    {
        System.out.println("Doctor ID: "+ id);
    }
}
