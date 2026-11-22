package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ATBaseAdAdapter f3924a;
    private Throwable b;

    public p(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f3924a = aTBaseAdAdapter;
    }

    public p(Throwable th) {
        this.b = th;
    }

    public final String a(String str) {
        Throwable th = this.b;
        if (th != null && !(th instanceof ClassNotFoundException)) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                return message;
            }
            String message2 = this.b.getCause() != null ? this.b.getCause().getMessage() : "";
            if (!TextUtils.isEmpty(message2)) {
                return message2;
            }
        }
        return str;
    }
}
