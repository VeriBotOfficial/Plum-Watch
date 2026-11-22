package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class dk0 {

    /* renamed from: a, reason: collision with root package name */
    private final pj0 f15286a;

    public final ArrayList a(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            pj0 pj0Var = this.f15286a;
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(pj0Var.b(jSONObject));
        }
        return arrayList;
    }

    public /* synthetic */ dk0() {
        this(new pj0());
    }

    public dk0(pj0 imageParser) {
        Intrinsics.checkNotNullParameter(imageParser, "imageParser");
        this.f15286a = imageParser;
    }
}
