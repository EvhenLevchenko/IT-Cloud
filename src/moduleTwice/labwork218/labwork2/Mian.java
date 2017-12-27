package moduleTwice.labwork218.labwork2;

import java.math.BigDecimal;

public class Mian {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("1.0");
        int count = 0;

        BigDecimal first = new BigDecimal("0.1");

        for (BigDecimal i = first; money.compareTo(new BigDecimal("0.0")) > 0; i = i.add(first)) {
            money = money.subtract(i);
            count++;
        }
        System.out.println(count + " nails was bought. $" + money + " is left. :-(");
    }
}

