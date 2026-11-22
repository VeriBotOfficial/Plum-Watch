package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class u extends a {

    /* renamed from: a, reason: collision with root package name */
    aq f4030a;
    boolean b = true;

    @Override // com.anythink.core.common.m.a
    protected final Object a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    protected final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    protected final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    protected final boolean p() {
        return true;
    }

    public u(aq aqVar) {
        this.f4030a = aqVar;
    }

    public final void s() {
        this.b = false;
    }

    public final aq t() {
        return this.f4030a;
    }

    @Override // com.anythink.core.common.m.a
    protected final int a() {
        return this.f4030a.b;
    }

    @Override // com.anythink.core.common.m.a
    protected final String b() {
        return this.f4030a.d;
    }

    @Override // com.anythink.core.common.m.a
    protected final Map<String, String> c() {
        String str = this.f4030a.c;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    @Override // com.anythink.core.common.m.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final byte[] d() {
        /*
            r6 = this;
            com.anythink.core.common.h.aq r0 = r6.f4030a
            java.lang.String r0 = r0.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            com.anythink.core.common.h.aq r0 = r6.f4030a
            java.lang.String r0 = r0.c
            java.lang.String r3 = "gzip"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2e
            com.anythink.core.common.h.aq r5 = r6.f4030a     // Catch: java.lang.Exception -> L2e
            java.lang.String r5 = r5.e     // Catch: java.lang.Exception -> L2e
            r4.<init>(r5)     // Catch: java.lang.Exception -> L2e
            boolean r3 = r6.b     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L33
            java.lang.String r3 = "ofl"
            r4.put(r3, r1)     // Catch: java.lang.Exception -> L2b
            goto L33
        L2b:
            r1 = move-exception
            r3 = r4
            goto L2f
        L2e:
            r1 = move-exception
        L2f:
            r1.printStackTrace()
            r4 = r3
        L33:
            if (r0 == 0) goto L43
            if (r4 == 0) goto L40
            java.lang.String r0 = r4.toString()
            byte[] r0 = b(r0)
            return r0
        L40:
            byte[] r0 = new byte[r2]
            return r0
        L43:
            if (r4 == 0) goto L4e
            java.lang.String r0 = r4.toString()
            byte[] r0 = r0.getBytes()
            return r0
        L4e:
            byte[] r0 = new byte[r2]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.m.u.d():byte[]");
    }
}
