package com.anythink.basead.webtemplet;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.basead.webtemplet.b.a;
import com.anythink.core.common.d.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class g implements com.anythink.basead.webtemplet.adformat.c {

    /* renamed from: a, reason: collision with root package name */
    protected Pattern f3473a;
    protected Context c;
    protected WTWebView d;
    protected Handler e;
    private final String f = "g";
    protected final int b = 1;

    public g(WTWebView wTWebView) {
        this.c = wTWebView != null ? wTWebView.getContext().getApplicationContext() : t.b().g();
        this.d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final WebView a() {
        return this.d;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final void a(WTWebView wTWebView) {
        this.d = wTWebView;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final boolean a(String str) {
        if (!h.a(str)) {
            return false;
        }
        this.f3473a = h.b(str);
        return true;
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = this.f3473a.matcher(str);
        if (matcher.matches()) {
            e eVar = new e();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                eVar.f = matcher.group(5);
            }
            if (groupCount >= 3) {
                eVar.d = matcher.group(1);
                eVar.g = matcher.group(2);
                eVar.e = matcher.group(3);
                eVar.f3471a = this.d;
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.anythink.basead.webtemplet.adformat.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L8
            goto La6
        L8:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L49
            java.util.regex.Pattern r0 = r7.f3473a
            java.util.regex.Matcher r8 = r0.matcher(r8)
            boolean r0 = r8.matches()
            if (r0 == 0) goto L49
            com.anythink.basead.webtemplet.e r0 = new com.anythink.basead.webtemplet.e
            r0.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L2f
            java.lang.String r5 = r8.group(r5)
            r0.f = r5
        L2f:
            r5 = 3
            if (r4 < r5) goto L49
            java.lang.String r4 = r8.group(r2)
            r0.d = r4
            java.lang.String r4 = r8.group(r1)
            r0.g = r4
            java.lang.String r8 = r8.group(r5)
            r0.e = r8
            com.anythink.basead.webtemplet.WTWebView r8 = r7.d
            r0.f3471a = r8
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r0 != 0) goto L4d
            goto La6
        L4d:
            com.anythink.basead.webtemplet.WTWebView r8 = r0.f3471a
            java.lang.String r8 = r0.d
            java.lang.String r8 = r0.e
            java.lang.String r8 = r0.g
            java.lang.String r8 = r0.f
            com.anythink.core.common.v.k.b(r8)
            com.anythink.basead.webtemplet.WTWebView r8 = r0.f3471a
            if (r8 != 0) goto L5f
            goto L67
        L5f:
            com.anythink.basead.webtemplet.WTWebView r8 = r0.f3471a
            java.lang.String r3 = r0.d
            java.lang.Object r3 = r8.getJsObject(r3)
        L67:
            if (r3 != 0) goto L6a
            goto La6
        L6a:
            android.content.Context r8 = r7.c     // Catch: java.lang.Throwable -> La6
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Throwable -> La6
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> La6
            com.anythink.basead.webtemplet.b.a$c r8 = com.anythink.basead.webtemplet.b.a.a(r8, r4)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r0.e     // Catch: java.lang.Throwable -> La6
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r6 = 0
            r1[r6] = r5     // Catch: java.lang.Throwable -> La6
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r1[r2] = r5     // Catch: java.lang.Throwable -> La6
            com.anythink.basead.webtemplet.b.a$f r8 = r8.a(r4, r1)     // Catch: java.lang.Throwable -> La6
            r8.a()     // Catch: java.lang.Throwable -> La6
            if (r3 == 0) goto La6
            boolean r1 = r3 instanceof com.anythink.basead.webtemplet.d     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto La6
            r0.c = r8     // Catch: java.lang.Throwable -> La6
            r0.b = r3     // Catch: java.lang.Throwable -> La6
            com.anythink.core.common.d.t r8 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> La6
            com.anythink.basead.webtemplet.g$1 r1 = new com.anythink.basead.webtemplet.g$1     // Catch: java.lang.Throwable -> La6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La6
            r8.b(r1)     // Catch: java.lang.Throwable -> La6
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.webtemplet.g.c(java.lang.String):void");
    }

    @Override // com.anythink.basead.webtemplet.adformat.c
    public final void a(Pattern pattern) {
        this.f3473a = pattern;
    }

    private void a(e eVar) {
        Object jsObject = eVar.f3471a == null ? null : eVar.f3471a.getJsObject(eVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            a.f a2 = com.anythink.basead.webtemplet.b.a.a(this.c.getClassLoader(), jsObject.getClass().getName()).a(eVar.e, Object.class, String.class);
            a2.a();
            if (jsObject == null || !(jsObject instanceof d)) {
                return;
            }
            eVar.c = a2;
            eVar.b = jsObject;
            t.b().b(new AnonymousClass1(eVar));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.anythink.basead.webtemplet.g$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f3474a;

        AnonymousClass1(e eVar) {
            this.f3474a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Object obj = this.f3474a.b;
                a.f fVar = this.f3474a.c;
                if (fVar == null || obj == null) {
                    return;
                }
                e eVar = this.f3474a;
                fVar.a(obj, eVar, TextUtils.isEmpty(eVar.f) ? "{}" : this.f3474a.f);
            } catch (Throwable unused) {
            }
        }
    }

    private void b(e eVar) {
        t.b().b(new AnonymousClass1(eVar));
    }
}
