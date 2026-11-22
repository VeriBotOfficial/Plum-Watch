package io.agora.base.internal;

import android.content.Context;
import android.os.Process;
import com.hjq.permissions.Permission;

/* loaded from: classes6.dex */
public class PermissionChecker {
    static boolean forceCheckPermissionFail = false;

    public static boolean hasCameraPermission() {
        return hasPermission(Permission.CAMERA);
    }

    public static boolean hasChangeNetPermission() {
        return hasPermission("android.permission.CHANGE_NETWORK_STATE");
    }

    public static boolean hasPermission(String perm) {
        Context applicationContext = ContextUtils.getApplicationContext();
        return (applicationContext == null || forceCheckPermissionFail || applicationContext.checkPermission(perm, Process.myPid(), Process.myUid()) != 0) ? false : true;
    }

    public static boolean hasRecordAudioPermission() {
        return hasPermission(Permission.RECORD_AUDIO);
    }

    static void setForceCheckPermissionFail(boolean forceCheckPermissionFail2) {
        forceCheckPermissionFail = forceCheckPermissionFail2;
    }
}
