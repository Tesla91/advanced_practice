package strings_arrays;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by ryandesmond on 7/10/17.
 */


/*
    Write the code to create, parse modify and format a variety of dates and DateFormats.
 */
public class CreateCalendar {

    public static void main(String[] args) {

        // Create a Calendar object and set it's date to July 1, 2017.

        Calendar calendar = new GregorianCalendar(2017, 6, 1, 15, 00);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        dateFormat.setTimeZone(calendar.getTimeZone());


        // sout(date)
        System.out.println("Original Date: " + dateFormat.format(calendar.getTime()) );

        // Subtract 4 hours from Calendar
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy HH:MM");
        System.out.println("Hour before change: " + dateFormat.format(calendar.getTime()) );
        calendar.add(Calendar.HOUR, -4);

        // sout(date)
        System.out.println("Hour after change: " + dateFormat.format(calendar.getTime()) );

        // add 1 week to the date
        calendar.add(Calendar.DATE, 7);

        // sout(date)
        System.out.println("Day after change: " + dateFormat.format(calendar.getTime()) );

        // Format the date to show yyyy-MM-dd (ie, "2017-06-26") using SimpleDateFormat class
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // sout(date)
        System.out.println("Date after format change: " + dateFormat.format(calendar.getTime()) );

        // demostrate modifying the format of the date at least two other ways, (ie, "07-04-2017" or "Wed March 26 00:00:00 EST 2017")
        dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Date after format 2 change: " + dateFormat.format(calendar.getTime()) );
        dateFormat = new SimpleDateFormat("EE MMMM dd HH:mm:MM z");

        // sout(date)
        System.out.println("Date after format 3 change: " + dateFormat.format(calendar.getTime()) );

    }
}
