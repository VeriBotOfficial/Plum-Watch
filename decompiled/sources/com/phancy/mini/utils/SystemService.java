package com.phancy.mini.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.view.WindowManager;
import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/phancy/mini/utils/SystemService;", "", "()V", "bluetoothEnabled", "", "context", "Landroid/content/Context;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "locationEnabled", "locationManager", "Landroid/location/LocationManager;", "wifiEnabled", "wifiManager", "Landroid/net/wifi/WifiManager;", "windowManager", "Landroid/view/WindowManager;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SystemService {
    public static final SystemService INSTANCE = new SystemService();

    private SystemService() {
    }

    public final BluetoothManager bluetoothManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(SpeechConstant.BLUETOOTH);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return (BluetoothManager) systemService;
    }

    public final boolean bluetoothEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            BluetoothAdapter adapter = bluetoothManager(context).getAdapter();
            if (adapter != null) {
                return adapter.isEnabled();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final LocationManager locationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return (LocationManager) systemService;
    }

    public final boolean locationEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return locationManager(context).isProviderEnabled("gps");
    }

    public final WifiManager wifiManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("wifi");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    public final boolean wifiEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return wifiManager(context).isWifiEnabled();
    }

    public final WindowManager windowManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }
}
