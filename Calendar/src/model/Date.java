package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 27/08/17.
 */
public class Date {

    // Fields
    private int month;
    private int day;
    private int year;

    // Constants
    private List<String> months;
    int[] day_in_months = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;

        months = new ArrayList<>();
        pupulateMonths();
    }


    // Getters
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }


    // EFFECTS: Returns full date as string in format "month day, year"
    public String getFullDate() {
        String month = months.get(this.month - 1);
        String day   = Integer.toString(this.day);
        String year  = Integer.toString(this.year);
        return month + " " + day + getSuffix(this.day) + ", " + year;
    }


    // EFFECTS: Returns short date as string in format "MM/DD/YYYY"
    public String getShortDate() {
        return String.format("%02d/%02d/%d", month, day, year);
    }


    // EFFECTS: Returns date as 365 based day
    public int get365day() {
        int days = 0;
        int month = getMonth();
        for (int i = 0; i < month; i++) {
            days += day_in_months[i];
        }
        return days + getDay();
    }

    // EFFECTS: returns date as absolute natural
    public int getAbsoluteDate() {
        return 365 * getYear() + get365day();
    }


    // MODIFIES: this
    // EFFECTS: Populate this.months with month names
    private void pupulateMonths() {
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }


    // EFFECTS: Returns proper suffix for day in date
    private String getSuffix(int day) {
        if (day >= 11 && day <= 13) return "th";
        switch (day % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

}
