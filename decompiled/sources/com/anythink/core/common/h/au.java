package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f3857a = new ArrayList();

    public final List<a> a() {
        return this.f3857a;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3858a;
        private final long b;
        private Map<String, Long> c;

        public a(String str, long j) {
            this.f3858a = str;
            this.b = j;
        }

        public final String a() {
            return this.f3858a;
        }

        public final long b() {
            return this.b;
        }

        public final Map<String, Long> c() {
            return this.c;
        }

        public final void a(Map<String, Long> map) {
            this.c = map;
        }

        public final String toString() {
            return "{errorCode='" + this.f3858a + "', errorCodeInterval=" + this.b + ", msgMap=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public au(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                            a aVar = new a(next, optJSONObject.optLong("c_t", 0L));
                            try {
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("msg");
                                if (optJSONObject2 != null) {
                                    HashMap hashMap = new HashMap();
                                    Iterator<String> keys2 = optJSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        try {
                                            String next2 = keys2.next();
                                            if (!TextUtils.isEmpty(next2)) {
                                                long optLong = optJSONObject2.optLong(next2, 0L);
                                                if (optLong > 0) {
                                                    hashMap.put(next2, Long.valueOf(optLong));
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!hashMap.isEmpty()) {
                                        aVar.a(hashMap);
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            this.f3857a.add(aVar);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
