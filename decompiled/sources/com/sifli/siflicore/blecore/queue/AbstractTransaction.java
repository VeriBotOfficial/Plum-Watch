package com.sifli.siflicore.blecore.queue;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes14.dex */
public abstract class AbstractTransaction {
    private final long creationTimestamp = System.currentTimeMillis();
    private final String mName;

    public abstract int getActionCount();

    public AbstractTransaction(String str) {
        this.mName = str;
    }

    public String getTaskName() {
        return this.mName;
    }

    protected String getCreationTime() {
        return DateFormat.getTimeInstance(2).format(new Date(this.creationTimestamp));
    }

    public String toString() {
        return String.format(Locale.US, "%s: Transaction task: %s with %d actions", getCreationTime(), getTaskName(), Integer.valueOf(getActionCount()));
    }
}
