package com.qumeng.overseas.advlib.core;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.Map;

/* loaded from: classes17.dex */
public class d extends e {
    private final String b = "AdPermissions";

    @Override // com.qumeng.overseas.advlib.core.e
    public void a(Map<String, b> map) {
        this.f13267a = map;
    }

    @Override // com.qumeng.overseas.advlib.core.e
    public boolean a() {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Map<?, ?>) this.f13267a)) {
            n.c("AdPermissions", "adExtraMap is empty", new Object[0]);
            return false;
        }
        b bVar = this.f13267a.get(c.f13266a);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(bVar)) {
            n.c("AdPermissions", "adExtra is null", new Object[0]);
            return false;
        }
        if (bVar.a() == 1) {
            n.c("AdPermissions", "permissions ok", new Object[0]);
            return true;
        }
        n.c("AdPermissions", "permissions miss", new Object[0]);
        return false;
    }
}
