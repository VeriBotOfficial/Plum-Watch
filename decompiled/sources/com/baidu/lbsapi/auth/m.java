package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.Hashtable;

/* loaded from: classes13.dex */
class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7498a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ Hashtable e;
    final /* synthetic */ LBSAuthManager f;

    m(LBSAuthManager lBSAuthManager, int i, boolean z, String str, String str2, Hashtable hashtable) {
        this.f = lBSAuthManager;
        this.f7498a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = hashtable;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a2;
        Context context;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        String str5;
        String str6;
        boolean a3;
        p pVar;
        p pVar2;
        StringBuilder append = new StringBuilder("status = ").append(this.f7498a).append("; forced = ").append(this.b).append("checkAK = ");
        a2 = this.f.a(this.c, this.d);
        b.a(append.append(a2).toString());
        int i3 = this.f7498a;
        if (i3 != 601 && !this.b && i3 != -1) {
            a3 = this.f.a(this.c, this.d);
            if (!a3) {
                if (602 != this.f7498a) {
                    b.a("authenticate else");
                    this.f.a(this.c, (String) null, this.d);
                    return;
                }
                b.a("authenticate wait ");
                pVar = LBSAuthManager.h;
                if (pVar != null) {
                    pVar2 = LBSAuthManager.h;
                    pVar2.b();
                }
                this.f.a(this.c, (String) null, this.d);
                return;
            }
        }
        b.a("authenticate sendAuthRequest");
        context = LBSAuthManager.f7486a;
        String[] b = d.b(context);
        if (b == null || b.length <= 1) {
            LBSAuthManager lBSAuthManager = this.f;
            boolean z = this.b;
            String str7 = this.c;
            Hashtable hashtable = this.e;
            String str8 = this.d;
            str = LBSAuthManager.b;
            i = LBSAuthManager.c;
            str2 = LBSAuthManager.d;
            str3 = LBSAuthManager.e;
            lBSAuthManager.a(z, str7, hashtable, str8, str, i, str2, str3);
            return;
        }
        b.a("authStrings.length:" + b.length);
        b.a("more sha1 auth");
        LBSAuthManager lBSAuthManager2 = this.f;
        boolean z2 = this.b;
        String str9 = this.c;
        Hashtable hashtable2 = this.e;
        String str10 = this.d;
        str4 = LBSAuthManager.b;
        i2 = LBSAuthManager.c;
        str5 = LBSAuthManager.d;
        str6 = LBSAuthManager.e;
        lBSAuthManager2.a(z2, str9, hashtable2, b, str10, str4, i2, str5, str6);
    }
}
