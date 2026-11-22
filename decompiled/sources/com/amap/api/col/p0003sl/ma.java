package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.col.p0003sl.l9;
import com.amap.api.col.p0003sl.na;

/* compiled from: MsgProcessorDelegate.java */
/* loaded from: classes11.dex */
public class ma {

    /* renamed from: a, reason: collision with root package name */
    private Context f1777a;
    private l9 b;
    private boolean c = true;
    private pa d = new pa("40C27E38DCAD404B5465362914090908");

    public void a(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        try {
            l9 a2 = new l9.a(str, str2, str).a(strArr).a(str3).a();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f1777a = applicationContext;
                this.b = a2;
                this.c = z;
                this.d.a(applicationContext, a2);
            }
        } catch (y8 unused) {
        }
    }

    public void a(String str, String str2) {
        na.a.f1793a.a(this.f1777a, str, str2, this.d.a(this.f1777a), this.c, this.b);
    }
}
