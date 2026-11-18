package com.hjq.permissions;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface OnPermissionCallback {
    default void onDenied(List<String> list, boolean z) {
    }

    void onGranted(List<String> list, boolean z);
}
