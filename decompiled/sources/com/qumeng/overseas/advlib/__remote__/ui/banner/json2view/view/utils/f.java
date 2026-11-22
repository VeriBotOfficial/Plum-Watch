package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f13062a = new HashMap();

    public static void a(Context context, String str) {
        a(context, str, null);
    }

    public static void a(Context context, String str, Bundle bundle) {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setAction(str);
        localBroadcastManager.sendBroadcast(intent);
    }

    public static void a(Context context, IView iView) {
        String[] split;
        String action = iView.getAction();
        if (TextUtils.isEmpty(action) || (split = action.split(",")) == null) {
            return;
        }
        for (String str : split) {
            a(context, str);
        }
    }
}
