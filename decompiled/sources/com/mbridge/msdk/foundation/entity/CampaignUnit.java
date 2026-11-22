package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class CampaignUnit extends b implements Serializable, NoProGuard {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.b
    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String d = com.mbridge.msdk.foundation.tools.f.d();
            Context d2 = com.mbridge.msdk.foundation.controller.c.m().d();
            String r = k0.r(d2);
            String q2 = k0.q(d2);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str2 = String.valueOf(k0.s(d2));
                str = k0.n(d2) + "x" + k0.m(d2);
            } else {
                str = "";
                str2 = str;
            }
            this.cParams = this.cParams.append(getAdType()).append("|").append(nullToEmpty("1")).append("|").append(nullToEmpty(Build.VERSION.RELEASE)).append("|").append(nullToEmpty(MBConfiguration.SDK_VERSION)).append("|").append(nullToEmpty(k0.n())).append("|").append(nullToEmpty(str)).append("|").append(nullToEmpty(Integer.valueOf(k0.F(com.mbridge.msdk.foundation.controller.c.m().d())))).append("|").append(nullToEmpty(k0.p(com.mbridge.msdk.foundation.controller.c.m().d()))).append("|").append(nullToEmpty(str2)).append("|").append(nullToEmpty(q2)).append(nullToEmpty(r)).append("|").append("|").append("|").append("|").append(nullToEmpty(d)).append("|").append(nullToEmpty("")).append("|").append(nullToEmpty(k0.s())).append("|").append(nullToEmpty("")).append("|").append("").append("|").append(nullToEmpty("")).append("|").append(nullToEmpty(com.mbridge.msdk.foundation.same.a.V + "," + com.mbridge.msdk.foundation.same.a.g)).append("|").append(k0.j()).append("|");
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, th.getMessage(), th);
            }
        }
        return this.cParams.toString();
    }
}
