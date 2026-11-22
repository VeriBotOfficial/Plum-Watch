package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class rl0 {

    /* renamed from: a, reason: collision with root package name */
    private final ql0 f16775a;

    public final ArrayList a(JSONObject jsonObject) throws JSONException, t61 {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jsonObject.optJSONArray("installedPackages");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject2 = optJSONArray.getJSONObject(i);
                ql0 ql0Var = this.f16775a;
                Intrinsics.checkNotNull(jsonObject2);
                ql0Var.getClass();
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonInstalledPackage");
                if (!l91.a(jsonObject2, "name")) {
                    throw new t61("Native Ad json has not required attributes");
                }
                String a2 = j91.a(jsonObject2, "jsonAsset", "name", "jsonAttribute", "name");
                if (a2 == null || a2.length() == 0 || Intrinsics.areEqual(a2, AbstractJsonLexerKt.NULL)) {
                    throw new t61("Native Ad json has not required attributes");
                }
                Intrinsics.checkNotNull(a2);
                int i2 = oa.b;
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                Intrinsics.checkNotNullParameter("minVersion", "jsonAttribute");
                int optInt = jsonObject2.optInt("minVersion", 0);
                if (optInt < 0) {
                    optInt = 0;
                }
                Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
                Intrinsics.checkNotNullParameter("maxVersion", "jsonAttribute");
                int i3 = Integer.MAX_VALUE;
                int optInt2 = jsonObject2.optInt("maxVersion", Integer.MAX_VALUE);
                if (optInt2 >= 0) {
                    i3 = optInt2;
                }
                arrayList.add(new pl0(optInt, i3, a2));
            }
        }
        return arrayList;
    }

    public /* synthetic */ rl0() {
        this(new ql0());
    }

    public rl0(ql0 installedPackageJsonParser) {
        Intrinsics.checkNotNullParameter(installedPackageJsonParser, "installedPackageJsonParser");
        this.f16775a = installedPackageJsonParser;
    }
}
