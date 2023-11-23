package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();

        cal.set(2016,04,11,23,59,30);
        Date sDate = cal.getTime();
        SimpleDateFormat date1 = new SimpleDateFormat("YYY/MM/dd HH:mm:ss");
        String dateFormatee= date1.format(sDate);
        System.out.println("Date format au YYY/MM/dd HH:mm:ss :"+dateFormatee);
        SimpleDateFormat date2 = new SimpleDateFormat("YYY/MMM/dd HH:mm:ss");
        String dateFormatee2= date2.format(sDate);
        System.out.println("Date format au YYY/MM/dd HH:mm:ss :"+dateFormatee2);
        DateFormat df;
        df = DateFormat.getDateInstance(1,Locale.FRENCH);
        System.out.println(df.toString());
       // String dateAffiche = df.format(dateFormatee2);
        //System.out.println("United Kingdom: " + dateAffiche);

    }

  }
