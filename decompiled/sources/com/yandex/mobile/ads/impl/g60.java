package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class g60 {
    public static Set a(String jsonData) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(a(new JSONArray(jsonData)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            String str = "Couldn't parse " + jsonData + " to set of ExclusionRule";
            sp0.b(new Object[0]);
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (Set) m14057constructorimpl;
    }

    public static Set a(JSONArray jsonArray) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            Result.Companion companion = Result.INSTANCE;
            Set createSetBuilder = SetsKt.createSetBuilder();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jsonArray.getJSONObject(i);
                String string = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                f60 valueOf = f60.valueOf(string);
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                createSetBuilder.add(new e60(valueOf, string2));
            }
            m14057constructorimpl = Result.m14057constructorimpl(SetsKt.build(createSetBuilder));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            String str = "Couldn't parse " + jsonArray + " to set of ExclusionRule";
            sp0.b(new Object[0]);
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (Set) m14057constructorimpl;
    }

    public static String a(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e60 e60Var = (e60) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", e60Var.a().name());
            jSONObject.put("value", e60Var.b());
            jSONArray = jSONArray.put(jSONObject);
            Intrinsics.checkNotNullExpressionValue(jSONArray, "put(...)");
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }
}
