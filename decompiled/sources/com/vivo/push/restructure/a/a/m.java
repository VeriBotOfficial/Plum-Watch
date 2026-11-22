package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.util.t;

/* compiled from: NodeReportItem.java */
/* loaded from: classes2.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private String f14121a;
    private String b;

    public m(com.vivo.push.restructure.a.a aVar, String str) {
        if (aVar != null) {
            this.f14121a = aVar.a();
        }
        this.b = str;
    }

    public final com.vivo.push.b.h a() {
        if (TextUtils.isEmpty(this.f14121a) || TextUtils.isEmpty(this.b)) {
            t.a("convertOffLineMsg() error, mMessageID = " + this.f14121a + ", mNodeArrayInfo = " + this.b);
            return null;
        }
        return new com.vivo.push.b.h(this.f14121a, this.b);
    }
}
