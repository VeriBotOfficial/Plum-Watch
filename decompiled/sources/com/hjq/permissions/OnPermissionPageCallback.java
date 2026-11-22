package com.hjq.permissions;

/* loaded from: classes12.dex */
public interface OnPermissionPageCallback {
    default void onDenied() {
    }

    void onGranted();
}
