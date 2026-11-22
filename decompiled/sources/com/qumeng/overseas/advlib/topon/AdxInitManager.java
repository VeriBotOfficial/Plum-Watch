package com.qumeng.overseas.advlib.topon;

import android.content.Context;
import android.util.Log;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.qumeng.overseas.advlib.api.AiClkAdManager;
import com.qumeng.overseas.advlib.core.QMConfig;
import java.util.Map;

/* loaded from: classes17.dex */
public class AdxInitManager extends ATInitMediation {
    private static final String TAG = "AdxInitManager";
    private static volatile AdxInitManager sInstance;
    Context applicationContext;
    private boolean mIsInit = false;

    private AdxInitManager() {
    }

    public static AdxInitManager getInstance() {
        if (sInstance == null) {
            synchronized (AdxInitManager.class) {
                if (sInstance == null) {
                    sInstance = new AdxInitManager();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAdxSDK(MediationInitCallback mediationInitCallback, Map<String, Object> map, Context context) {
        try {
            synchronized (this) {
                if (this.mIsInit) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                try {
                    Log.d(TAG, "initialize: ");
                    AiClkAdManager.getInstance().init(new QMConfig.Builder().build(context));
                } catch (Exception e) {
                    mediationInitCallback.onFail("Failed to initialize AdCup SDK: " + e.getMessage());
                }
                this.mIsInit = true;
                if (mediationInitCallback != null) {
                    mediationInitCallback.onSuccess();
                }
            }
        } catch (Throwable th) {
            this.mIsInit = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th.getMessage());
            }
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return AdxAdapterConst.NETWORK_NAME;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return AiClkAdManager.getSdkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        if (!this.mIsInit) {
            this.applicationContext = context.getApplicationContext();
            runOnThreadPool(new Runnable() { // from class: com.qumeng.overseas.advlib.topon.AdxInitManager.1
                @Override // java.lang.Runnable
                public void run() {
                    AdxInitManager adxInitManager = AdxInitManager.this;
                    adxInitManager.initAdxSDK(mediationInitCallback, map, adxInitManager.applicationContext);
                }
            });
        } else if (mediationInitCallback != null) {
            mediationInitCallback.onSuccess();
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return false;
    }
}
