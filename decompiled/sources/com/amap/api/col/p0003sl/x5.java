package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PluginContext.java */
/* loaded from: classes11.dex */
public class x5 extends ContextThemeWrapper {
    private static final String[] f = {"android.widget", "android.webkit", MBridgeConstans.APPLICATION_STACK_ANDROID_APP};

    /* renamed from: a, reason: collision with root package name */
    private Resources f1968a;
    private LayoutInflater b;
    private ClassLoader c;
    private b d;
    private LayoutInflater.Factory e;

    /* compiled from: PluginContext.java */
    class a implements LayoutInflater.Factory {
        a() {
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return x5.a(x5.this, str, context, attributeSet);
        }
    }

    /* compiled from: PluginContext.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public HashSet<String> f1970a = new HashSet<>();
        public HashMap<String, Constructor<?>> b = new HashMap<>();

        public b(x5 x5Var) {
        }
    }

    public x5(Context context, int i, ClassLoader classLoader) {
        super(context, i);
        this.d = new b(this);
        this.e = new a();
        this.f1968a = y5.a();
        this.c = classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.view.View a(com.amap.api.col.p0003sl.x5 r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            com.amap.api.col.3sl.x5$b r0 = r10.d
            java.util.HashSet<java.lang.String> r0 = r0.f1970a
            boolean r0 = r0.contains(r11)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L96
        Ld:
            com.amap.api.col.3sl.x5$b r0 = r10.d
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r0 = r0.b
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 != 0) goto L89
            r2 = 1
            r3 = 0
            java.lang.String r4 = "api.navi"
            boolean r4 = r11.contains(r4)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L2a
            java.lang.ClassLoader r4 = r10.c     // Catch: java.lang.Throwable -> L67
            java.lang.Class r4 = r4.loadClass(r11)     // Catch: java.lang.Throwable -> L67
            goto L54
        L2a:
            java.lang.String[] r4 = com.amap.api.col.p0003sl.x5.f     // Catch: java.lang.Throwable -> L67
            int r5 = r4.length     // Catch: java.lang.Throwable -> L67
            r6 = r3
        L2e:
            if (r6 >= r5) goto L53
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L67
            java.lang.ClassLoader r8 = r10.c     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r9.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r7 = r9.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = "."
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r7 = r7.append(r11)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.Class r4 = r8.loadClass(r7)     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            int r6 = r6 + 1
            goto L2e
        L53:
            r4 = r1
        L54:
            if (r4 != 0) goto L57
            goto L64
        L57:
            java.lang.Class<android.view.ViewStub> r5 = android.view.ViewStub.class
            if (r4 != r5) goto L5c
            goto L64
        L5c:
            java.lang.ClassLoader r5 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L68
            java.lang.ClassLoader r6 = r10.c     // Catch: java.lang.Throwable -> L68
            if (r5 == r6) goto L65
        L64:
            goto L68
        L65:
            r5 = r2
            goto L69
        L67:
            r4 = r1
        L68:
            r5 = r3
        L69:
            if (r5 != 0) goto L73
            com.amap.api.col.3sl.x5$b r10 = r10.d
            java.util.HashSet<java.lang.String> r10 = r10.f1970a
            r10.add(r11)
            goto L96
        L73:
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L89
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r3] = r6     // Catch: java.lang.Throwable -> L89
            java.lang.Class<android.util.AttributeSet> r3 = android.util.AttributeSet.class
            r5[r2] = r3     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Constructor r0 = r4.getConstructor(r5)     // Catch: java.lang.Throwable -> L89
            com.amap.api.col.3sl.x5$b r10 = r10.d     // Catch: java.lang.Throwable -> L89
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r10 = r10.b     // Catch: java.lang.Throwable -> L89
            r10.put(r11, r0)     // Catch: java.lang.Throwable -> L89
        L89:
            if (r0 == 0) goto L96
            java.lang.Object[] r10 = new java.lang.Object[]{r12, r13}     // Catch: java.lang.Throwable -> L96
            java.lang.Object r10 = r0.newInstance(r10)     // Catch: java.lang.Throwable -> L96
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Throwable -> L96
            r1 = r10
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.x5.a(com.amap.api.col.3sl.x5, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.f1968a;
        return resources != null ? resources : super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.b == null) {
            LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
            if (layoutInflater != null) {
                this.b = layoutInflater.cloneInContext(this);
            }
            this.b.setFactory(this.e);
            this.b = this.b.cloneInContext(this);
        }
        return this.b;
    }
}
