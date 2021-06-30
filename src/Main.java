//import java.util.Date;

//import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        /*Doctor myDoctor = new Doctor("Anah Salgado", "dentist");
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(),"10 pm");
        myDoctor.addAvailableAppointment(new Date(),"1 pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " +aA.getTime());
        }*/
        /*Day allDays[] = Day.values();

        for (Day d: allDays) {
            System.out.println(d);
        }

        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getSpanish());*/

        Patient patient = new Patient("Alejandra","alejandra@gmail.com");
        System.out.println(patient);

    }
}
