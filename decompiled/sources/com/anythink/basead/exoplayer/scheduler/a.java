package com.anythink.basead.exoplayer.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2728a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private static final int f = 8;
    private static final int g = 16;
    private static final int h = 7;
    private static final String i = "Requirements";
    private static final String[] j = null;
    private final int k;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.scheduler.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0152a {
    }

    private static void e() {
    }

    private a(int i2, boolean z, boolean z2) {
        this(i2 | (z ? 16 : 0) | (z2 ? 8 : 0));
    }

    public a(int i2) {
        this.k = i2;
    }

    public final int a() {
        return this.k & 7;
    }

    public final boolean b() {
        return (this.k & 16) != 0;
    }

    public final boolean c() {
        return (this.k & 8) != 0;
    }

    public final int d() {
        return this.k;
    }

    private boolean c(Context context) {
        if (!b()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean d(Context context) {
        if (!c()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return af.f2668a >= 23 ? !powerManager.isDeviceIdleMode() : af.f2668a >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        if (af.f2668a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (af.f2668a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    public final String toString() {
        return super.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0053, code lost:
    
        if (r7.isRoaming() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
    
        if (r1 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0042, code lost:
    
        if ((r8 == null || !r8.hasCapability(16)) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.scheduler.a.a(android.content.Context):boolean");
    }

    private boolean b(Context context) {
        boolean z;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i2 = this.k & 7;
        if (i2 == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (af.f2668a >= 23 && ((activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)))) {
            return false;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 3) {
            return !activeNetworkInfo.isRoaming();
        }
        if (af.f2668a >= 16) {
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            int type = activeNetworkInfo.getType();
            z = (type == 1 || type == 7 || type == 9) ? false : true;
        }
        if (i2 == 2) {
            return !z;
        }
        if (i2 == 4) {
            return z;
        }
        throw new IllegalStateException();
    }
}
