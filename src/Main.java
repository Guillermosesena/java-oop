import model.Doctor;
import model.Patient;
import model.User;

import javax.print.Doc;
import java.util.Date;

//import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@gmail.com");
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(),"10 pm");
        myDoctor.addAvailableAppointment(new Date(),"1 pm");

        //System.out.println(myDoctor.getAvailableAppointments());
        //System.out.println(myDoctor);
        /*for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " +aA.getTime());
        }*/
        /*model.Day allDays[] = model.Day.values();

        for (model.Day d: allDays) {
            System.out.println(d);
        }

        System.out.println(model.Day.MONDAY);
        System.out.println(model.Day.MONDAY.getSpanish());*/

        /*model.Patient patient = new model.Patient("Alejandra","alejandra@gmail.com");
        System.out.println(patient);*/
        User user = new Doctor("Anahi","anahi@gmail.com");
        user.showDataUser();
        User userPa = new Patient("Anahi", "ana@gmail.com");
                userPa.showDataUser();
    }
}
