public class Employe {
    String name;
    double basicSalary;

    Employe(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateBonus() {
        double bonus;

        if (basicSalary > 40000) {
            bonus = basicSalary * 0.10;
        } else {
            bonus = basicSalary * 0.05;
        }

        System.out.println("Employe Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }

    public static void main(String[] args) {
        Employe emp = new Employe("Ram", 40000);
        emp.calculateBonus();
    }
}