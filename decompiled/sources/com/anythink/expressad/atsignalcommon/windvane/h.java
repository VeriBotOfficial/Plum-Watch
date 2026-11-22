package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class h extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static h f4697a = new h();

    private h() {
    }

    public static h a() {
        return f4697a;
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, com.anythink.core.express.d.d.c(str2));
            }
            if (bVar.f4693a == null || bVar.f4693a.isDestroyed()) {
                return;
            }
            try {
                bVar.f4693a.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String format;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                format = String.format("javascript:window.WindVane.onSuccess(%s,'');", bVar.g);
            } else {
                format = String.format("javascript:window.WindVane.onSuccess(%s,'%s');", bVar.g, com.anythink.core.express.d.d.c(str));
            }
            if (bVar.f4693a == null || bVar.f4693a.isDestroyed()) {
                return;
            }
            try {
                bVar.f4693a.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", bVar.g);
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", bVar.g, str);
            if (bVar.f4693a == null || bVar.f4693a.isDestroyed()) {
                return;
            }
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
