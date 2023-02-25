import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendary {

    String date;

    public Calendary() {
    }

    public String getDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.date = String.valueOf(gregorianCalendar.getTime());
        return date;
    }

    public String setDate(int dat) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.roll(Calendar.DATE, dat);
        date = String.valueOf(gregorianCalendar.getTime());
        return date;
    }

    @Override
    public String toString() {
        return date;
    }
}
