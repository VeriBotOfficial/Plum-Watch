package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;
import org.xmind.core.ICloneData;

/* loaded from: classes6.dex */
public final class Ea {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f17830a;

    static {
        HashSet hashSet = new HashSet();
        f17830a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return AbstractC3395mb.a(optJSONObject.getJSONArray(ICloneData.URLS));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
