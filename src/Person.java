public class Person {
    private String name;
    private boolean vaccinated;
    public Person(String name) {
        this.name = name;
        vaccinated = false;
    }
    public String getName() {
        return name;
    }
    public Boolean isVaccinated() {
        return vaccinated;
    }
    public void setVaccinated(Boolean value) {
        vaccinated = value;
    }
}
