package com.wakeup.common.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.hjq.permissions.Permission;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.permissions.PermissionsManager;

/* loaded from: classes2.dex */
public class BleUtils {
    private static final String TAG = "BleUtils";

    private BleUtils() {
    }

    public static boolean isBlueEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isSupportBle() {
        return BaseApplication.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean openBle(Context context) {
        try {
            context.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
            return true;
        } catch (Exception e) {
            LogUtils.e(TAG, "openBle error: " + e.getMessage());
            return false;
        }
    }

    public static BluetoothDevice getBluetoothDevice(String mac) {
        return BluetoothAdapter.getDefaultAdapter().getRemoteDevice(mac);
    }

    public static void enableBluetooth() {
        if (Build.VERSION.SDK_INT < 31 || PermissionsManager.checkPermission(Permission.BLUETOOTH_CONNECT)) {
            BluetoothAdapter.getDefaultAdapter().enable();
        }
    }

    public static void disableBluetooth() {
        if (Build.VERSION.SDK_INT < 31 || PermissionsManager.checkPermission(Permission.BLUETOOTH_CONNECT)) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isEnabled()) {
                defaultAdapter.disable();
            }
        }
    }
}
