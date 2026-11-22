package com.huawei.hms.scankit.p;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: HaLog60001.java */
/* renamed from: com.huawei.hms.scankit.p.hb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C3009hb extends SimpleDateFormat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3013ib f10647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3009hb(C3013ib c3013ib, String str) {
        super(str);
        this.f10647a = c3013ib;
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
