package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes4.dex */
public class ei implements eg {

    /* renamed from: a, reason: collision with root package name */
    private eg f14554a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static ei f14555a = new ei();
    }

    public static ei a() {
        return a.f14555a;
    }

    private ei() {
    }

    @Override // com.xiaomi.push.eg
    public void a(ef efVar) {
        eg egVar = this.f14554a;
        if (egVar != null) {
            egVar.a(efVar);
        }
    }

    @Override // com.xiaomi.push.eg
    public void a(String str, Map<String, Object> map) {
        eg egVar = this.f14554a;
        if (egVar != null) {
            egVar.a(str, map);
        }
    }
}
