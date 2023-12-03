public class RatePayment extends Worker{

    public String paymentMethod;

    public int salary;

    public int daysCount;

    public RatePayment(String name, String surname, String paymentMethod, int salary, int daysCount) {
        super(name, surname);
        this.paymentMethod = paymentMethod;
        this.salary = salary;
        this.daysCount = daysCount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getSalary() {
        return salary;
    }
    public int getDaysCount() {
        return daysCount;
    }

    public int getPayment(){
        return getSalary()*getDaysCount();
    }
}
