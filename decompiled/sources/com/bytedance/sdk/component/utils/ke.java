package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class ke {
    private static final Object fxn = new Object();
    private static final Map<fxn, Object> kg = new ConcurrentHashMap();
    private static AtomicBoolean gff = new AtomicBoolean(false);
    private static volatile int hm = -1;
    private static volatile long rb = 0;
    private static volatile int bh = 60000;

    /* renamed from: sg, reason: collision with root package name */
    private static ud f9401sg = null;
    private static final AtomicBoolean tw = new AtomicBoolean(false);

    public interface fxn {
        void fxn(Context context, Intent intent, boolean z, int i);
    }

    public static int fxn(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (rb + j <= elapsedRealtime) {
            return kg(context);
        }
        if (hm == -1) {
            return kg(context);
        }
        if (elapsedRealtime - rb >= bh) {
            kg(context, (Intent) null, false, false);
        }
        return hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            hm = 0;
        } else if (tw.compareAndSet(false, true)) {
            com.bytedance.sdk.component.tw.bh.kg(new com.bytedance.sdk.component.tw.tw("getNetworkType") { // from class: com.bytedance.sdk.component.utils.ke.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = ke.hm = z2 ? 0 : ke.kg(context);
                    ke.tw.set(false);
                    if (z) {
                        ke.kg(context, intent, ke.hm, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(Context context, Intent intent, int i, boolean z) {
        Map<fxn, Object> map = kg;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (fxn fxnVar : map.keySet()) {
            if (fxnVar != null) {
                try {
                    fxnVar.fxn(context, intent, !z, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int kg(Context context) {
        hm = gff(context);
        rb = SystemClock.elapsedRealtime();
        return hm;
    }

    private static int gff(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        ud udVar = f9401sg;
                        return (udVar == null || !udVar.fxn(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static void fxn(fxn fxnVar, Context context) {
        if (fxnVar == null) {
            return;
        }
        if (!gff.get()) {
            try {
                context.registerReceiver(new kg(), new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION));
                gff.set(true);
            } catch (Throwable unused) {
            }
        }
        kg.put(fxnVar, fxn);
    }

    public static void fxn(fxn fxnVar) {
        if (fxnVar == null) {
            return;
        }
        kg.remove(fxnVar);
    }

    private static class kg extends BroadcastReceiver {
        private kg() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean z = false;
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (ke.kg != null && ke.kg.size() > 0) {
                    z = true;
                }
                ke.kg(context, intent, z, booleanExtra);
            } catch (Throwable unused) {
            }
        }
    }
}
