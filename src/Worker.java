public abstract class Worker {

    private String name;
    private String surname;

   // private String paymentTitle;


    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract int getPayment();
    public abstract String getPaymentMethod();
}
