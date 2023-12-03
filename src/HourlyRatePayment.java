public class HourlyRatePayment extends Worker{
    public String paymentMethod;
    public int salary;

    private int hoursCount;
    private int daysInMonth;

    public HourlyRatePayment(String name, String surname, String paymentMethod, int salary, int hoursCount, int daysInMonth) {
        super(name, surname);
        this.paymentMethod = paymentMethod;
        this.salary = salary;
        this.hoursCount = hoursCount;
        this.daysInMonth = daysInMonth;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getSalary() {
        return salary;
    }

    public int getHoursCount() {
        return hoursCount;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getPayment(){

        return getSalary()*getHoursCount() *getDaysInMonth();
    }
}
