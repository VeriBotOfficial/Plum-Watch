package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.storage.SdCardDbCreator;

/* compiled from: HttpsDecisionUtil.java */
/* loaded from: classes11.dex */
public class g9 {

    /* renamed from: a, reason: collision with root package name */
    private volatile b f1666a = new b(0);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpsDecisionUtil.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static g9 f1667a = new g9();
    }

    public g9() {
        i9.c(TextUtils.isDigitsOnly("HttpsDecisionUtil") ? "SPUtil" : "HttpsDecisionUtil");
    }

    public static g9 a() {
        return a.f1667a;
    }

    public void b(boolean z) {
        if (this.f1666a == null) {
            this.f1666a = new b((byte) 0);
        }
        this.f1666a.a(z);
    }

    /* compiled from: HttpsDecisionUtil.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f1668a;
        protected boolean b;
        private boolean c;

        private b() {
            this.f1668a = 0;
            this.b = true;
            this.c = false;
        }

        public final void a(Context context) {
            if (context != null && this.f1668a <= 0) {
                this.f1668a = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
            }
        }

        public final void a(boolean z) {
            this.c = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a() {
            /*
                r5 = this;
                boolean r0 = r5.c
                r1 = 1
                if (r0 != 0) goto L2e
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 28
                r3 = 0
                if (r0 < r2) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r3
            Lf:
                boolean r4 = r5.b
                if (r4 == 0) goto L22
                int r4 = r5.f1668a
                if (r4 > 0) goto L18
                r4 = r2
            L18:
                if (r4 < r2) goto L1c
                r2 = r1
                goto L1d
            L1c:
                r2 = r3
            L1d:
                if (r2 == 0) goto L20
                goto L22
            L20:
                r2 = r3
                goto L23
            L22:
                r2 = r1
            L23:
                if (r0 == 0) goto L29
                if (r2 == 0) goto L29
                r0 = r1
                goto L2a
            L29:
                r0 = r3
            L2a:
                if (r0 == 0) goto L2d
                goto L2e
            L2d:
                return r3
            L2e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.3sl.g9.b.a():boolean");
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    public void a(Context context) {
        if (this.f1666a == null) {
            this.f1666a = new b((byte) 0);
        }
        this.f1666a.b = wa.a(context, "open_common", SdCardDbCreator.FIELD_LASTLOC_TIME, true);
        this.f1666a.a(context);
        u9.a(context).a();
    }

    public boolean b() {
        if (this.f1666a == null) {
            this.f1666a = new b((byte) 0);
        }
        return this.f1666a.a();
    }

    final void a(Context context, boolean z) {
        if (this.f1666a == null) {
            this.f1666a = new b((byte) 0);
        }
        SharedPreferences.Editor a2 = wa.a(context, "open_common");
        wa.a(a2, SdCardDbCreator.FIELD_LASTLOC_TIME, z);
        wa.a(a2);
        this.f1666a.b = z;
    }

    public boolean a(boolean z) {
        if (z) {
            return true;
        }
        byte b2 = 0;
        if (this.f1666a == null) {
            this.f1666a = new b(b2);
        }
        return this.f1666a.a();
    }
}
