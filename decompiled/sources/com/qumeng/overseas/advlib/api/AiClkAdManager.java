package com.qumeng.overseas.advlib.api;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.qumeng.overseas.advlib.common.a;
import com.qumeng.overseas.advlib.common.b;
import com.qumeng.overseas.advlib.common.c;
import com.qumeng.overseas.advlib.common.d;
import com.qumeng.overseas.advlib.core.IMultiAdRequest;
import com.qumeng.overseas.advlib.core.MediaEventType;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.core.i;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes17.dex */
public class AiClkAdManager {
    private static volatile AiClkAdManager sManager;
    private final AtomicBoolean isInit = new AtomicBoolean(false);
    private i mFactory;
    private QMConfig mQmConfig;
    private String mediaUserId;

    private AiClkAdManager() {
    }

    public static AiClkAdManager getInstance() {
        if (sManager == null) {
            synchronized (AiClkAdManager.class) {
                if (sManager == null) {
                    sManager = new AiClkAdManager();
                }
            }
        }
        return sManager;
    }

    public static String getSdkVersion() {
        return "1.049.10.444";
    }

    private void setAaid() {
        QMConfig qMConfig = this.mQmConfig;
        if (qMConfig == null || qMConfig.getCustomControl() == null) {
            return;
        }
        c.b(this.mQmConfig.getCustomControl().getAdvertisingId());
    }

    public IMultiAdRequest createAdRequest() {
        i iVar = this.mFactory;
        if (iVar != null) {
            return iVar.createNativeMultiAdRequest();
        }
        Log.i("Adseye", "Adseye ad not init");
        return null;
    }

    public void init(QMConfig qMConfig) {
        if (this.isInit.getAndSet(true)) {
            System.err.println("Adseye ad already init, ignore repeated init");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mQmConfig = qMConfig;
        try {
            setAaid();
            this.mFactory = i.a(qMConfig);
            setMediaUserId(this.mediaUserId);
            if (this.mQmConfig != null) {
                c.a(qMConfig.getContext(), SystemClock.elapsedRealtime() - elapsedRealtime);
            }
        } catch (Throwable th) {
            if (this.mQmConfig != null) {
                c.a(qMConfig.getContext(), SystemClock.elapsedRealtime() - elapsedRealtime, th);
            }
        }
    }

    public boolean isPersonalizedAdsEnabled(Context context) {
        return d.a(context);
    }

    public void setMediaUserId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i iVar = this.mFactory;
        if (iVar == null) {
            this.mediaUserId = str;
        } else {
            iVar.setMediaUserId(str);
        }
    }

    public void setPersonalRecommend(boolean z) {
        try {
            b.b((Class<?>) a.c().b(IMultiAdRequest.class)).a("savePersonalRecommendSwitch", Boolean.valueOf(z));
        } catch (Throwable unused) {
        }
    }

    public void traceMedia(MediaEventType mediaEventType, String str, String str2, Map<String, String> map) {
        i iVar = this.mFactory;
        if (iVar == null || mediaEventType == null) {
            return;
        }
        iVar.mediaTrace(mediaEventType.getEventString(), str, str2, map);
    }
}
