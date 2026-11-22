package com.anythink.network.facebook;

import android.content.Context;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FacebookATInitManager extends ATInitMediation {
    private static final String b = "FacebookATInitManager";
    private static volatile FacebookATInitManager c;

    /* renamed from: a, reason: collision with root package name */
    List<MediationInitCallback> f5765a;
    private boolean d = false;
    private Object e = new Object();

    public interface InitListener {
        void onError(String str);

        void onSuccess();
    }

    private FacebookATInitManager() {
    }

    public static FacebookATInitManager getInstance() {
        if (c == null) {
            synchronized (FacebookATInitManager.class) {
                if (c == null) {
                    c = new FacebookATInitManager();
                }
            }
        }
        return c;
    }

    public void initSDK(Context context, Map<String, Object> map) {
        initSDK(context, map, null);
    }

    @Override // com.anythink.core.api.ATInitMediation
    public synchronized void initSDK(Context context, Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        try {
            if (((Boolean) map.get(j.w.d)).booleanValue()) {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 1, 1000);
            }
        } catch (Throwable unused) {
        }
        try {
            if (((Boolean) map.get(j.w.e)).booleanValue()) {
                AdSettings.setMixedAudience(true);
            }
        } catch (Throwable unused2) {
        }
        try {
            synchronized (this.e) {
                if (AudienceNetworkAds.isInitialized(context)) {
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                    return;
                }
                if (this.f5765a == null) {
                    this.f5765a = new ArrayList();
                }
                if (mediationInitCallback != null) {
                    this.f5765a.add(mediationInitCallback);
                }
                if (this.d) {
                    return;
                }
                this.d = true;
                AudienceNetworkAds.buildInitSettings(context.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener() { // from class: com.anythink.network.facebook.FacebookATInitManager.1
                    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                        FacebookATInitManager.a(FacebookATInitManager.this, initResult);
                    }
                }).initialize();
            }
        } catch (Throwable unused3) {
        }
    }

    private void a(AudienceNetworkAds.InitResult initResult) {
        synchronized (this.e) {
            List<MediationInitCallback> list = this.f5765a;
            if (list != null) {
                for (MediationInitCallback mediationInitCallback : list) {
                    if (initResult.isSuccess()) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    } else if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(initResult.getMessage());
                    }
                }
            }
            this.d = false;
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Facebook";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return FacebookATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.facebook.ads.AudienceNetworkAds";
    }

    protected static String a(String str) {
        try {
            return new JSONObject(str).optString(AdSDKNotificationListener.ENCRYPTED_CPM_KEY);
        } catch (Throwable unused) {
            return "";
        }
    }

    final void a(final Context context, final Map<String, Object> map, final boolean z, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.facebook.FacebookATInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                FacebookBidRequestInfo facebookBidRequestInfo = new FacebookBidRequestInfo(context, map);
                if (z) {
                    facebookBidRequestInfo.fillBannerData(map);
                }
                if (!facebookBidRequestInfo.isValid()) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onFailed(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE);
                        return;
                    }
                    return;
                }
                ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                if (aTBidRequestInfoListener3 != null) {
                    aTBidRequestInfoListener3.onSuccess(facebookBidRequestInfo);
                }
            }
        });
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.10";
    }

    static /* synthetic */ void a(FacebookATInitManager facebookATInitManager, AudienceNetworkAds.InitResult initResult) {
        synchronized (facebookATInitManager.e) {
            List<MediationInitCallback> list = facebookATInitManager.f5765a;
            if (list != null) {
                for (MediationInitCallback mediationInitCallback : list) {
                    if (initResult.isSuccess()) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                    } else if (mediationInitCallback != null) {
                        mediationInitCallback.onFail(initResult.getMessage());
                    }
                }
            }
            facebookATInitManager.d = false;
        }
    }
}
