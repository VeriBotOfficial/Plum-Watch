package com.haibin.calendarview;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
final class Month implements Serializable {
    private int count;
    private int diff;
    private int month;
    private int year;

    Month() {
    }

    int getDiff() {
        return this.diff;
    }

    void setDiff(int r1) {
        this.diff = r1;
    }

    int getCount() {
        return this.count;
    }

    void setCount(int r1) {
        this.count = r1;
    }

    int getMonth() {
        return this.month;
    }

    void setMonth(int r1) {
        this.month = r1;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int r1) {
        this.year = r1;
    }
}
