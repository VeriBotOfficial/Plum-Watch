package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.phancy.mini.utils.MimeExtKt;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class vk extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17169a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected vk(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17169a = new LinkedHashMap();
        g();
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object any, String jsName) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        super.addJavascriptInterface(any, jsName);
        this.f17169a.put(jsName, any);
    }

    public final void b(String sourcePageData) {
        Intrinsics.checkNotNullParameter(sourcePageData, "sourcePageData");
        loadDataWithBaseURL("https://yandex.ru", a(sourcePageData), MimeExtKt.MIME_TYPE_HTML, "UTF-8", null);
    }

    public String c() {
        return "";
    }

    public final void e() {
        int i = oa.b;
        try {
            WebView.class.getDeclaredMethod(_imp_adbrowser.ACTIVITY_PAUSE, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        sp0.d(getClass().toString());
    }

    public final void f() {
        int i = oa.b;
        try {
            WebView.class.getDeclaredMethod(_imp_adbrowser.ACTIVITY_RESUME, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception unused) {
        }
        sp0.d(getClass().toString());
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String jsName) {
        Intrinsics.checkNotNullParameter(jsName, "jsName");
        if (pa.a(11)) {
            super.removeJavascriptInterface(jsName);
        }
    }

    private final void g() {
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setAllowFileAccess(false);
        if (pa.a(11)) {
            settings.setAllowContentAccess(false);
            if (pa.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    public final void setDisplayZoomControls(boolean z) {
        if (pa.a(11)) {
            getSettings().setDisplayZoomControls(z);
        }
    }

    public void d() {
        wh2.a((ViewGroup) this);
        Iterator it = this.f17169a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f17169a.clear();
        destroy();
        sp0.f(getClass().toString());
    }

    private final String a(String str) {
        return str + c() + "<body style='margin:0; padding:0;'>";
    }
}
