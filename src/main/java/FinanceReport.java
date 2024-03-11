import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] arrPayment;
    private int day;
    private int month;
    private int year;
    private String fullNameReporter;

    FinanceReport() {
        day = 0;
        month = 0;
        year = 0;
        fullNameReporter = "не записан";
        arrPayment = new Payment[0];
    }
    FinanceReport(int size) {
        arrPayment = new Payment[size];
        for (int i = 0; i < size; i++) {
            arrPayment[i] = new Payment();
        }
        day = 0;
        month = 0;
        year = 0;
        fullNameReporter = "не записан";
    }
    FinanceReport(FinanceReport old){
        day = old.day;
        month = old.month;
        year = old.year;
        fullNameReporter = old.fullNameReporter;
        int size = old.getArrPaymentQuantity();
        Payment[] arrPayment = new Payment[size];
        for (int i = 0; i < size; i++)
        {
            arrPayment[i] = new Payment(old.arrPayment[i].getFullName(), old.arrPayment[i].getPaymentAmount(),old.arrPayment[i].getDay(),old.arrPayment[i].getMonth(), old.arrPayment[i].getYear());
        }
    }
    FinanceReport(int dd, int mm, int yy, String fullNameReporter, Payment... arr )
    {
        day = dd;
        month = mm;
        year = yy;
        this.fullNameReporter = fullNameReporter;
        arrPayment = new Payment[arr.length];
        for(int i = 0; i < arrPayment.length ; i++){
            arrPayment[i] = new Payment(arr[i].getFullName(), arr[i].getPaymentAmount(), arr[i].getDay(), arr[i].getMonth(), arr[i].getYear());
        }

    }

    public int getArrPaymentQuantity() {
        return arrPayment.length;
    }

    public void setPaymentI(int i,Payment pay) {
       arrPayment[i].setPaymentAmount(pay.getPaymentAmount());
       arrPayment[i].setFullName(pay.getFullName());
        arrPayment[i].setDay(pay.getDay());
        arrPayment[i].setMonth(pay.getMonth());
        arrPayment[i].setYear(pay.getYear());
    }
    public Payment getPaymentI(int i){
        Payment result = new Payment(arrPayment[i].getFullName(), arrPayment[i].getPaymentAmount(), arrPayment[i].getDay(), arrPayment[i].getMonth(), arrPayment[i].getYear());
        return  result;
    }

    @Override
    public String toString() {

        String pay = "";
        for (int i = 0; i < arrPayment.length; i++) {
            pay = pay + String.format("Плательщик:%s дата: %d.%d.%d  сумма: %d руб. %d коп. ,\n", arrPayment[i].getFullName() , arrPayment[i].getDay() , arrPayment[i].getMonth() , arrPayment[i].getYear() , arrPayment[i].getPaymentAmount()/100 , arrPayment[i].getPaymentAmount() % 100 );
        }

        return  String.format("[Автор: %s, Дата: %d.%d.%d, Платежи: \n [%s]]", fullNameReporter, day, month,year, pay);
    }

    public Payment[] getArrPayment() {
        return arrPayment;
    }

    public String getFullNameReporter() {
        return fullNameReporter;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day && month == that.month && year == that.year && Arrays.equals(arrPayment, that.arrPayment) && Objects.equals(fullNameReporter, that.fullNameReporter);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(day, month, year, fullNameReporter);
        result = 31 * result + Arrays.hashCode(arrPayment);
        return result;
    }
}
