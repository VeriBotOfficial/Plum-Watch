package com.anythink.core.common.h;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f3868a;
    boolean b;
    String c;
    boolean d;

    private bc() {
    }

    public static bc a(boolean z, String str, boolean z2) {
        bc bcVar = new bc();
        bcVar.f3868a = 1;
        bcVar.b = z;
        bcVar.c = str;
        bcVar.d = z2;
        return bcVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f3868a);
            int r3 = 1;
            jSONObject.put("is_playend", this.b ? 1 : 2);
            jSONObject.put("url", this.c);
            if (!this.d) {
                r3 = 2;
            }
            jSONObject.put("status", r3);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
