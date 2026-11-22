package com.huawei.hms.scankit.p;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: HaLog60000.java */
/* renamed from: com.huawei.hms.scankit.p.db, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C2993db extends SimpleDateFormat {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3001fb f10632a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2993db(C3001fb c3001fb, String str) {
        super(str);
        this.f10632a = c3001fb;
        setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
