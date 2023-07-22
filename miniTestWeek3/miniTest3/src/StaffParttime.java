public class StaffParttime extends Staff {
    private double workingHours;

    public StaffParttime() {
    }

    public StaffParttime(Integer id, String name, Integer age, Integer phoneNumber, String email, Address address, double workingHours) {
        super(id, name, age, phoneNumber, email, address);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "StaffParttime{" + super.toString() +
                "workingHours=" + workingHours +
                '}';
    }
}
