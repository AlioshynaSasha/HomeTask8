public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Valik", 90, 2);
        patient.getDoctor().treat();
    }
}
