package com.bytedance.sdk.component.adexpress.hm;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class kg {
    public static boolean fxn(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
