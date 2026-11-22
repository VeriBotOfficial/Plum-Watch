package com.anythink.expressad.videocommon.c;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f5538a;
    private int b;

    public c(String str, int i) {
        this.f5538a = str;
        this.b = i;
    }

    public final String a() {
        return this.f5538a;
    }

    public final void a(String str) {
        this.f5538a = str;
    }

    public final int b() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x002a, B:14:0x0017, B:16:0x001d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.videocommon.c.c b(java.lang.String r3) {
        /*
            r0 = 0
            com.anythink.expressad.videocommon.e.c r1 = com.anythink.expressad.videocommon.e.c.a()     // Catch: java.lang.Exception -> L30
            com.anythink.expressad.videocommon.e.a r1 = r1.b()     // Catch: java.lang.Exception -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L15
            com.anythink.expressad.videocommon.c.c r3 = c()     // Catch: java.lang.Exception -> L30
        L13:
            r0 = r3
            goto L28
        L15:
            if (r1 == 0) goto L28
            java.util.Map r2 = r1.i()     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L28
            java.util.Map r1 = r1.i()     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L30
            com.anythink.expressad.videocommon.c.c r3 = (com.anythink.expressad.videocommon.c.c) r3     // Catch: java.lang.Exception -> L30
            goto L13
        L28:
            if (r0 != 0) goto L2f
            com.anythink.expressad.videocommon.c.c r3 = c()     // Catch: java.lang.Exception -> L30
            return r3
        L2f:
            return r0
        L30:
            r3 = move-exception
            r3.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.c.c.b(java.lang.String):com.anythink.expressad.videocommon.c.c");
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "Reward{name='" + this.f5538a + "', amount=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
