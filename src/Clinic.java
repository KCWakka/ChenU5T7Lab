public class Clinic {
    private static int totalClinics;
    private static int totalVaccineCount;
    private int clinicVaccineCount;
    private Person recentperson;
    public Clinic() {
        clinicVaccineCount = 0;
        totalClinics++;
        recentperson = null;
    }
    public static int getTotalClinics() {
        return totalClinics;
    }
    public static int getTotalVaccineCount() {
        return totalVaccineCount;
    }
    public int getClinicVaccineCount() {
        return clinicVaccineCount;
    }
    public boolean vaccinate(Person person) {
        if (!person.isVaccinated()) {
            recentperson = person;
            clinicVaccineCount++;
            totalVaccineCount++;
            person.setVaccinated(true);
            return true;
        } else {
            return false;
        }
    }
    public Person mostRecentlyVaccinated () {
        return recentperson;
    }
}
