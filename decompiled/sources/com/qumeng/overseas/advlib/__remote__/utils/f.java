package com.qumeng.overseas.advlib.__remote__.utils;

import android.text.TextUtils;
import com.qumeng.overseas.advlib.core.QMConfig;

/* loaded from: classes17.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13231a = "00000000-0000-0000-0000-000000000000";
    private static final Object b = new Object();

    private f() {
    }

    private static void a() {
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.S = false;
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.b(0);
        if (TextUtils.equals(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O, f13231a)) {
            com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O = "";
        }
    }

    public static void b(QMConfig qMConfig) {
        int a2 = a(qMConfig);
        synchronized (b) {
            a();
            a(a2);
        }
    }

    private static int a(QMConfig qMConfig) {
        QMConfig.AdConsentStatus adConsentStatus = qMConfig.getAdConsentStatus();
        if (adConsentStatus != null) {
            return a(adConsentStatus);
        }
        return g.a(qMConfig.getContext());
    }

    private static void a(int i) {
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.b(i);
        if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.b()) {
            com.qumeng.overseas.advlib.__remote__.core.coreutils.a.S = true;
            com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O = f13231a;
        }
        if (n.a()) {
            n.a("GDPRConsentHelper", "GDPR Status: " + com.qumeng.overseas.advlib.__remote__.core.coreutils.a.X, new Object[0]);
        }
    }

    private static int a(QMConfig.AdConsentStatus adConsentStatus) {
        if (adConsentStatus == QMConfig.AdConsentStatus.DENIED) {
            return 1;
        }
        return adConsentStatus == QMConfig.AdConsentStatus.GRANTED ? 2 : 0;
    }
}
