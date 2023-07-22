public class StaffFulltime extends Staff {
    private double bonus;
    private double forfeit;
    private double hardSalary;

    public StaffFulltime(Integer id, String name, Integer age, Integer phoneNumber, String email, Address address, double bonus, double forfeit, double hardSalary) {
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
        return "StaffFulltime {" + super.toString() +
                "bonus=" + bonus +
                ", forfeit=" + forfeit +
                ", hardSalary=" + hardSalary +
                '}';
    }
}
