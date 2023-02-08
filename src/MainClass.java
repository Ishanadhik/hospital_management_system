import model.tests;
import model.patients;
public class MainClass {
    public static void main(String[] args) {
        tests ecg=new tests("ECG",2500);
        tests echo=new tests("ECHO",2000);
        tests xray=new tests("xray",1500);

        patients patient1=new patients("Ishan",18);

        patient1.runtest(ecg);

    }
}
