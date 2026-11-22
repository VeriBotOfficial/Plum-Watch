package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class g {
    public static f a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("experiments");
            JSONArray jSONArray = jSONObject.getJSONArray("test_ids");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            LinkedHashSet a2 = a(jSONArray);
            Intrinsics.checkNotNull(string);
            return new f(string, a2);
        } catch (Throwable unused) {
            String str2 = "Couldn't convert " + str + " from Json to AbExperimentData}";
            sp0.b(new Object[0]);
            return null;
        }
    }

    private static LinkedHashSet a(JSONArray jSONArray) {
        Object m14057constructorimpl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i)))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
                String str = "Couldn't parse " + TuplesKt.to(jSONArray.get(i), LongCompanionObject.INSTANCE);
                sp0.b(new Object[0]);
            }
        }
        return linkedHashSet;
    }
}
