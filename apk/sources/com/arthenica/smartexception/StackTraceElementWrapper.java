package com.arthenica.smartexception;

/* JADX INFO: loaded from: classes16.dex */
public class StackTraceElementWrapper {
    private final StackTraceElement stackTraceElement;

    public StackTraceElementWrapper(StackTraceElement stackTraceElement) {
        this.stackTraceElement = stackTraceElement;
    }

    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
