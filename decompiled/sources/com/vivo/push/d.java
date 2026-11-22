package com.vivo.push;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: BundleWapper.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f14065a;
    private String b;
    private String c;

    public d(String str, String str2, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.f14065a = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.vivo.push.d a(android.content.Intent r6) {
        /*
            java.lang.String r0 = "BundleWapper"
            r1 = 0
            if (r6 != 0) goto Lb
            java.lang.String r6 = "create error : intent is null"
            com.vivo.push.util.t.a(r0, r6)
            return r1
        Lb:
            android.os.Bundle r2 = r6.getExtras()
            if (r2 == 0) goto L1e
            java.lang.String r3 = "client_pkgname"
            java.lang.String r3 = r2.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L1e
            goto L1f
        L1e:
            r3 = r1
        L1f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L2a
            java.lang.String r4 = "create warning: pkgName is null"
            com.vivo.push.util.t.b(r0, r4)
        L2a:
            java.lang.String r4 = r6.getPackage()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L4f
            android.content.ComponentName r4 = r6.getComponent()
            if (r4 != 0) goto L3b
            goto L43
        L3b:
            android.content.ComponentName r6 = r6.getComponent()
            java.lang.String r1 = r6.getPackageName()
        L43:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L4e
            java.lang.String r6 = "create warning: targetPkgName is null"
            com.vivo.push.util.t.b(r0, r6)
        L4e:
            r4 = r1
        L4f:
            com.vivo.push.d r6 = new com.vivo.push.d
            r6.<init>(r3, r4, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.d.a(android.content.Intent):com.vivo.push.d");
    }

    public final void a(String str, int i) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putInt(str, i);
    }

    public final void a(String str, long j) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putLong(str, j);
    }

    public final void a(String str, String str2) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putString(str, str2);
    }

    public final void a(String str, byte[] bArr) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putByteArray(str, bArr);
    }

    public final void a(String str, Serializable serializable) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putSerializable(str, serializable);
    }

    public final void a(String str, boolean z) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putBoolean(str, z);
    }

    public final void a(String str, ArrayList<String> arrayList) {
        if (this.f14065a == null) {
            this.f14065a = new Bundle();
        }
        this.f14065a.putStringArrayList(str, arrayList);
    }

    public final String a(String str) {
        Bundle bundle = this.f14065a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public final int b(String str, int i) {
        Bundle bundle = this.f14065a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    public final byte[] b(String str) {
        Bundle bundle = this.f14065a;
        if (bundle == null) {
            return null;
        }
        return bundle.getByteArray(str);
    }

    public final ArrayList<String> c(String str) {
        Bundle bundle = this.f14065a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    public final long b(String str, long j) {
        Bundle bundle = this.f14065a;
        return bundle == null ? j : bundle.getLong(str, j);
    }

    public final Serializable d(String str) {
        Bundle bundle = this.f14065a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    public final boolean e(String str) {
        Bundle bundle = this.f14065a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    public final String a() {
        return this.b;
    }

    public final Bundle b() {
        return this.f14065a;
    }
}
