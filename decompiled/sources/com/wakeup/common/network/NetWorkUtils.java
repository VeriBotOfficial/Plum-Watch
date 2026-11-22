package com.wakeup.common.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.blankj.utilcode.util.NetworkUtils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.storage.AppConfigManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetWorkUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/NetWorkUtils;", "", "<init>", "()V", "getNetWorkType", "", "getDeviceIp", "getLocalIpAddress", "intToIp", "ipInt", "", "getWifiSignalStrength", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Integer;", "getCellSignalStrength", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetWorkUtils {
    public static final NetWorkUtils INSTANCE = new NetWorkUtils();

    /* compiled from: NetWorkUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkUtils.NetworkType.values().length];
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_4G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_5G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_3G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkUtils.NetworkType.NETWORK_2G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private NetWorkUtils() {
    }

    public final String getNetWorkType() {
        NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType();
        int i = networkType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i == 1) {
            return "wifi";
        }
        if (i == 2) {
            return "4G";
        }
        if (i == 3) {
            return "5G";
        }
        if (i == 4) {
            return "3G";
        }
        if (i == 5) {
            return "2G";
        }
        return "";
    }

    public final String getDeviceIp() {
        Object systemService = BaseApplication.getContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isConnected()) {
            return getLocalIpAddress();
        }
        if (networkInfo2 == null || !networkInfo2.isConnected()) {
            return "";
        }
        Object systemService2 = BaseApplication.getContext().getSystemService("wifi");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return intToIp(((WifiManager) systemService2).getConnectionInfo().getIpAddress());
    }

    private final String getLocalIpAddress() {
        if (!AppConfigManager.getConfig().isAgreePrivacy()) {
            return "";
        }
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        Intrinsics.checkNotNullExpressionValue(hostAddress, "getHostAddress(...)");
                        return hostAddress;
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return "";
    }

    private final String intToIp(int ipInt) {
        StringBuilder sb = new StringBuilder();
        sb.append(ipInt & 255).append(".");
        sb.append((ipInt >> 8) & 255).append(".");
        sb.append((ipInt >> 16) & 255).append(".");
        sb.append((ipInt >> 24) & 255);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final Integer getWifiSignalStrength(Context context) {
        WifiInfo connectionInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return Integer.valueOf(connectionInfo.getRssi());
    }

    public final Integer getCellSignalStrength(Context context) {
        SignalStrength signalStrength;
        List<CellSignalStrength> cellSignalStrengths;
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null && Build.VERSION.SDK_INT >= 29 && (signalStrength = telephonyManager.getSignalStrength()) != null && (cellSignalStrengths = signalStrength.getCellSignalStrengths()) != null) {
            Iterator<T> it = cellSignalStrengths.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int level = ((CellSignalStrength) next).getLevel();
                    do {
                        Object next2 = it.next();
                        int level2 = ((CellSignalStrength) next2).getLevel();
                        if (level < level2) {
                            next = next2;
                            level = level2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            CellSignalStrength cellSignalStrength = (CellSignalStrength) next;
            if (cellSignalStrength != null) {
                return Integer.valueOf(cellSignalStrength.getDbm());
            }
        }
        return null;
    }
}
