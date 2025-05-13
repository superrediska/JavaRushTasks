package com.javarush.task.pro.task13.task1317;

public class Month {
    // Константы месяцев
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    private final int order;
    private Month(int order) {
        this.order = order;
    }

    public int ordinal() {
        return this.order;
    }

    public static Month[] values() {
        return new Month[] {
                JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
                JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        };
    }
}