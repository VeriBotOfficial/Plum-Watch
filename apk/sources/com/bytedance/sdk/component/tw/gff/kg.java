package com.bytedance.sdk.component.tw.gff;

/* JADX INFO: loaded from: classes15.dex */
public abstract class kg implements Comparable<kg>, Runnable {
    private long bh;
    private int fxn;
    private Runnable gff;
    private long hm;
    private String kg;
    private long rb;

    public kg(String str) {
        this.fxn = 5;
        this.kg = str;
    }

    public kg(int r1, String str) {
        this.fxn = r1;
        this.kg = str;
    }

    public kg(String str, Runnable runnable) {
        this.fxn = 5;
        this.kg = str;
        this.gff = runnable;
    }

    public void fxn(int r1) {
        this.fxn = r1;
    }

    public int fxn() {
        return this.fxn;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(kg kgVar) {
        if (fxn() < kgVar.fxn()) {
            return 1;
        }
        return fxn() >= kgVar.fxn() ? -1 : 0;
    }

    public String kg() {
        return this.kg;
    }

    public long gff() {
        return this.hm;
    }

    public void fxn(long j) {
        this.hm = j;
    }

    public long hm() {
        return this.rb;
    }

    public void kg(long j) {
        this.rb = j;
    }

    public long rb() {
        return this.bh;
    }

    public void gff(long j) {
        this.bh = j;
    }

    public Runnable bh() {
        return this.gff;
    }
}
