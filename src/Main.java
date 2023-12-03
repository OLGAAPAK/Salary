public class Main {
    public static void main(String[] args) {

        RatePayment ivanov = new RatePayment("Ivan", "Ivanov","RatePayment", 4000, 22);
        HourlyRatePayment sidorov = new HourlyRatePayment("Andrey", "Sidorov", "HourlyRatePayment", 500, 9, 20);
        Piecework petrov = new Piecework("Aleksey", "Petrov", "Piecework", 10000, 3);

        Worker[] workers = new Worker[]{ivanov, sidorov, petrov};
        int sumPayment = 0;
        for (Worker worker : workers) {
            sumPayment = sumPayment + worker.getPayment();
            System.out.println(worker.getSurname() + " " + worker.getPaymentMethod() + " " + worker.getPayment());
        }
        System.out.println("Total payment = " + sumPayment);
    }
}