package com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomRuleKeys;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;
import com.secmtp.sdk.core.api.ATSDK;
import com.secmtp.sdk.core.api.ATSDKGlobalSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13346a = "TopOnSDK";

    public static void a(Context context, String str, String str2, boolean z, f.a aVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (aVar != null) {
                aVar.onSdkInitFailed();
                return;
            }
            return;
        }
        try {
            a(context);
            if (z) {
                ATSDKGlobalSetting.setAdMuted(Boolean.valueOf(z));
            }
            ATSDK.init(context, str, str2);
            if (aVar != null) {
                aVar.onSdkInitCompleted();
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.onSdkInitFailed();
            }
            n.b(f13346a, "初始化失败", new Object[0]);
        }
    }

    private static void a(Context context) {
        if (!com.qumeng.overseas.advlib.__remote__.core.coreutils.a.e()) {
            n.a(f13346a, "skip GDPR setting, status=" + com.qumeng.overseas.advlib.__remote__.core.coreutils.a.X, new Object[0]);
        } else {
            ATSDK.setGDPRUploadDataLevel(context, !com.qumeng.overseas.advlib.__remote__.core.coreutils.a.c() ? 1 : 0);
        }
    }

    public static String a() {
        return ATSDK.getSDKVersionName();
    }

    public static void a(Context context, int i) {
        ATSDK.setGDPRUploadDataLevel(context, i);
    }

    public static void a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ATCustomRuleKeys.AGE, "用户的年龄");
        ATSDK.initCustomMap(hashMap);
    }
}
