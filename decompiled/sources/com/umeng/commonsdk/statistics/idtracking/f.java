package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: ImeiTracker.java */
/* loaded from: classes2.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13956a = "imei";
    private Context b;

    public f(Context context) {
        super("imei");
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.b);
    }
}
