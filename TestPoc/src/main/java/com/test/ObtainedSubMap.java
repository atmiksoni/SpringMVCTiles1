package com.test;
import java.util.*;

/**
 * Created by soniiatm on 6/4/2017.
 */
/**
 * Example 128 - Obtaining a SubMap
 */

class Time implements Comparable<Time> {

    public final int hh, mm;

    Time(int hh, int mm) {
        this.hh = hh;
        this.mm = mm;
    }


    @Override
    public int compareTo(Time t) {
        //if hours are same
        return hh != t.hh ? hh - t.hh: mm - t.mm;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Time t = (Time) o;
        return hh == t.hh && mm == t.mm;
    }

    public int hashCode() {
        return 60 * hh + mm;
    }
}
class ObtainedSubMap {

    public static void main(String[] args) {
        SortedMap<Time, String> datebook = new TreeMap<Time, String>();
        datebook.put(new Time(12, 30), "Lunch");
        datebook.put(new Time(15, 30), "Afternoon coffee break");
        datebook.put(new Time(9, 0), "Lecture");
        datebook.put(new Time(13, 15), "Board Meeting");
        datebook.put(new Time(12, 45), "Stand up");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        System.out.println("Hour:"+hours + ":: Minutes"+minutes);
        SortedMap<Time, String> pm = datebook.tailMap(new Time(hours, minutes));

        for (Map.Entry<Time, String> entry: pm.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}