package com.necer.enumeration;

import java.io.Serializable;

/* loaded from: classes17.dex */
public enum CalendarState implements Serializable {
    WEEK(100),
    MONTH(101),
    MONTH_STRETCH(102);

    private int value;

    CalendarState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static CalendarState valueOf(int i) {
        switch (i) {
            case 100:
                return WEEK;
            case 101:
                return MONTH;
            case 102:
                return MONTH_STRETCH;
            default:
                return null;
        }
    }
}
