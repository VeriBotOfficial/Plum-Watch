package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H\u0007J\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u001e\u0010\u0017\u001a\u00020\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0016H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\"\u0010\u001d\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0014\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0007J\u0014\u0010 \u001a\u00020\u0016*\u00020!2\u0006\u0010\u001f\u001a\u00020!H\u0007J$\u0010#\u001a\u0004\u0018\u00010\"*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\"H\u0007¨\u0006$"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/parsing/JsonUtils;", "", "Lorg/json/JSONObject;", "", "key", "", "fallback", "optLongOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;", "optLongOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "", "optIntOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;", "optIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "optFloatOrDefault", "optFloatOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "optStringOrNullable", "optStringOrNull", "", "optBooleanOrDefault", "optBooleanOrNullable", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "optBooleanOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "optJsonObjectOrDefault", "optJsonObjectOrNullable", "optJsonObjectOrNull", "value", "isEqualTo", "Lorg/json/JSONArray;", "", "optHexByteArray", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[LOOP:0: B:6:0x002c->B:17:?, LOOP_END, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isEqualTo(org.json.JSONObject r5, org.json.JSONObject r6) {
        /*
            java.util.Iterator r0 = r5.keys()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.Set r0 = kotlin.sequences.SequencesKt.toSet(r0)
            java.util.Iterator r1 = r6.keys()
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.asSequence(r1)
            java.util.Set r1 = kotlin.sequences.SequencesKt.toSet(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            java.util.Iterator r0 = r5.keys()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r2 = r6.get(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L51
            boolean r4 = r2 instanceof org.json.JSONObject
            if (r4 == 0) goto L68
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            boolean r2 = isEqualTo(r3, r2)
            goto L66
        L51:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L62
            boolean r4 = r2 instanceof org.json.JSONArray
            if (r4 == 0) goto L68
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            boolean r2 = isEqualTo(r3, r2)
            goto L66
        L62:
            boolean r2 = r3.equals(r2)
        L66:
            if (r2 != 0) goto L2c
        L68:
            return r1
        L69:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.isEqualTo(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    @JvmStatic
    public static final boolean optBooleanOrDefault(JSONObject jSONObject, String str, boolean z) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull != null ? optBooleanOrNull.booleanValue() : z;
    }

    @JvmStatic
    public static final Boolean optBooleanOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final Boolean optBooleanOrNullable(JSONObject jSONObject, String str, Boolean bool) {
        Boolean optBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return optBooleanOrNull == null ? bool : optBooleanOrNull;
    }

    @JvmStatic
    public static final float optFloatOrDefault(JSONObject jSONObject, String str, float f) {
        Float optFloatOrNull = optFloatOrNull(jSONObject, str);
        return optFloatOrNull != null ? optFloatOrNull.floatValue() : f;
    }

    @JvmStatic
    public static final Float optFloatOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final byte[] optHexByteArray(JSONObject jSONObject, String str, byte[] bArr) {
        String optStringOrNull;
        byte[] bArr2;
        if (jSONObject == null || (optStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArr2 = StringUtils.hexToBytes(optStringOrNull);
        } catch (Throwable unused) {
            bArr2 = null;
        }
        return bArr2 != null ? bArr2 : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    @JvmStatic
    public static final Integer optIntOrDefault(JSONObject jSONObject, String str, Integer num) {
        Integer optIntOrNull = optIntOrNull(jSONObject, str);
        return optIntOrNull == null ? num : optIntOrNull;
    }

    @JvmStatic
    public static final Integer optIntOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final JSONObject optJsonObjectOrDefault(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    @JvmStatic
    public static final JSONObject optJsonObjectOrNull(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @JvmStatic
    public static final JSONObject optJsonObjectOrNullable(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        JSONObject optJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return optJsonObjectOrNull == null ? jSONObject2 : optJsonObjectOrNull;
    }

    @JvmStatic
    public static final Long optLongOrDefault(JSONObject jSONObject, String str, Long l) {
        Long optLongOrNull = optLongOrNull(jSONObject, str);
        return optLongOrNull == null ? l : optLongOrNull;
    }

    @JvmStatic
    public static final Long optLongOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final String optStringOrNullable(JSONObject jSONObject, String str, String str2) {
        String optStringOrNull = optStringOrNull(jSONObject, str);
        return optStringOrNull == null ? str2 : optStringOrNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:11:0x0026->B:22:?, LOOP_END, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isEqualTo(org.json.JSONArray r5, org.json.JSONArray r6) {
        /*
            int r0 = r5.length()
            int r1 = r6.length()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            int r0 = r5.length()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r2, r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L22
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L22
            goto L64
        L22:
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            r1 = r0
            kotlin.collections.IntIterator r1 = (kotlin.collections.IntIterator) r1
            int r1 = r1.nextInt()
            java.lang.Object r3 = r5.get(r1)
            java.lang.Object r1 = r6.get(r1)
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L4c
            boolean r4 = r1 instanceof org.json.JSONObject
            if (r4 == 0) goto L63
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r1 = isEqualTo(r3, r1)
            goto L61
        L4c:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L5d
            boolean r4 = r1 instanceof org.json.JSONArray
            if (r4 == 0) goto L63
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            boolean r1 = isEqualTo(r3, r1)
            goto L61
        L5d:
            boolean r1 = r3.equals(r1)
        L61:
            if (r1 != 0) goto L26
        L63:
            return r2
        L64:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.isEqualTo(org.json.JSONArray, org.json.JSONArray):boolean");
    }
}
