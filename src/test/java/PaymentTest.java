import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class PaymentTest {


    @Test
    public void testToString() {
        Payment test = new Payment("Иванов Иван Иванович",1000, 15, 10, 2011);
        Payment test2 = new Payment("Смирнов Игорь Игоревич",20526,31,12,2018);

        assertEquals("Payment{fullName = Иванов Иван Иванович, paymentAmount=1000, day=15, month=10, year=2011}" , test.toString());
        assertEquals("Payment{fullName = Смирнов Игорь Игоревич, paymentAmount=20526, day=31, month=12, year=2018}", test2.toString());
    }
    @Test
    public void equals(){
    Payment one = new Payment("Иванов Петр Константинович", 1000, 31,12,2011);
    Payment two = new Payment();
    Payment three = new Payment("Иванов Петр Константинович", 1000, 31,12,2011);

    assertFalse(one.equals(two));
    assertTrue(three.equals(one));
    }
}