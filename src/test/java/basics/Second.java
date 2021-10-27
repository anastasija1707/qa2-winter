package basics;

import java.math.BigDecimal;

public class Second {
    private void test() {
        MyFirstJavaClass firstClass = new MyFirstJavaClass();
        firstClass.sumTwoDigits(2, 5);

        int x = firstClass.sumTwoDigits(4,8);

        MyFirstJavaClass b = new MyFirstJavaClass();
        b.sumTwoDigits(6,9);

        BigDecimal t = new BigDecimal(4);
        int y = t.intValue();
    }
}
