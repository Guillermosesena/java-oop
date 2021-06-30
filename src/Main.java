import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anah Salgado", "dentist");
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(),"10 pm");
        myDoctor.addAvailableAppointment(new Date(),"1 pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " +aA.getTime());
        }
    }
}
