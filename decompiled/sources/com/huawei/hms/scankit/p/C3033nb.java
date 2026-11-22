package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;

/* compiled from: HaLog60002.java */
/* renamed from: com.huawei.hms.scankit.p.nb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3033nb extends AbstractC3037ob {
    public C3033nb() {
        super(null, DynamicModuleInitializer.getContext());
    }

    public void a(Bundle bundle) {
        if (bundle == null || !a()) {
            return;
        }
        try {
            if (bundle.containsKey("scanType") && (bundle.get("scanType") instanceof Integer)) {
                bundle.putString("scanType", AbstractC3037ob.a(bundle.getInt("scanType")));
            }
            C3029mb c3029mb = new C3029mb(this);
            for (String str : bundle.keySet()) {
                c3029mb.put(str, String.valueOf(bundle.get(str)));
            }
            C3048rb.a().a("60002", c3029mb);
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b("HaLog60002", "RuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("HaLog60002", "Exception");
        }
    }
}
