package com.anythink.core.basead.ui.web;

import android.webkit.WebView;
import com.anythink.core.common.h.w;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    w f3582a;
    JSONObject b;
    HashMap<String, Boolean> c = new HashMap<>(3);

    public c(w wVar) {
        JSONObject jSONObject;
        this.f3582a = wVar;
        if (wVar != null) {
            try {
                jSONObject = new JSONObject(wVar.U());
            } catch (Throwable unused) {
                return;
            }
        } else {
            jSONObject = null;
        }
        this.b = jSONObject;
    }

    public final void a(WebView webView, String str) {
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && str != null && str.contains(next) && this.c.get(next) == null) {
                    this.c.put(next, Boolean.TRUE);
                    webView.loadUrl(this.b.optString(next));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
