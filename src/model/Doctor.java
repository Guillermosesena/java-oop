package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Attributes
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    private String speciality;

    /**
     * Description: Builds a new object of doctor class
     * @param name Name to be assigned to the doctor object
     * @param email Email of the the doctor object
     * **/
    public Doctor(String name, String email){
        super(name, email);
        id++;
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
        System.out.println("model.Doctor ID: "+ id);
    }*/



    public void addAvailableAppointment(String date, String time){

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

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamente: Oncología");
    }


    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            }catch (ParseException e){
                e.printStackTrace();
            }
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
        public String getDate(String DATE) {
            return format.format(date);
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
