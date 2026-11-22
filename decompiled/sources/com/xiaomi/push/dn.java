package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
public class dn extends dm {
    public dn(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.dm
    public String b() {
        StringBuilder sb = new StringBuilder("ram:");
        sb.append(i.m12346a()).append(",rom:").append(i.m12351b()).append("|ramOriginal:").append(i.c()).append(",romOriginal:").append(i.d());
        return sb.toString();
    }

    @Override // com.xiaomi.push.dm
    public gi a() {
        return gi.Storage;
    }

    @Override // com.xiaomi.push.af.a
    /* renamed from: a */
    public String mo11916a() {
        return "23";
    }
}
