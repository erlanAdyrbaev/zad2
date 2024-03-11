import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    @Test
    public void findNamePayment() {

        Payment[] pay = new Payment[4];
        pay[0] = new Payment("Нестеров Иван Петрович", 16, 1, 1, 1999);
        pay[1] = new Payment();
        pay[2] = new Payment(" Борис Асанов Кириллович", 12, 2, 12, 2011);
        pay[3] = new Payment("Ильин Евгений Дмитриевич", 121, 2, 12, 2009);

        FinanceReport finRep = new FinanceReport(1, 2, 3, "Попов Сергей Петрович", pay);

        FinanceReport one = FinanceReportProcessor.findNamePayment(finRep, "И");
        FinanceReport two = FinanceReportProcessor.findNamePayment(finRep, "C");

        FinanceReport expectedOne = new FinanceReport(1, 2, 3, "Попов Сергей Петрович", pay[1], pay[3]);
        Payment[] arr = new Payment[0];
        FinanceReport expectedTwo = new FinanceReport(1, 2, 3, "Попов Сергей Петрович", arr);

        assertEquals(expectedTwo, two);
        assertEquals(expectedOne, one);
    }

    @Test
    public void findAmountPayment() {
        Payment[] pay = new Payment[4];
        pay[0] = new Payment("Нестеров Иван Петрович", 1126, 1, 1, 1999);
        pay[1] = new Payment();
        pay[2] = new Payment(" Борис Асанов Кириллович", 120, 2, 12, 2011);
        pay[3] = new Payment("Ильин Евгений Дмитриевич", 121, 2, 12, 2009);
        FinanceReport finRep = new FinanceReport(1, 2, 3, "Попов Сергей Петрович", pay);
        FinanceReport one = FinanceReportProcessor.findAmountPayment(finRep,121);
        FinanceReport expected = new FinanceReport(1, 2, 3, "Попов Сергей Петрович", pay[1],pay[2]);
        assertEquals(expected, one);
    }
}