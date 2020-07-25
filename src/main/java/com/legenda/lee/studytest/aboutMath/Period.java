package com.legenda.lee.studytest.aboutMath;

import java.util.*;

public class Period {
    private Set<Integer> hours;
    private int start;
    private int end;

    private Period() {
    }

    public Period(int start, int end) {
        hours = new TreeSet<>();
        for (int i = start; i <= end; i++) {
            hours.add(i);
        }
        this.start = start;
        this.end = end;
    }

    public Period merge(Period next) {
        hours.addAll(next.hours);
        return this;
    }

    public List<Period> getContainsPeriods() {
        Integer[] res = new Integer[hours.size()];
        hours.toArray(res);

        List<Period> list = new ArrayList<>();
        Period current = null;
        for (int i = 0; i < res.length; i++) {
            int item = res[i];
            int itemNext = res[Math.min(i + 1, res.length - 1)];

            if (current == null) {
                current = new Period();
                current.start = item;
            }

            if (itemNext > item + 1 || itemNext == item) {
                current.end = item;
                list.add(current);
                current = null;
            }
        }
        return list;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + "," + end + "]";
    }
}