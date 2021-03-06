package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    /**
     * Description: Builds a new object of patient class
     * @param name Name to be assigned to the patient object
     * @param email email of the the patient object
     * **/
    public Patient(String name, String email){
        super(name, email);
    }



    public String getHeight(){
        return this.height +" m";
    }

    /**
     * Description: Set method to update height
     * @param height Height to update
     * */
    public void setHeight(Double height){
        this.height = height;
    }

    /**
     * Description: Getter method to get weight in kilograms
     * @return Returns the weight
     * */
    public String getWeight(){
        return this.height +" kg";
    }

    /**
     * Description: Set method to update weight
     * @param weight We to update
     * */
    public void setWeight(Double weight){
        this.weight = weight;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age: " + birthday + "\n Weight: " +getWeight()
                + "\n Height: " + getHeight() + "\n Blood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Patient");
        System.out.println("Historia desde nacimiento");
    }
}
