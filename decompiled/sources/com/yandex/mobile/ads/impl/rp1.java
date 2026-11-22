package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class rp1 {
    public static je a(op1.b reportType, Map reportData, String str, t4 t4Var) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        try {
            int ordinal = reportType.ordinal();
            if (ordinal == 0) {
                return new je(ke.e, c(str, reportData));
            }
            if (ordinal == 4) {
                return new je(ke.d, a(str, reportData));
            }
            if (ordinal == 8) {
                return new je(ke.c, a(reportData));
            }
            if (ordinal == 21) {
                return new je(ke.f, a(reportData, t4Var, str));
            }
            if (ordinal == 26) {
                return new je(ke.g, b(str, reportData));
            }
            if (ordinal != 37) {
                return null;
            }
            return new je(ke.h, d(str, reportData));
        } catch (Throwable unused) {
            sp0.c(new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject b(java.lang.String r3, java.util.Map r4) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ad_type"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto Lf
            java.lang.Object r2 = org.json.JSONObject.NULL
        Lf:
            r0.put(r1, r2)
            java.lang.String r1 = "block_id"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = org.json.JSONObject.NULL
        L1c:
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L29
            java.lang.Object r2 = org.json.JSONObject.NULL
        L29:
            r0.put(r1, r2)
            if (r3 == 0) goto L3b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            if (r3 != 0) goto L3d
        L3b:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L3d:
            java.lang.String r1 = "ad_network"
            r0.put(r1, r3)
            java.lang.String r3 = "ad_id"
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L4f
            java.lang.String r4 = "banner_id"
            r0.put(r4, r3)
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rp1.b(java.lang.String, java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject c(java.lang.String r3, java.util.Map r4) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ad_type"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto Lf
            java.lang.Object r2 = org.json.JSONObject.NULL
        Lf:
            r0.put(r1, r2)
            java.lang.String r1 = "block_id"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = org.json.JSONObject.NULL
        L1c:
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L29
            java.lang.Object r2 = org.json.JSONObject.NULL
        L29:
            r0.put(r1, r2)
            if (r3 == 0) goto L3b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            if (r3 != 0) goto L3d
        L3b:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L3d:
            java.lang.String r1 = "ad_network"
            r0.put(r1, r3)
            java.lang.String r3 = "ad_id"
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L4f
            java.lang.String r4 = "banner_id"
            r0.put(r4, r3)
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rp1.c(java.lang.String, java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject d(java.lang.String r3, java.util.Map r4) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ad_type"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto Lf
            java.lang.Object r2 = org.json.JSONObject.NULL
        Lf:
            r0.put(r1, r2)
            java.lang.String r1 = "block_id"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = org.json.JSONObject.NULL
        L1c:
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.Object r4 = r4.get(r1)
            if (r4 != 0) goto L29
            java.lang.Object r4 = org.json.JSONObject.NULL
        L29:
            r0.put(r1, r4)
            if (r3 == 0) goto L3b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            if (r3 != 0) goto L3d
        L3b:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L3d:
            java.lang.String r4 = "ad_network"
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rp1.d(java.lang.String, java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject a(java.lang.String r3, java.util.Map r4) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ad_type"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto Lf
            java.lang.Object r2 = org.json.JSONObject.NULL
        Lf:
            r0.put(r1, r2)
            java.lang.String r1 = "block_id"
            java.lang.Object r2 = r4.get(r1)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = org.json.JSONObject.NULL
        L1c:
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.Object r4 = r4.get(r1)
            if (r4 != 0) goto L29
            java.lang.Object r4 = org.json.JSONObject.NULL
        L29:
            r0.put(r1, r4)
            if (r3 == 0) goto L3b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            if (r3 != 0) goto L3d
        L3b:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L3d:
            java.lang.String r4 = "ad_network"
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rp1.a(java.lang.String, java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject a(java.util.Map r3, com.yandex.mobile.ads.impl.t4 r4, java.lang.String r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ad_type"
            java.lang.Object r2 = r3.get(r1)
            if (r2 != 0) goto Lf
            java.lang.Object r2 = org.json.JSONObject.NULL
        Lf:
            r0.put(r1, r2)
            java.lang.String r1 = "block_id"
            java.lang.Object r2 = r3.get(r1)
            if (r2 != 0) goto L1c
            java.lang.Object r2 = org.json.JSONObject.NULL
        L1c:
            r0.put(r1, r2)
            java.lang.String r1 = "sdk_version"
            java.lang.Object r2 = r3.get(r1)
            if (r2 != 0) goto L29
            java.lang.Object r2 = org.json.JSONObject.NULL
        L29:
            r0.put(r1, r2)
            if (r5 == 0) goto L3b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            if (r5 != 0) goto L3d
        L3b:
            java.lang.Object r5 = org.json.JSONObject.NULL
        L3d:
            java.lang.String r1 = "ad_network"
            r0.put(r1, r5)
            java.lang.String r5 = "ad_id"
            java.lang.Object r3 = r3.get(r5)
            if (r3 == 0) goto L4f
            java.lang.String r5 = "banner_id"
            r0.put(r5, r3)
        L4f:
            r3 = 0
            if (r4 == 0) goto L57
            java.lang.String r4 = r4.c()
            goto L58
        L57:
            r4 = r3
        L58:
            if (r4 == 0) goto L6b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L61
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L61
            r3 = r5
            goto L6b
        L61:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = com.yandex.mobile.ads.impl.sp0.b
            java.lang.String r5 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
        L6b:
            if (r3 == 0) goto L75
            java.lang.String r4 = "revenue"
            java.lang.String r4 = r3.optString(r4)
            if (r4 != 0) goto L77
        L75:
            java.lang.Object r4 = org.json.JSONObject.NULL
        L77:
            java.lang.String r5 = "ad_revenue"
            r0.put(r5, r4)
            java.lang.String r4 = "currency"
            if (r3 == 0) goto L86
            java.lang.String r5 = r3.optString(r4)
            if (r5 != 0) goto L88
        L86:
            java.lang.Object r5 = org.json.JSONObject.NULL
        L88:
            r0.put(r4, r5)
            java.lang.String r4 = "precision"
            if (r3 == 0) goto L95
            java.lang.String r3 = r3.optString(r4)
            if (r3 != 0) goto L97
        L95:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L97:
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rp1.a(java.util.Map, com.yandex.mobile.ads.impl.t4, java.lang.String):org.json.JSONObject");
    }

    private static JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("block_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("block_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        return jSONObject;
    }
}
