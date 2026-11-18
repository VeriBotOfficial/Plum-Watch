package com.hjq.permissions;

/* JADX INFO: loaded from: classes16.dex */
public interface OnPermissionPageCallback {
    default void onDenied() {
    }

    void onGranted();
}
