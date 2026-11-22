package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class vi {
    public static ui a(JSONObject jsonValue) {
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("top");
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jsonValue.opt("right");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jsonValue.opt("left");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jsonValue.opt("bottom");
        return new ui(str, str2, str3, opt4 instanceof String ? (String) opt4 : null);
    }
}
