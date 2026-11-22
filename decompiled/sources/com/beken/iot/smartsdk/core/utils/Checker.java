package com.beken.iot.smartsdk.core.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import androidx.core.app.ActivityCompat;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.hjq.permissions.Permission;
import com.iflytek.cloud.SpeechConstant;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Checker.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/beken/iot/smartsdk/core/utils/Checker;", "", "()V", "checkBle", "", "context", "Landroid/content/Context;", "checkLocation", "checkPermission", "isBleAvailable", "printD", "", "msg", "", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Checker {
    public static final Checker INSTANCE = new Checker();

    private Checker() {
    }

    public final boolean isBleAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return checkBle(context) && checkLocation(context) && checkPermission(context);
    }

    private final boolean checkBle(Context context) {
        BluetoothAdapter adapter;
        Object systemService = context.getSystemService(SpeechConstant.BLUETOOTH);
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return false;
        }
        return adapter.isEnabled();
    }

    private final boolean checkLocation(Context context) {
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return (locationManager != null ? locationManager.isProviderEnabled("gps") : false) || (locationManager != null ? locationManager.isProviderEnabled("network") : false);
    }

    private final boolean checkPermission(Context context) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH", Permission.ACCESS_COARSE_LOCATION, Permission.ACCESS_FINE_LOCATION};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                INSTANCE.printD("miss permission " + str);
                arrayList.add(str);
            }
        }
        return arrayList.isEmpty();
    }

    private final void printD(String msg) {
        BKSmartLog.INSTANCE.d("Checker", msg);
    }
}
