package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ck1 {

    /* renamed from: a, reason: collision with root package name */
    private final bk1 f15196a;

    public /* synthetic */ ck1(q82 q82Var) {
        this(q82Var, new bk1(q82Var));
    }

    public final ArrayList a(JSONArray jSONArray) throws JSONException, t61 {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(this.f15196a.a(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    public ck1(q82 urlJsonParser, bk1 preferredPackageParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackageParser, "preferredPackageParser");
        this.f15196a = preferredPackageParser;
    }
}
