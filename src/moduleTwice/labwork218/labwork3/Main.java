package moduleTwice.labwork218.labwork3;

import javax.xml.bind.SchemaOutputResolver;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale curLoc=Locale.getDefault();
        System.out.println("Current Locale: "+curLoc.getDisplayName());

        NumberFormat format= NumberFormat.getIntegerInstance();
        System.out.println("Integer "+format.format(200000000));

        format = NumberFormat.getNumberInstance();
        System.out.println("Double: " + format.format(3.2));

        format = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + format.getCurrency() + " " + format.format(2000000000));

        DateFormat dateFormatter = DateFormat.getDateInstance();
        Date currentDate = new Date();
        String date = dateFormatter.format(currentDate);
        System.out.println("Date: " + date);
    }
}
