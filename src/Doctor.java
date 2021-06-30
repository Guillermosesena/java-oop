import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Attributes
    private String speciality;

    /**
     * Description: Builds a new object of doctor class
     * @param name Name to be assigned to the doctor object
     * @param email Email of the the doctor object
     * **/
    Doctor(String name, String email){
        super(name, email);
        System.out.println("The name assigned to the doctor object is: "+ name);
        id++;
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Methods
    /**
     * Description: Prints the name of the doctor.
     * */
    /*public void showName()
    {
        System.out.println(name);
    }*/

    /*/**
     * Description: Prints the id of the last doctor object created.
     * *
    /*public void showId()
    {
        System.out.println("Doctor ID: "+ id);
    }*/

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality
                + "\n Available: " + availableAppointments.toString();
    }


    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: "+ time;
        }
    }



}
