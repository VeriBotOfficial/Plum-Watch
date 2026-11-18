package com.necer.enumeration;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum CalendarState implements Serializable {
    WEEK(100),
    MONTH(101),
    MONTH_STRETCH(102);

    private int value;

    CalendarState(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }

    public static CalendarState valueOf(int r0) {
        switch (r0) {
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
