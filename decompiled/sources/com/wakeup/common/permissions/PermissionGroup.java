package com.wakeup.common.permissions;

import android.os.Build;
import com.hjq.permissions.Permission;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PermissionGroup {
    public static final String[] CALL_PERMISSIONS = {Permission.READ_PHONE_STATE, Permission.READ_CALL_LOG};
    public static final String[] CONTACTS_PERMISSIONS = {Permission.READ_CONTACTS};
    public static final String[] SMS_PERMISSIONS = {Permission.RECEIVE_SMS};
    public static final String[] NOTIFY_PERMISSIONS = {Permission.POST_NOTIFICATIONS};
    public static final String[] CAMERA_PERMISSIONS = getCameraAPermissions();
    public static final String[] LOCATION_PERMISSIONS = {Permission.ACCESS_FINE_LOCATION, Permission.ACCESS_COARSE_LOCATION};
    public static final String[] BACK_LOCATION_PERMISSIONS = getBackLocationPermissions();
    public static final String[] BLE_PERMISSIONS = getBlePermissions();

    public static String[] getFilePermissions() {
        if (Build.VERSION.SDK_INT < 33) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    }

    private static String[] getCameraAPermissions() {
        if (Build.VERSION.SDK_INT < 33) {
            return new String[]{Permission.CAMERA, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        return new String[]{Permission.CAMERA, "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    }

    private static String[] getBlePermissions() {
        if (Build.VERSION.SDK_INT > 33) {
            return new String[]{Permission.BLUETOOTH_SCAN, Permission.ACCESS_FINE_LOCATION, Permission.BLUETOOTH_CONNECT, Permission.RECORD_AUDIO};
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new String[]{Permission.BLUETOOTH_SCAN, Permission.ACCESS_FINE_LOCATION, Permission.BLUETOOTH_CONNECT};
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return new String[]{Permission.ACCESS_FINE_LOCATION};
        }
        return new String[]{Permission.ACCESS_COARSE_LOCATION, Permission.ACCESS_FINE_LOCATION};
    }

    private static String[] getBackLocationPermissions() {
        if (Build.VERSION.SDK_INT < 29) {
            return new String[]{Permission.ACCESS_FINE_LOCATION, Permission.ACCESS_COARSE_LOCATION};
        }
        return new String[]{Permission.ACCESS_FINE_LOCATION, Permission.ACCESS_COARSE_LOCATION, Permission.ACCESS_BACKGROUND_LOCATION};
    }

    public static String[] getBackgroundLocationOnly() {
        if (Build.VERSION.SDK_INT >= 29) {
            return new String[]{Permission.ACCESS_BACKGROUND_LOCATION};
        }
        return new String[0];
    }

    public static class MultipleBuild {
        private List<String> permissionList = new ArrayList();

        public MultipleBuild append(String[] permissions) {
            for (String str : permissions) {
                if (!this.permissionList.contains(str)) {
                    this.permissionList.add(str);
                }
            }
            return this;
        }

        public String[] build() {
            return (String[]) this.permissionList.toArray(new String[0]);
        }
    }
}
