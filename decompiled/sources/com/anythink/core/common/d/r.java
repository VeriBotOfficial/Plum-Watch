package com.anythink.core.common.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.NoticeUtils;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.v.aj;
import java.util.Map;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3714a = "anythink_notice_handler";

    public static void a(String str, String str2, Map<String, Object> map) {
        try {
            com.anythink.core.common.h.n a2 = a(str, str2);
            if (a2 != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f3714a, "notifyWin, placementId: " + str + ", format: " + str2 + ", extra: " + map);
                }
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj instanceof Double) {
                        a2.b(((Double) obj).doubleValue());
                    }
                    Object obj2 = map.get("bidding_name");
                    if (obj2 instanceof String) {
                        a2.b((String) obj2);
                    }
                    Object obj3 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj3 instanceof String) {
                        a2.c((String) obj3);
                    }
                    Object obj4 = map.get("waterfall_info");
                    if (obj4 instanceof String) {
                        com.anythink.core.common.d.a().a(str, (String) obj4);
                    }
                }
                com.anythink.core.common.u.c.a(t.b().g()).a(22, a2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, double d, Map<String, Object> map) {
        try {
            com.anythink.core.common.h.n a2 = a(str, str2);
            if (a2 != null) {
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f3714a, "notifyLoss, placementId: " + str + ", format: " + str2 + ", lossCode: " + str3 + ", winnerPrice: " + d + ", extra: " + map);
                }
                if (map != null) {
                    a2.a(d);
                    try {
                        a2.c(Integer.parseInt(str3));
                    } catch (Throwable unused) {
                    }
                    Object obj = map.get("bidding_name");
                    if (obj instanceof String) {
                        a2.a((String) obj);
                    }
                    Object obj2 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj2 instanceof String) {
                        a2.c((String) obj2);
                    }
                    Object obj3 = map.get("waterfall_info");
                    if (obj3 instanceof String) {
                        com.anythink.core.common.d.a().a(str, (String) obj3);
                    }
                }
                com.anythink.core.common.u.c.a(t.b().g()).a(23, a2);
            }
            com.anythink.core.common.f a3 = com.anythink.core.common.f.a(t.b().g(), str, str2);
            if (a3 != null) {
                a3.d();
            }
        } catch (Throwable unused2) {
        }
    }

    private static com.anythink.core.common.h.n a(String str, String str2) {
        if (!t.b().d) {
            Log.e(f3714a, "SDK should be inited first!");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f3714a, "Please put placementId!");
            return null;
        }
        com.anythink.core.common.f a2 = com.anythink.core.common.u.a().a(str, str2);
        if (a2 == null) {
            Log.e(f3714a, "The \"" + str + "\" object has not been created yet!");
            return null;
        }
        Context g = t.b().g();
        com.anythink.core.common.h.c a3 = a2.a(g, false, false, (ae) null);
        if (a3 != null) {
            return a3.i().af();
        }
        com.anythink.core.d.l a4 = com.anythink.core.d.n.a(g).a(str);
        String h = a2.h();
        if (TextUtils.isEmpty(h)) {
            h = "";
        }
        com.anythink.core.common.h.n a5 = aj.a(h, str, a4, 0, 0, null, null, 0, a2.i());
        if (a4 == null) {
            a5.K(str2);
        }
        return a5;
    }
}
