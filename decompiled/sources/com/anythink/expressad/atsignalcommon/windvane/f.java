package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static f f4695a = new f();

    private f() {
    }

    public static f a() {
        return f4695a;
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String format;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                format = String.format("javascript:window.OW.onSuccess(%s,'');", bVar.g);
            } else {
                format = String.format("javascript:window.OW.onSuccess(%s,'%s');", bVar.g, com.anythink.core.express.d.d.c(str));
            }
            if (bVar.f4693a != null) {
                try {
                    bVar.f4693a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
