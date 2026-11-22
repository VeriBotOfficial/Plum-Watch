package com.wakeup.common.temp.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ClockModel implements Serializable {
    private int hour;
    private boolean isInvalidAlarm;
    private int min;
    private boolean open;
    private int remindFlags;
    private String repeat;
    private String tip;

    public ClockModel(boolean open, int hour, int min, String tip, String repeat, int remindFlags, boolean isInvalidAlarm) {
        this.open = open;
        this.hour = hour;
        this.min = min;
        this.tip = tip;
        this.repeat = repeat;
        this.remindFlags = remindFlags;
        this.isInvalidAlarm = isInvalidAlarm;
    }

    public boolean isInvalidAlarm() {
        return this.isInvalidAlarm;
    }

    public void setInvalidAlarm(boolean invalidAlarm) {
        this.isInvalidAlarm = invalidAlarm;
    }

    public int getRemindFlags() {
        return this.remindFlags;
    }

    public void setRemindFlags(int remindFlags) {
        this.remindFlags = remindFlags;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getRepeat() {
        return this.repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }
}
