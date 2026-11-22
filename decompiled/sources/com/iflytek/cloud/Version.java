package com.iflytek.cloud;

import android.text.TextUtils;
import com.iflytek.cloud.a.f.d;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;

/* loaded from: classes17.dex */
public class Version {

    /* renamed from: a, reason: collision with root package name */
    private static String f11094a = "";
    private static String b = "0";

    private static String getModeVersion() {
        return d.a.MSC == SpeechUtility.DEF_ENGINE_MODE ? "6" : "5";
    }

    private static String getMscVersion() {
        int i;
        if ("0".equalsIgnoreCase(b)) {
            try {
                if (MSC.isLoaded()) {
                    MSCSessionInfo mSCSessionInfo = new MSCSessionInfo();
                    byte[] QMSPGetVersion = MSC.QMSPGetVersion("ver_msc".getBytes("gb2312"), mSCSessionInfo);
                    if (mSCSessionInfo.errorcode == 0) {
                        String str = new String(QMSPGetVersion, "gb2312");
                        DebugLog.LogD("get msc full version name: ".concat(str));
                        int lastIndexOf = str.lastIndexOf(".");
                        if (lastIndexOf >= 0 && str.length() > (i = lastIndexOf + 1)) {
                            b = str.substring(i);
                        }
                    } else {
                        DebugLog.LogD("get msc version error: " + mSCSessionInfo.errorcode);
                    }
                } else {
                    DebugLog.LogE("get msc version msc is not load.");
                }
            } catch (Throwable th) {
                DebugLog.LogE("get msc version exception:");
                DebugLog.LogE(th);
            }
        }
        return b;
    }

    public static String getVersion() {
        if (TextUtils.isEmpty(f11094a) || "0".equalsIgnoreCase(b)) {
            f11094a = "4." + getModeVersion() + ".1143." + getMscVersion();
        }
        return f11094a;
    }
}
