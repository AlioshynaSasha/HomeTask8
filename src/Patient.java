public class Patient {
    String name;
    int age;
    Doctor doctor;
    int treatmentPlan;

    public Patient(String name, int age, int treatmentPlan) {
        this.name = name;
        this.age = age;
        this.treatmentPlan = treatmentPlan;

        if (treatmentPlan == 1) {
            this.doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            this.doctor = new Dentist();
        } else {
            this.doctor = new Therapist();
        }
    }

    public Doctor getDoctor() {
        return doctor;
    }
}

