package com.vivo.push.e;

import com.vivo.push.restructure.request.a.a.c;
import com.vivo.push.util.t;

/* compiled from: ProfileInfoDS.java */
/* loaded from: classes2.dex */
final class c implements c.a<b> {
    c() {
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ com.vivo.push.restructure.request.a.a.c a(String str) {
        return b(str);
    }

    private static b b(String str) {
        try {
            return new b(new com.vivo.push.restructure.request.a.a.a(str));
        } catch (Exception e) {
            t.a(8101, e.getMessage());
            return null;
        }
    }
}
