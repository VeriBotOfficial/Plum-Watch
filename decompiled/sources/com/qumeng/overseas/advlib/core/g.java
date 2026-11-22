package com.qumeng.overseas.advlib.core;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.Map;

/* loaded from: classes17.dex */
public class g extends f {
    @Override // com.qumeng.overseas.advlib.core.f
    public void a(e eVar) {
        this.b = eVar;
    }

    @Override // com.qumeng.overseas.advlib.core.f
    protected Boolean a(Map<String, b> map) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(this.b)) {
            this.b.a(map);
            return Boolean.valueOf(this.b.a());
        }
        n.c("CheckPermissionsFactory", "mBaseAdPermissions is null", new Object[0]);
        return Boolean.FALSE;
    }
}
