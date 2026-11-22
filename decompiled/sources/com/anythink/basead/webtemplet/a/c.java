package com.anythink.basead.webtemplet.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.e;
import com.anythink.basead.webtemplet.h;
import com.anythink.core.common.d.t;

/* loaded from: classes11.dex */
public class c implements a {
    private static volatile c b;

    /* renamed from: a, reason: collision with root package name */
    private final String f3459a = "c";

    private c() {
    }

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return String.format("javascript:window.ATWebTPL.fireEvent('%s', '');", str);
        }
        return String.format("javascript:window.ATWebTPL.fireEvent('%s','%s');", str, h.e(str2));
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(final Object obj, final String str, final String str2) {
        if (!(obj instanceof e) || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.a.c$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                c.this.b(obj, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj, String str, String str2) {
        e eVar = (e) obj;
        if (eVar.f3471a == null || eVar.f3471a.isDestroyed()) {
            return;
        }
        try {
            eVar.f3471a.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    public final void a(final WebView webView, final String str, final String str2) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.a.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c.this.b(webView, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView, String str, String str2) {
        try {
            if ((webView instanceof WTWebView) && ((WTWebView) webView).isDestroyed()) {
                return;
            }
            webView.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(Object obj, String str) {
        final String format;
        if (obj instanceof e) {
            final e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                format = String.format("javascript:window.ATWebTPL.onSuccess('%s','');", eVar.g);
            } else {
                format = String.format("javascript:window.ATWebTPL.onSuccess('%s','%s');", eVar.g, h.e(str));
            }
            String str2 = eVar.g;
            t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.a.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b(eVar, format);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e eVar, String str) {
        if (eVar.f3471a == null || eVar.f3471a.isDestroyed()) {
            return;
        }
        try {
            eVar.f3471a.loadUrl(str);
        } catch (Throwable th) {
            a("callSuccess", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void b(Object obj, String str) {
        final String format;
        if (obj instanceof e) {
            final e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                format = String.format("javascript:window.ATWebTPL.onFailure('%s','');", eVar.g);
            } else {
                format = String.format("javascript:window.ATWebTPL.onFailure('%s','%s');", eVar.g, h.e(str));
            }
            String str2 = eVar.g;
            t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.a.c$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(eVar, format);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, String str) {
        if (eVar.f3471a == null || eVar.f3471a.isDestroyed()) {
            return;
        }
        try {
            eVar.f3471a.loadUrl(str);
        } catch (Throwable th) {
            a("callFailure", th);
        }
    }

    private static void a(String str, Throwable th) {
        th.getMessage();
    }
}
