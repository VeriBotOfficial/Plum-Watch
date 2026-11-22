package com.xiaomi.push;

import org.json.JSONArray;

/* loaded from: classes4.dex */
public class bg extends JSONArray implements bf {

    /* renamed from: a, reason: collision with root package name */
    private int f14454a = "[]".length();

    @Override // com.xiaomi.push.bf
    public int a() {
        return this.f14454a + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof bf) {
            this.f14454a += ((bf) obj).a();
        }
        return super.put(obj);
    }
}
