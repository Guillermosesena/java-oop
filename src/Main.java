import model.*;

import javax.print.Doc;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@gmail.com");
        myDoctor.addAvailableAppointment("05/05/2021","4 pm");
        myDoctor.addAvailableAppointment("05/05/2021","10 pm");
        myDoctor.addAvailableAppointment("05/05/2021","1 pm");

        showMenu();
        System.exit(0);
        /*
        User user = new Doctor("Anahi","anahi@gmail.com");
        user.showDataUser();
        User userPa = new Patient("Anahi", "ana@gmail.com");
                userPa.showDataUser();
        User user_ = new User("Ahani","ana@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
            }
        };
        user_.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedulable(Date date, String time) {

            }
        } ;*/

    }
}
