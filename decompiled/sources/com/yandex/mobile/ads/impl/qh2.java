package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes5.dex */
public final class qh2 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16669a;
    private final oh2 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qh2(Context context) {
        this(by1.a(new by1(), context, "ViewSizeInfoStorage"), new oh2());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String a(sh2 viewSizeKey) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        return this.f16669a.getString(b(viewSizeKey), null);
    }

    private static String b(sh2 sh2Var) {
        return sh2Var.a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + sh2Var.b();
    }

    public qh2(SharedPreferences preferences, oh2 viewSizeInfoParser) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(viewSizeInfoParser, "viewSizeInfoParser");
        this.f16669a = preferences;
        this.b = viewSizeInfoParser;
    }

    public final void a(sh2 viewSizeKey, nh2 viewSizeInfo) {
        Intrinsics.checkNotNullParameter(viewSizeKey, "viewSizeKey");
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        String b = b(viewSizeKey);
        this.b.getClass();
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", viewSizeInfo.d().b());
        jSONObject2.put("height", viewSizeInfo.d().a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", viewSizeInfo.b().b());
        jSONObject3.put("height", viewSizeInfo.b().a());
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", viewSizeInfo.c().b().b());
        String name = viewSizeInfo.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put(DOMConstants.ATTR_MODE, lowerCase);
        jSONObject5.put("value", viewSizeInfo.c().a().b());
        String lowerCase2 = viewSizeInfo.c().a().a().name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(DOMConstants.ATTR_MODE, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(viewSizeInfo.a());
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String jSONObject8 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject8, "toString(...)");
        this.f16669a.edit().putString(b, jSONObject8).apply();
    }
}
