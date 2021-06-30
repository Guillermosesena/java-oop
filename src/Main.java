import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        /*Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor("Ann Sanchez","pediatrician");
        System.out.println(myDoctorAnn.speciality);
        myDoctor.showId();*/


        Patient myPatient = new Patient("Juan Hernandez","juan.hernandez@gmail.com");
        Patient myPatient2 = new Patient("Anahi","anahi.com");

        System.out.println(myPatient.getName());
        System.out.println(myPatient2.getName());
        myPatient2 = myPatient;
        System.out.println(myPatient.getName());
        System.out.println(myPatient2.getName());
        myPatient2.setName("David");
        System.out.println(myPatient.getName());
        //showMenu();
       // Patient myPatient = new Patient("Juan Hernandez","juan.hernandez@gmail.com");

    }
}
