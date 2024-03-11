import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {
@Test
    public void copy() {
        String abc = new String("abc");
    StringProcessor helper = new StringProcessor();

        assertEquals("abcabcabcabc", helper.copy(abc, 4));
        assertEquals("abc", helper.copy(abc,1));
        assertEquals("", helper.copy(abc,0));
        try {
            helper.copy(abc, -1);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error is accepted");
        }
    }
    @Test
    public void entryOfString(){
        StringProcessor helper =  new StringProcessor();
        String one = new String("abcdefgabcababa");
        String two = null;
        try {
           helper.entryOfString(one, two);
            helper.entryOfString(one, "");

        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Error is accepted");
        }
        assertEquals(4,helper.entryOfString(one,"ab") );
        assertEquals(0,helper.entryOfString(one, "abcdefgabcababa2"));
        String three = "asasasa";
        assertEquals(3,helper.entryOfString(three,"asa"));
    }
   @Test
    public void swapNum123()
    {
       StringProcessor helper = new StringProcessor();
       String str = new String("1JZ-GTE, 2JZ, 31");
       assertEquals("oneJZ-GTE, twoJZ, threeone", helper.swapNum123(str));
       assertEquals("retwo5",helper.swapNum123("retwo5"));
    }
    @Test
    public void delete2Char() {
        StringProcessor helper = new StringProcessor();
        StringBuilder str = new StringBuilder("шла Саша по шоссе и сосала сушку");
           helper.delete2Char(str);
        assertEquals("шаСш ошсеиссл ук", str.toString());
    }

}