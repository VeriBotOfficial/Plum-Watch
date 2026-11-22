package com.bytedance.sdk.component.gff.fxn;

import android.os.SystemClock;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class fxn {
    long bh;
    long fxn = SystemClock.elapsedRealtime();
    long gff;
    long hm;
    long kg;
    long rb;

    /* renamed from: sg, reason: collision with root package name */
    long f9367sg;
    long tw;

    public void fxn() {
        this.gff = SystemClock.elapsedRealtime();
    }

    public void kg() {
        this.hm = SystemClock.elapsedRealtime();
    }

    public void gff() {
        this.rb = SystemClock.elapsedRealtime();
    }

    public long hm() {
        return this.fxn;
    }

    public void rb() {
        this.bh = SystemClock.elapsedRealtime();
    }

    public long bh() {
        return this.bh;
    }

    public long sg() {
        return this.gff;
    }

    public long tw() {
        return this.hm;
    }

    public long jq() {
        return this.rb;
    }

    public long hie() {
        return this.f9367sg;
    }

    public void dgx() {
        this.f9367sg = SystemClock.elapsedRealtime();
    }

    public long mvp() {
        return this.tw;
    }

    public void rlu() {
        this.tw = SystemClock.elapsedRealtime();
    }

    public long zu() {
        return this.kg;
    }

    public void ckl() {
        this.kg = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.fxn + ", asyncCallExecTs=" + this.kg + ", requestStartExecTs=" + this.gff + ", requestConnectStartTs=" + this.hm + ", requestConnectFinishTs=" + this.rb + ", reqCallServerStartTs=" + this.f9367sg + ", reqCallServerFinishTs=" + this.tw + AbstractJsonLexerKt.END_OBJ;
    }
}
