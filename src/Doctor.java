public class Doctor {
    //Attributes
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building the Doctor object");
    }

    //Function overloading
    /**
     * Description: Build a new object of doctor class
     * @name Name to be assigned to the doctor object
     * **/
    Doctor(String name){
        System.out.println("The name assigned to the doctor object is: "+ name);
    }

    //Methods
    /**
     * Description: Print the name of the doctor.
     * */
    public void showName()
    {
        System.out.println(name);
    }
}
