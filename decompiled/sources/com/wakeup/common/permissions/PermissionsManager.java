package com.wakeup.common.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.DeadSystemException;
import androidx.core.app.ActivityCompat;
import com.blankj.utilcode.util.PermissionUtils;
import com.google.android.material.snackbar.Snackbar;
import com.wakeup.common.permissions.PermissionGroup;
import com.wakeup.common.permissions.PermissionsManager;
import com.wakeup.common.utils.NotificationsUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PermissionsManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0007J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J)\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0007¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/permissions/PermissionsManager;", "", "<init>", "()V", "checkPermission", "", "list", "", "", "([Ljava/lang/String;)Z", "getDeviceNotifyRelatedPermissions", "()[Ljava/lang/String;", "hasBackgroundLocationPermission", "hasDeviceNotifyRelatedPermissions", "context", "Landroid/content/Context;", "includeBackground", "queryFilePermission", "", "callback", "Lcom/wakeup/common/permissions/PermissionsManager$Callback;", "queryPermission", "(Lcom/wakeup/common/permissions/PermissionsManager$Callback;[Ljava/lang/String;)V", "queryPermissionThenBackground", "queryNotifyPermission", "Landroid/app/Activity;", "Callback", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsManager {
    public static final PermissionsManager INSTANCE = new PermissionsManager();

    @JvmStatic
    public static final boolean hasDeviceNotifyRelatedPermissions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return hasDeviceNotifyRelatedPermissions$default(context, false, 2, null);
    }

    private PermissionsManager() {
    }

    @JvmStatic
    public static final boolean checkPermission(String... list) {
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            return PermissionUtils.isGranted((String[]) Arrays.copyOf(list, list.length));
        } catch (DeadSystemException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final String[] getDeviceNotifyRelatedPermissions() {
        String[] build = new PermissionGroup.MultipleBuild().append(PermissionGroup.CALL_PERMISSIONS).append(PermissionGroup.CONTACTS_PERMISSIONS).append(PermissionGroup.LOCATION_PERMISSIONS).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @JvmStatic
    public static final boolean hasBackgroundLocationPermission() {
        String[] backgroundLocationOnly = PermissionGroup.getBackgroundLocationOnly();
        Intrinsics.checkNotNull(backgroundLocationOnly);
        if (backgroundLocationOnly.length == 0) {
            return true;
        }
        return checkPermission((String[]) Arrays.copyOf(backgroundLocationOnly, backgroundLocationOnly.length));
    }

    public static /* synthetic */ boolean hasDeviceNotifyRelatedPermissions$default(Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return hasDeviceNotifyRelatedPermissions(context, z);
    }

    @JvmStatic
    public static final boolean hasDeviceNotifyRelatedPermissions(Context context, boolean includeBackground) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!NotificationsUtils.isNotificationListenersEnabled(context)) {
            return false;
        }
        String[] deviceNotifyRelatedPermissions = getDeviceNotifyRelatedPermissions();
        if (!checkPermission((String[]) Arrays.copyOf(deviceNotifyRelatedPermissions, deviceNotifyRelatedPermissions.length))) {
            return false;
        }
        if (includeBackground) {
            return hasBackgroundLocationPermission();
        }
        return true;
    }

    @JvmStatic
    public static final void queryFilePermission(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        String[] filePermissions = PermissionGroup.getFilePermissions();
        queryPermission(callback, (String[]) Arrays.copyOf(filePermissions, filePermissions.length));
    }

    @JvmStatic
    public static final void queryPermission(final Callback callback, String... list) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(list, "list");
        try {
            if (PermissionUtils.isGranted((String[]) Arrays.copyOf(list, list.length))) {
                callback.onGranted();
                return;
            }
        } catch (DeadSystemException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        PermissionUtils.permission((String[]) Arrays.copyOf(list, list.length)).callback(new PermissionUtils.SimpleCallback() { // from class: com.wakeup.common.permissions.PermissionsManager$queryPermission$proxy$1
            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onGranted() {
                Snackbar showTip = PermissionsManager.Callback.this.getShowTip();
                if (showTip != null) {
                    showTip.dismiss();
                }
                PermissionsManager.Callback.this.onGranted();
            }

            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onDenied() {
                Snackbar showTip = PermissionsManager.Callback.this.getShowTip();
                if (showTip != null) {
                    showTip.dismiss();
                }
                PermissionsManager.Callback.this.onDenied();
            }
        }).request();
    }

    @JvmStatic
    public static final void queryPermissionThenBackground(final Callback callback, String... list) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(list, "list");
        queryPermission(new Callback() { // from class: com.wakeup.common.permissions.PermissionsManager$queryPermissionThenBackground$1
            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onGranted() {
                String[] backgroundLocationOnly = PermissionGroup.getBackgroundLocationOnly();
                Intrinsics.checkNotNull(backgroundLocationOnly);
                if (backgroundLocationOnly.length == 0 || PermissionsManager.checkPermission((String[]) Arrays.copyOf(backgroundLocationOnly, backgroundLocationOnly.length))) {
                    PermissionsManager.Callback.this.onGranted();
                } else {
                    PermissionsManager.queryPermission(PermissionsManager.Callback.this, (String[]) Arrays.copyOf(backgroundLocationOnly, backgroundLocationOnly.length));
                }
            }

            @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
            public void onDenied() {
                PermissionsManager.Callback.this.onDenied();
            }
        }, (String[]) Arrays.copyOf(list, list.length));
    }

    @JvmStatic
    public static final void queryNotifyPermission(Activity context, Callback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArr = PermissionGroup.NOTIFY_PERMISSIONS;
        if (!PermissionUtils.isGranted((String[]) Arrays.copyOf(strArr, strArr.length))) {
            ActivityCompat.requestPermissions(context, PermissionGroup.NOTIFY_PERMISSIONS, 101);
        } else if (callback != null) {
            callback.onGranted();
        }
    }

    /* compiled from: PermissionsManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/permissions/PermissionsManager$Callback;", "Lcom/blankj/utilcode/util/PermissionUtils$SimpleCallback;", "<init>", "()V", "showTip", "Lcom/google/android/material/snackbar/Snackbar;", "getShowTip", "()Lcom/google/android/material/snackbar/Snackbar;", "setShowTip", "(Lcom/google/android/material/snackbar/Snackbar;)V", "onShowDesc", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Callback implements PermissionUtils.SimpleCallback {
        private Snackbar showTip;

        public Snackbar onShowDesc() {
            return null;
        }

        public final Snackbar getShowTip() {
            return this.showTip;
        }

        public final void setShowTip(Snackbar snackbar) {
            this.showTip = snackbar;
        }
    }
}
