package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: AndroidIdTracker.java */
/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13951a = "android_id";
    private Context b;

    public b(Context context) {
        super("android_id");
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getAndroidId(this.b);
    }
}
