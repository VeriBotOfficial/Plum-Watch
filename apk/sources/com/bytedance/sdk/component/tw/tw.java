package com.bytedance.sdk.component.tw;

/* JADX INFO: loaded from: classes15.dex */
public abstract class tw implements Comparable<tw>, Runnable {
    private int fxn;
    private String kg;

    public tw(String str, int r3) {
        this.fxn = 0;
        this.fxn = r3 == 0 ? 5 : r3;
        this.kg = str;
    }

    public tw(String str) {
        this.fxn = 5;
        this.kg = str;
    }

    public void setPriority(int r1) {
        this.fxn = r1;
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
