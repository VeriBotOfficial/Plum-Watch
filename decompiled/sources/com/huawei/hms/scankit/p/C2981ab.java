package com.huawei.hms.scankit.p;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.util.Locale;

/* compiled from: CountryCodeBean.java */
/* renamed from: com.huawei.hms.scankit.p.ab, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2981ab {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10624a = "ab";
    private String b = "UNKNOWN";
    private String c;

    public C2981ab(Context context, boolean z) {
        this.c = "UNKNOWN";
        a(context, z);
        this.c = this.c.toUpperCase(Locale.ENGLISH);
    }

    private boolean b() {
        return !"UNKNOWN".equals(this.c);
    }

    public String a() {
        return this.c;
    }

    private void a(Context context, boolean z) {
        if (context != null) {
            try {
                this.c = GrsApp.getInstance().getIssueCountryCode(context);
                if (b()) {
                    Logger.i(f10624a, "getCountryCode unknown");
                }
            } catch (NullPointerException unused) {
                Logger.w(f10624a, "get CountryCode error");
            } catch (Exception unused2) {
                Logger.w(f10624a, "get CountryCode error");
            }
        }
    }
}
