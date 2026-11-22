package com.bytedance.sdk.component.tw;

/* loaded from: classes13.dex */
public abstract class tw implements Comparable<tw>, Runnable {
    private int fxn;
    private String kg;

    public tw(String str, int i) {
        this.fxn = 0;
        this.fxn = i == 0 ? 5 : i;
        this.kg = str;
    }

    public tw(String str) {
        this.fxn = 5;
        this.kg = str;
    }

    public void setPriority(int i) {
        this.fxn = i;
    }

    public int getPriority() {
        return this.fxn;
    }

    @Override // java.lang.Comparable
    public int compareTo(tw twVar) {
        if (getPriority() < twVar.getPriority()) {
            return 1;
        }
        return getPriority() >= twVar.getPriority() ? -1 : 0;
    }

    public String getName() {
        return this.kg;
    }
}
