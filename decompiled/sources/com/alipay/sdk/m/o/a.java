package com.alipay.sdk.m.o;

import android.text.TextUtils;
import com.alipay.sdk.m.y.g;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f1424a = null;
    public String b = null;
    public String c = null;
    public String d = null;

    public void a(String str) {
        g.d(com.alipay.sdk.m.n.a.B, "DebugUpgradeWarnData setData:" + str);
        this.f1424a = str;
        this.b = null;
        this.c = null;
        this.d = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() >= 3) {
                this.b = jSONArray.getString(0);
                this.d = jSONArray.getString(1);
                this.c = jSONArray.getString(2);
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public String b() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return (TextUtils.equals(language, "zh") && TextUtils.equals(country, "CN")) ? this.b : (TextUtils.equals(language, "zh") && TextUtils.equals(country, com.anythink.expressad.video.dynview.a.a.aa)) ? this.c : this.d;
    }

    public String a() {
        return this.f1424a;
    }
}
