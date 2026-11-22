package com.yandex.mobile.ads.impl;

import com.anythink.basead.ui.improveclick.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes5.dex */
public final class d30 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f15242a = CollectionsKt.listOf((Object[]) new String[]{"native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", g.a.k, "mute_button"});

    public final Set<s20> a(JSONObject designCard) {
        Intrinsics.checkNotNullParameter(designCard, "designCard");
        ArrayList arrayList = new ArrayList();
        a(designCard, t20.b, new c30(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!f15242a.contains(((s20) next).a())) {
                arrayList2.add(next);
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    private static void a(JSONArray jSONArray, t20 t20Var, Function2 function2) {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Intrinsics.checkNotNullParameter(jSONArray, "<this>");
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, t20Var, function2);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, t20Var, function2);
            }
        }
    }

    private static void a(JSONObject jSONObject, t20 t20Var, Function2 function2) {
        Object obj;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(DOMConstants.TAG_EXTENSIONS);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (Intrinsics.areEqual((optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("params")) == null) ? null : optJSONObject.optString("view_name"), "native_ad_view")) {
                    t20Var = t20.c;
                    break;
                }
                i++;
            }
        }
        ((c30) function2).invoke(jSONObject, t20Var);
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.checkNotNull(key);
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                obj = jSONObject.get(key);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, t20Var, function2);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, t20Var, function2);
            }
        }
    }
}
