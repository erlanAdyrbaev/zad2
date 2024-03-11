import java.util.ArrayList;

public class FinanceReportProcessor {
    public static FinanceReport findNamePayment(FinanceReport report, String c){

        Payment[] paymentArr = report.getArrPayment();
        ArrayList<Payment> list = new ArrayList<>();
        for(int i = 0; i < report.getArrPaymentQuantity();i++)
        {
            if(paymentArr[i].getFullName().indexOf(c) == 0)
            {
                list.add(paymentArr[i]);
            }

        }
        Payment[] array  = new Payment[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] =  list.get(i);
        }
        FinanceReport result = new FinanceReport(report.getDay(), report.getMonth(), report.getYear(), report.getFullNameReporter(), array);
        return result;
    }
    public static FinanceReport findAmountPayment(FinanceReport rep,  int num)
    {
        Payment[] paymentArr = rep.getArrPayment();
        ArrayList<Payment> list = new ArrayList<>();
        for(int i = 0; i < rep.getArrPaymentQuantity();i++)
        {
            if(paymentArr[i].getPaymentAmount() < num)
            {
                list.add(paymentArr[i]);
            }

        }
        Payment[] array  = new Payment[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] =  list.get(i);
        }
        FinanceReport result = new FinanceReport(rep.getDay(), rep.getMonth(), rep.getYear(), rep.getFullNameReporter(), array);
        return result;

    }
}
