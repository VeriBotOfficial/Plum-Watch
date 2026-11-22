package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import java.util.Random;

/* loaded from: classes14.dex */
public class NetConfigManager {
    private EfsReporter c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean k;
    private Context l;
    private int m;

    /* renamed from: a, reason: collision with root package name */
    private final String f9933a = "NetConfigManager";
    private final int b = 0;
    private int h = 100;
    private int i = 10;
    private int j = 0;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9934q = false;
    private boolean r = false;

    /* JADX WARN: Removed duplicated region for block: B:16:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetConfigManager(android.content.Context r20, com.efs.sdk.base.EfsReporter r21) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.net.NetConfigManager.<init>(android.content.Context, com.efs.sdk.base.EfsReporter):void");
    }

    public boolean enableTracer() {
        return this.k;
    }

    public int getExtraRateFlag() {
        return this.m;
    }

    public int getDataRate() {
        return this.i;
    }

    public int getExtraDataRate() {
        return this.j;
    }

    public int getDayLimit() {
        return this.h;
    }

    public boolean getNetRequestBodyCollectState() {
        return this.n;
    }

    public boolean getNetResponseBodyCollectState() {
        return this.o;
    }

    public boolean getNetRequestHeaderCollectState() {
        return this.p;
    }

    public boolean getNetResponseHeaderCollectState() {
        return this.f9934q;
    }

    public boolean isStrategyHitCurrentProcess() {
        return this.r;
    }

    public void setStrategyHitCurrentProcess(boolean z) {
        this.r = z;
    }

    private static boolean a(int i) {
        if (i == 0) {
            return false;
        }
        return i == 100 || new Random().nextInt(100) <= i;
    }
}
