import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Patient myPatient = new Patient("Juan Hernandez","juan.hernandez@gmail.com");

        myPatient.setWeight(60.0);
        System.out.println(myPatient.getWeight());
        myPatient.setPhoneNumber("1234567890");
        System.out.println(myPatient.getPhoneNumber());

    }
}
