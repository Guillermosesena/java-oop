import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor("Ann Sanchez","pediatrician");
        System.out.println(myDoctorAnn.speciality);
        myDoctor.showId();

        //showMenu();
       // Patient myPatient = new Patient("Juan Hernandez","juan.hernandez@gmail.com");

    }
}
