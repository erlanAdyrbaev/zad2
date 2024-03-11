import org.junit.Test;
import static org.junit.Assert.*;
public class FinanceReportTest {
    @Test
    public void setPaymentI() {
        Payment one = new Payment();

        Payment two = new Payment("Козлов Стас Станиславович", 130212, 12,5,2013);
        Payment three = new Payment("Лебедев Михаил Сергеевич", 200,1,2,2019);
        Payment four = new Payment("Авдеев Владимир Петрович",1300,1,2,2014);

        FinanceReport finRep = new FinanceReport(1,2,2020, "Семёнов Сергей Константинович", one, two, three);
        FinanceReport finRep2 = new FinanceReport(1,2,2020, "Семёнов Сергей Константинович", two,three,four);
        finRep.setPaymentI(1 ,four);
        finRep2.setPaymentI(2,one);
        assertEquals(four, finRep.getArrPayment()[1]);
        assertEquals(one, finRep2.getArrPayment()[2]);

    }

    @Test
    public void tostring() {
        Payment one = new Payment();
        Payment two = new Payment("Козлов Стас Станиславович", 130212, 12,5,2013);
        Payment three = new Payment("Лебедев Михаил Сергеевич", 200,1,2,2019);
        Payment four = new Payment("Авдеев Владимир Петрович",1300,1,2,2014);

        FinanceReport finRep = new FinanceReport(1,2,2020, "Семёнов Сергей Константинович", four, three, two, one);
        assertEquals("[Автор: Семёнов Сергей Константинович, Дата: 1.2.2020, Платежи: \n" +
                " [Плательщик:Авдеев Владимир Петрович дата: 1.2.2014  сумма: 13 руб. 0 коп. ,\n" +
                "Плательщик:Лебедев Михаил Сергеевич дата: 1.2.2019  сумма: 2 руб. 0 коп. ,\n" +
                "Плательщик:Козлов Стас Станиславович дата: 12.5.2013  сумма: 1302 руб. 12 коп. ,\n" +
                "Плательщик:Иванов Иван Иванович дата: 1.1.0  сумма: 0 руб. 0 коп. ,\n" +
                "]]",finRep.toString());
    }
    @Test
    public void getPaymentI() {
        Payment one = new Payment();
        Payment two = new Payment("Козлов Стас Станиславович", 130212, 12,5,2013);
        Payment three = new Payment("Лебедев Михаил Сергеевич", 200,1,2,2019);
        Payment four = new Payment("Авдеев Владимир Петрович",1300,1,2,2014);

        FinanceReport finRep = new FinanceReport(1,2,2020, "Семёнов Сергей Константинович", four, three, two, one);
        assertEquals(four, finRep.getPaymentI(0));
        assertEquals(two, finRep.getPaymentI(2));
    }


}