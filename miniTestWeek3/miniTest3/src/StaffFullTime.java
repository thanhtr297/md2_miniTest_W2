public class StaffFullTime extends Staff {
    private double bonus;
    private double forfeit;
    private double hardSalary;

    public StaffFullTime(Integer id, String name, Integer age, Integer phoneNumber, String email, Address address, double bonus, double forfeit, double hardSalary) {
        super(id, name, age, phoneNumber, email, address);
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getForfeit() {
        return forfeit;
    }

    public void setForfeit(double forfeit) {
        this.forfeit = forfeit;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return "StaffFullTime {" + super.toString() +
                "bonus=" + bonus +
                ", forfeit=" + forfeit +
                ", hardSalary=" + hardSalary +
                '}';
    }
}
