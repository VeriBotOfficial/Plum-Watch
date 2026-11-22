package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes14.dex */
public class ggo {
    private static String fxn = null;
    private static String gff = null;
    private static volatile boolean hm = true;
    private static String kg;

    /* JADX INFO: Access modifiers changed from: private */
    public static void rb() {
        String str;
        String str2;
        String str3;
        if (com.bytedance.sdk.openadsdk.core.rmu.fxn() == null) {
            return;
        }
        hm = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.rmu.fxn().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0) {
                    hm = false;
                } else if (simState == 1) {
                    hm = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dx.gff("SimUtils", th.getMessage());
            }
            String str4 = null;
            try {
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str = null;
            }
            try {
                str2 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (str2 == null || str2.length() < 5) {
                try {
                    str2 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(str2) || str2.length() <= 4) {
                str3 = null;
            } else {
                String substring = str2.substring(0, 3);
                str3 = str2.substring(3);
                str4 = substring;
            }
            if (!TextUtils.isEmpty(str)) {
                fxn = str;
            }
            if (!TextUtils.isEmpty(str4)) {
                kg = str4;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            gff = str3;
        } catch (Throwable unused4) {
        }
    }

    public static String fxn() {
        fxn.fxn();
        return fxn;
    }

    public static String kg() {
        try {
            fxn.fxn();
            if (!hm) {
                com.bytedance.sdk.component.utils.dx.gff("MCC", "getMCC" + (hm ? "Have SIM card" : "No SIM card, MCC returns null"));
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.rmu.fxn().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : kg;
            com.bytedance.sdk.component.utils.dx.gff("MCC", "config=" + configuration.mcc + ",sMCC=" + kg);
            return valueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dx.gff("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String gff() {
        fxn.fxn();
        return gff;
    }

    public static class fxn extends com.bytedance.sdk.component.tw.tw {
        public static AtomicBoolean fxn = new AtomicBoolean(false);
        private static final AtomicLong kg = new AtomicLong(0);

        public fxn(String str, int i) {
            super(str, i);
        }

        public static void fxn() {
            if (fxn.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = kg;
            if (currentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(currentTimeMillis);
            yws.kg((com.bytedance.sdk.component.tw.tw) new fxn("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            fxn.set(true);
            ggo.rb();
            fxn.set(false);
        }
    }
}
