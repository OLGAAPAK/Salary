public class Piecework extends Worker{
    public String paymentMethod;
    public int salary;

    public int projectCount;

    public Piecework(String name, String surname, String paymentMethod, int salary, int projectCount) {
        super(name, surname);
        this.paymentMethod = paymentMethod;
        this.salary = salary;
        this.projectCount = projectCount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getSalary() {
        return salary;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public int getPayment(){

        return getSalary()*getProjectCount();
    }
}
