package com.bytedance.sdk.component.fxn;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class zu {
    public final String bh;
    public final int fxn;
    public final String gff;
    public final String hm;
    public final String kg;
    public final String rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    public final String f9365sg;
    public final String tw;

    public static fxn fxn() {
        return new fxn();
    }

    public static zu fxn(String str, int r2) {
        return new zu(str, r2);
    }

    private zu(String str, int r3) {
        this.kg = null;
        this.gff = null;
        this.hm = null;
        this.rb = null;
        this.bh = str;
        this.f9365sg = null;
        this.fxn = r3;
        this.tw = null;
    }

    private zu(fxn fxnVar) {
        this.kg = fxnVar.fxn;
        this.gff = fxnVar.kg;
        this.hm = fxnVar.gff;
        this.rb = fxnVar.hm;
        this.bh = fxnVar.rb;
        this.f9365sg = fxnVar.bh;
        this.fxn = 1;
        this.tw = fxnVar.f9366sg;
    }

    public static boolean fxn(zu zuVar) {
        return zuVar == null || zuVar.fxn != 1 || TextUtils.isEmpty(zuVar.hm) || TextUtils.isEmpty(zuVar.rb);
    }

    public String toString() {
        return "methodName: " + this.hm + ", params: " + this.rb + ", callbackId: " + this.bh + ", type: " + this.gff + ", version: " + this.kg + ", ";
    }

    public static final class fxn {
        private String bh;
        private String fxn;
        private String gff;
        private String hm;
        private String kg;
        private String rb;

        /* JADX INFO: renamed from: sg, reason: collision with root package name */
        private String f9366sg;

        private fxn() {
        }

        public fxn fxn(String str) {
            this.fxn = str;
            return this;
        }

        public fxn kg(String str) {
            this.kg = str;
            return this;
        }

        public fxn gff(String str) {
            this.gff = str;
            return this;
        }

        public fxn hm(String str) {
            this.hm = str;
            return this;
        }

        public fxn rb(String str) {
            this.rb = str;
            return this;
        }

        public fxn bh(String str) {
            this.bh = str;
            return this;
        }

        public fxn sg(String str) {
            this.f9366sg = str;
            return this;
        }

        public zu fxn() {
            return new zu(this);
        }
    }
}
