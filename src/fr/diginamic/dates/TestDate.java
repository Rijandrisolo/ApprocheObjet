package fr.diginamic.dates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TestDate {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Calendar cal= Calendar.getInstance();
        Date dateS = cal.getTime();
        System.out.println(dateS);
        System.out.println(date);
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/YYY");
        String dateFormatee= date1.format(date);
        System.out.println("Affichage date au format DD/MMM/YYYY : "+dateFormatee);
        //////
        String dateC="19/05/2016 à 23:59:30";
        System.out.println("String : "+dateC);
        SimpleDateFormat cDateC = new SimpleDateFormat("dd/MM/YYYY 'à' HH:mm:ss");
        Date vDate= cDateC.parse(dateC);
        System.out.println(vDate);

    }
}
