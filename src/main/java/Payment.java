import java.util.Objects;

public class Payment {


    private String fullName;
    private int paymentAmount;
    private int day;
    private int month;
    private int year;
     Payment(){
        fullName = "Иванов Иван Иванович";
        day = 1;
        month = 1;
        year = 0;
        paymentAmount = 0;
    }

     Payment(String fullName, int paymentAmount, int day, int month, int year ) {
        this.fullName = fullName;
        this.paymentAmount = paymentAmount;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    Payment(Payment s)
    {
        fullName = s.fullName;
        paymentAmount = s.paymentAmount;
        day = s.day;
        month = s.month;
        year = s.year;
    }



    public int getPaymentAmount() {
        return paymentAmount;
    }
    public String getFullName() {
        return fullName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paymentAmount == payment.paymentAmount && day == payment.day && month == payment.month && year == payment.year && Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, paymentAmount, day, month, year);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fullName = " + fullName +
                ", paymentAmount=" + paymentAmount +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
