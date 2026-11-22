package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class h80 {

    /* renamed from: a, reason: collision with root package name */
    private final g80 f15666a;

    public /* synthetic */ h80() {
        this(new g80());
    }

    public final LinkedHashMap a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            if (keys.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!jSONObject.isNull(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            JSONObject jsonObject = (JSONObject) obj;
                            this.f15666a.getClass();
                            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                            f80 f80Var = (Intrinsics.areEqual(jsonObject.optString("type"), "parcelable") && Intrinsics.areEqual(wq0.a("value", jsonObject), AbstractJsonLexerKt.NULL)) ? f80.f15464a : null;
                            if (f80Var != null) {
                                Intrinsics.checkNotNull(next);
                                linkedHashMap.put(next, f80Var);
                            }
                        } else {
                            Intrinsics.checkNotNull(next);
                            Intrinsics.checkNotNull(obj);
                            linkedHashMap.put(next, obj);
                        }
                    }
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public h80(g80 extrasParcelableParser) {
        Intrinsics.checkNotNullParameter(extrasParcelableParser, "extrasParcelableParser");
        this.f15666a = extrasParcelableParser;
    }
}
