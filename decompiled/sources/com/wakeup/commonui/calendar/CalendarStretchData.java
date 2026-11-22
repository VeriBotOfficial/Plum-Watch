package com.wakeup.commonui.calendar;

import org.joda.time.LocalDate;

/* loaded from: classes2.dex */
public class CalendarStretchData {
    private int backgroundColor;
    private LocalDate date;
    private int textColor;
    private String value;

    public CalendarStretchData() {
    }

    public CalendarStretchData(LocalDate localDate, String str, int i, int i2) {
        this.date = localDate;
        this.value = str;
        this.backgroundColor = i;
        this.textColor = i2;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate localDate) {
        this.date = localDate;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }

    public String toString() {
        return "CalendarStretchData{date='" + this.date + "', value='" + this.value + "'}";
    }
}
