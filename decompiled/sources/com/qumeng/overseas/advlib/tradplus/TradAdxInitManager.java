package com.qumeng.overseas.advlib.tradplus;

import android.content.Context;
import android.util.Log;
import com.qumeng.overseas.advlib.api.AiClkAdManager;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.topon.AdxAdapterConst;
import com.tradplus.ads.base.adapter.TPInitMediation;
import java.util.Map;

/* loaded from: classes17.dex */
public class TradAdxInitManager extends TPInitMediation {
    private static final String TAG = "TradAdxInitManager";
    private static volatile TradAdxInitManager sInstance;
    Context applicationContext;
    private boolean mIsInit = false;

    private TradAdxInitManager() {
    }

    public static TradAdxInitManager getInstance() {
        if (sInstance == null) {
            synchronized (TradAdxInitManager.class) {
                if (sInstance == null) {
                    sInstance = new TradAdxInitManager();
                }
            }
        }
        return sInstance;
    }

    private void initAdxSDK(TPInitMediation.InitCallback initCallback, Context context) {
        try {
            synchronized (this) {
                if (this.mIsInit) {
                    if (initCallback != null) {
                        initCallback.onSuccess();
                    }
                    return;
                }
                try {
                    Log.d(TAG, "initialize: ");
                    AiClkAdManager.getInstance().init(new QMConfig.Builder().build(context));
                } catch (Exception e) {
                    initCallback.onFailed("", "Failed to initialize AdCup SDK: " + e.getMessage());
                }
                this.mIsInit = true;
                if (initCallback != null) {
                    initCallback.onSuccess();
                }
            }
        } catch (Throwable th) {
            this.mIsInit = false;
            if (initCallback != null) {
                initCallback.onFailed("", th.getMessage());
            }
        }
    }

    public String getNetworkVersionCode() {
        return AiClkAdManager.getSdkVersion();
    }

    public String getNetworkVersionName() {
        return AdxAdapterConst.NETWORK_NAME;
    }

    public void initSDK(Context context, Map<String, Object> map, Map<String, String> map2, TPInitMediation.InitCallback initCallback) {
        if (this.mIsInit) {
            if (initCallback != null) {
                initCallback.onSuccess();
            }
        } else {
            Context applicationContext = context.getApplicationContext();
            this.applicationContext = applicationContext;
            initAdxSDK(initCallback, applicationContext);
        }
    }

    public void suportGDPR(Context context, Map<String, Object> map) {
    }
}
