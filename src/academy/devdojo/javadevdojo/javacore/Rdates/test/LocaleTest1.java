package academy.devdojo.javadevdojo.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale LocaleIndia = new Locale("hi", "IN");
        Locale LocaleJapao = new Locale("ja", "JP");
        Locale LocaleHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, LocaleIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, LocaleJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, LocaleHolanda);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suíça " + df2.format(calendar.getTime()));
        System.out.println("India " + df3.format(calendar.getTime()));
        System.out.println("Japao " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(LocaleJapao));
        System.out.println(localeCH.getDisplayCountry(LocaleHolanda));
    }
}
