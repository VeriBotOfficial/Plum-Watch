package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f2826a;
    private c b;

    private f() {
    }

    public static f a() {
        if (f2826a == null) {
            synchronized (f.class) {
                if (f2826a == null) {
                    f2826a = new f();
                }
            }
        }
        return f2826a;
    }

    public final void a(c cVar) {
        this.b = cVar;
    }

    public final String a(String str, w wVar, x xVar) {
        return (b() && b(wVar, xVar)) ? this.b.a(str, wVar, xVar) : str;
    }

    public final boolean a(w wVar, x xVar) {
        return b() && !TextUtils.isEmpty(wVar.av()) && b(wVar, xVar);
    }

    public final boolean b() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar.a();
        }
        return false;
    }

    public final b a(Context context, boolean z, w wVar, x xVar) {
        if (b()) {
            return this.b.a(context, z, wVar, xVar);
        }
        return null;
    }

    public final b a(Context context, WebView webView, w wVar, x xVar) {
        if (b()) {
            return this.b.a(context, webView, wVar, xVar);
        }
        return null;
    }

    public final String c() {
        if (b()) {
            return this.b.b();
        }
        return "";
    }

    private static boolean b(w wVar, x xVar) {
        return !com.anythink.basead.b.e.a(wVar, xVar) && wVar.n();
    }
}
