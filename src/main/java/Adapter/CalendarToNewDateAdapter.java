package Adapter;

import java.util.Calendar;

public class CalendarToNewDateAdapter implements NewDateInterface{

    Calendar calendar;

    public CalendarToNewDateAdapter() {
        calendar = Calendar.getInstance();
    }
    @Override
    public void setDay(int day) {
        if (day < 1 || day > 31) throw new IllegalArgumentException("Invalid day");
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Invalid month");
        // Calendar months are zero indexed, hence the -1
        calendar.set(Calendar.MONTH, month - 1);
    }

    @Override
    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getMonth() {
        // Calendar months are zero indexed, hence the +1
        return calendar.get(Calendar.MONTH) + 1;
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(Calendar.DAY_OF_MONTH, days);
    }
}
