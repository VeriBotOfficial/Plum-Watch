package com.alex;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxRewardedAd;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class AlexMaxRewardAd {
    private static Map<String, AlexMaxRewardAd> maxATRewardAdMap;
    MaxRewardedAdListener mImpressionListener;
    MaxRewardedAdListener mLoadListener;
    MaxAd mMaxAd;
    MaxRewardedAd maxRewardedAd;
    MaxRewardedAdListener maxRewardedAdListener;

    class a implements MaxRewardedAdListener {
        a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mImpressionListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdClicked(maxAd);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mLoadListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdDisplayFailed(maxAd, maxError);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mImpressionListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdDisplayed(maxAd);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mImpressionListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdHidden(maxAd);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mLoadListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdLoadFailed(str, maxError);
            }
            AlexMaxRewardAd.this.mLoadListener = null;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AlexMaxRewardAd alexMaxRewardAd = AlexMaxRewardAd.this;
            alexMaxRewardAd.mMaxAd = maxAd;
            MaxRewardedAdListener maxRewardedAdListener = alexMaxRewardAd.mLoadListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onAdLoaded(maxAd);
            }
            AlexMaxRewardAd.this.mLoadListener = null;
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            MaxRewardedAdListener maxRewardedAdListener = AlexMaxRewardAd.this.mImpressionListener;
            if (maxRewardedAdListener != null) {
                maxRewardedAdListener.onUserRewarded(maxAd, maxReward);
            }
        }
    }

    private AlexMaxRewardAd(String str) {
        this.maxRewardedAd = MaxRewardedAd.getInstance(str);
        a aVar = new a();
        this.maxRewardedAdListener = aVar;
        this.maxRewardedAd.setListener(aVar);
    }

    public static synchronized AlexMaxRewardAd getInstance(String str) {
        AlexMaxRewardAd alexMaxRewardAd;
        synchronized (AlexMaxRewardAd.class) {
            if (maxATRewardAdMap == null) {
                maxATRewardAdMap = new ConcurrentHashMap();
            }
            alexMaxRewardAd = maxATRewardAdMap.get(str);
            if (alexMaxRewardAd == null) {
                alexMaxRewardAd = new AlexMaxRewardAd(str);
                maxATRewardAdMap.put(str, alexMaxRewardAd);
            }
        }
        return alexMaxRewardAd;
    }

    public MaxAd getMaxAd() {
        return this.mMaxAd;
    }

    public boolean isReady() {
        MaxRewardedAd maxRewardedAd = this.maxRewardedAd;
        if (maxRewardedAd != null) {
            return maxRewardedAd.isReady();
        }
        return false;
    }

    public void load(MaxRewardedAdListener maxRewardedAdListener) {
        this.mLoadListener = maxRewardedAdListener;
        this.maxRewardedAd.loadAd();
    }

    public void setExtraParameter(String str, String str2) {
        this.maxRewardedAd.setExtraParameter(str, str2);
    }

    public void show(Activity activity, MaxRewardedAdListener maxRewardedAdListener) {
        this.mImpressionListener = maxRewardedAdListener;
        this.maxRewardedAd.showAd(activity);
    }
}
