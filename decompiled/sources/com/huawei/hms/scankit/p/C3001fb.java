package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.UUID;

/* compiled from: HaLog60000.java */
/* renamed from: com.huawei.hms.scankit.p.fb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3001fb extends AbstractC3037ob {
    private int h;
    protected String i;
    protected String j;

    public C3001fb(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.h = -1001;
        this.i = AbstractC3037ob.f10675a;
        this.j = AbstractC3037ob.b;
        this.f.put("callTime", new C2993db(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(System.currentTimeMillis())));
        this.f.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, UUID.randomUUID().toString());
        this.f.put("apiName", str);
    }

    private void g() {
        this.h = -1001;
        this.i = AbstractC3037ob.f10675a;
        this.j = AbstractC3037ob.b;
    }

    public void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null) {
            this.h = hmsScanArr.length;
            for (HmsScan hmsScan : hmsScanArr) {
                this.i = AbstractC3037ob.a(hmsScan.scanType);
                this.j = AbstractC3037ob.b(hmsScan.scanTypeForm);
            }
        }
    }

    public void b() {
        this.g = System.currentTimeMillis();
    }

    public void c() {
        try {
            if (a()) {
                C2997eb c2997eb = new C2997eb(this);
                c2997eb.put("result", String.valueOf(this.h));
                c2997eb.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(System.currentTimeMillis() - this.g));
                c2997eb.put("scanType", this.i);
                c2997eb.put("sceneType", this.j);
                C3048rb.a().a("60000", c2997eb);
                g();
            }
        } catch (NullPointerException unused) {
            com.huawei.hms.scankit.util.a.b("HaLog60000", "nullPoint");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("HaLog60000", "logEnd Exception");
        }
    }

    public void c(int i) {
        this.h = i;
    }
}
