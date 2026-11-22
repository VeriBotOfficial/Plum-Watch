package com.vivo.push;

import com.vivo.push.restructure.request.a.a.c;

/* compiled from: ClientSdkQueryResultDS.java */
/* loaded from: classes2.dex */
final class h implements c.a<g> {
    h() {
    }

    @Override // com.vivo.push.restructure.request.a.a.c.a
    public final /* synthetic */ com.vivo.push.restructure.request.a.a.c a(String str) {
        return b(str);
    }

    private static g b(String str) {
        try {
            return new g(new com.vivo.push.restructure.request.a.a.a(str));
        } catch (Exception e) {
            com.vivo.push.util.t.a(8101, e.getMessage());
            return null;
        }
    }
}
