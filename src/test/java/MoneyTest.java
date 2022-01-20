import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void TestAddCanadians() {
        Money m1 = new Money(10,"CAN");
        Money m2 = new Money(11, "CAN");

        Money expected = new Money(21,"CAN");

        assertEquals(expected,m1.add(m2));
    }

}
