package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static long f13245a = 86400000;
    private static final String[] b = {"com.adguard.android", "com.adguard.android.contentblocker", "org.adblockplus.browser", "org.blokada.alarm", "org.blokada.origin.alarm", "org.blokada.sex", FbValidationUtils.FB_PACKAGE, "com.google.android.googlequicksearchbox", "com.android.vending", "com.ss.android.ugc.trill"};

    public interface a {
        void onDetected(String str);
    }

    private s() {
    }

    public static void a(final Context context, final a aVar) {
        if (context == null) {
            n.b("detector_utils", "context is null!", new Object[0]);
            return;
        }
        try {
            if (com.qumeng.overseas.advlib.__remote__.framework.config.a.k().o() != null) {
                f13245a = r2.scanIntervalTime * 1000;
            }
        } catch (Exception unused) {
            n.b("detector_utils", "scanAdBlockerDetection.scanIntervalTime error", new Object[0]);
        }
        u.a().a(new Runnable() { // from class: com.qumeng.overseas.advlib.__remote__.utils.s$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                s.b(context, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context, a aVar) {
        try {
            String a2 = a(context);
            if (aVar != null) {
                aVar.onDetected(a2);
            }
        } catch (Exception e) {
            n.b("detector_utils", e.getMessage() != null ? e.getMessage() : "unknown detector", new Object[0]);
        }
    }

    private static String a(Context context) {
        ArrayList arrayList = new ArrayList();
        long c = oqme.a.c(oqme.a.Q);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c > elapsedRealtime) {
            c = 0;
        }
        if (c != 0 && elapsedRealtime - c < f13245a) {
            n.c("detector_utils", "packages cache", new Object[0]);
            return oqme.a.b(oqme.a.R, "");
        }
        for (String str : b) {
            if (p.a(context, str)) {
                arrayList.add(str);
            }
        }
        String join = arrayList.isEmpty() ? "" : TextUtils.join(",", arrayList);
        oqme.a.c(oqme.a.R, join);
        oqme.a.b(oqme.a.Q, elapsedRealtime);
        return join;
    }
}
