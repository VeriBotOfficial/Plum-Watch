package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.Context;

/* loaded from: classes17.dex */
public final class p {
    private p() {
    }

    public static boolean a(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
