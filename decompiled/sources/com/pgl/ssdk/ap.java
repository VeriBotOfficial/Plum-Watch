package com.pgl.ssdk;

import android.content.Context;
import org.apache.commons.net.nntp.NNTPReply;

/* loaded from: classes17.dex */
public class ap extends am {
    private Context n;
    private final int o;

    public ap(Context context, int i) {
        super(context);
        this.n = context;
        this.o = i;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i = this.o;
        if (i == 222) {
            return "/ssdk/v2/r?os=0&ver=7.6.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.d() + "&aid=" + com.pgl.ssdk.ces.b.c();
        }
        if (i == 301) {
            return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.c() + "&did=" + com.pgl.ssdk.ces.b.d() + "&app_ver=" + ab.h(this.n) + "&platform=android&ver=7.6.0.0.overseas-rc.1&mode=1";
        }
        return null;
    }

    @Override // com.pgl.ssdk.am
    public void a(int i, byte[] bArr) {
        try {
            if (i == 200) {
                int i2 = this.o;
                if (i2 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, null, bArr)).intValue();
                    return;
                }
                if (i2 == 301) {
                    Object a2 = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(a2)));
                    if ((a2 instanceof Integer) && ((Integer) a2).intValue() == 0) {
                        au.b("write token succ");
                        a5.f12729a = 200;
                        return;
                    } else {
                        if (a2 instanceof String) {
                            a5.c = (String) a2;
                            a5.f12729a = 200;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.n);
        } catch (Throwable unused) {
        }
    }
}
