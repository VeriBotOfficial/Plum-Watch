package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.fxn.fxn.fxn.sg.kg;
import com.bytedance.sdk.component.utils.ckl;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private int bh;
    private int bx;
    private String ckl;
    private String dgx;
    private int dx;
    private String fxn;
    private int gff;
    private String hie;
    private float hm;
    private int iwp;
    private String je;
    private int jq;
    private int jz;
    private Map<String, Object> ke;
    private int kg;
    private int mvp;
    private float rb;
    private boolean rlu;
    private String rmu;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9402sg;
    private String tw;
    private String ud;
    private boolean uhw;
    private int ums;
    private String xdg;
    private boolean zu;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.rlu = true;
        this.zu = false;
        this.dx = 0;
        this.ums = 0;
        this.iwp = 0;
        this.bx = 1;
    }

    public void setUserData(String str) {
        this.ud = str;
    }

    public String getUserData() {
        return this.ud;
    }

    public String getCodeId() {
        return this.fxn;
    }

    public boolean isAutoPlay() {
        return this.rlu;
    }

    public boolean isExpressAd() {
        return this.zu;
    }

    public String getBidAdm() {
        return this.ckl;
    }

    public int getImgAcceptedWidth() {
        return this.kg;
    }

    public int getImgAcceptedHeight() {
        return this.gff;
    }

    public float getExpressViewAcceptedWidth() {
        return this.hm;
    }

    public float getExpressViewAcceptedHeight() {
        return this.rb;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.hm = f;
        this.rb = f2;
    }

    public boolean isSupportDeepLink() {
        return this.f9402sg;
    }

    public int getAdCount() {
        return this.bh;
    }

    public void setAdCount(int i) {
        this.bh = i;
    }

    public String getRewardName() {
        return this.tw;
    }

    public int getRewardAmount() {
        return this.jq;
    }

    public String getMediaExtra() {
        return this.hie;
    }

    public String getUserID() {
        return this.dgx;
    }

    public String getAdId() {
        return this.xdg;
    }

    public String getCreativeId() {
        return this.rmu;
    }

    public String getExt() {
        return this.je;
    }

    public int getIsRotateBanner() {
        return this.dx;
    }

    public void setIsRotateBanner(int i) {
        this.dx = i;
    }

    public int getRotateTime() {
        return this.ums;
    }

    public void setRotateTime(int i) {
        this.ums = i;
    }

    public int getRotateOrder() {
        return this.iwp;
    }

    public void setRotateOrder(int i) {
        this.iwp = i;
    }

    public void setDurationSlotType(int i) {
        this.jz = i;
    }

    public int getDurationSlotType() {
        return this.jz;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.ke;
    }

    public void setPreload(boolean z) {
        this.uhw = z;
    }

    public boolean isPreload() {
        return this.uhw;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.fxn);
            jSONObject.put("mAdCount", this.bh);
            jSONObject.put("mIsAutoPlay", this.rlu);
            jSONObject.put("mImgAcceptedWidth", this.kg);
            jSONObject.put("mImgAcceptedHeight", this.gff);
            jSONObject.put("mExpressViewAcceptedWidth", this.hm);
            jSONObject.put("mExpressViewAcceptedHeight", this.rb);
            jSONObject.put("mSupportDeepLink", this.f9402sg);
            jSONObject.put("mRewardName", this.tw);
            jSONObject.put("mRewardAmount", this.jq);
            jSONObject.put("mMediaExtra", this.hie);
            jSONObject.put("mUserID", this.dgx);
            jSONObject.put("mNativeAdType", this.mvp);
            jSONObject.put("mIsExpressAd", this.zu);
            jSONObject.put("mAdId", this.xdg);
            jSONObject.put("mCreativeId", this.rmu);
            jSONObject.put("mExt", this.je);
            jSONObject.put("mBidAdm", this.ckl);
            jSONObject.put("mUserData", this.ud);
            jSONObject.put("mDurationSlotType", this.jz);
            jSONObject.put("mBannerType", this.bx);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int getBannerType() {
        return this.bx;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public static class Builder {
        private String ckl;
        private float dgx;
        private String fxn;
        private int hie;
        private String je;
        private float mvp;
        private boolean rlu;
        private String rmu;
        private String tw;
        private int ums;
        private String xdg;
        private String zu;
        private int kg = 640;
        private int gff = 320;
        private final boolean hm = true;
        private int rb = 1;
        private final String bh = "";

        /* renamed from: sg, reason: collision with root package name */
        private final int f9403sg = 0;
        private String jq = "defaultUser";
        private boolean ud = true;
        private Map<String, Object> dx = null;
        private int iwp = 1;

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.ckl = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.xdg = str;
            return this;
        }

        public Builder setExt(String str) {
            this.rmu = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.ud = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.fxn = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.rlu = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.kg = i;
            this.gff = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.dgx = f;
            this.mvp = f2;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.ums = i;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.rb = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.tw = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.jq = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.hie = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ckl.hm()) {
                kg.fxn(str);
            }
            this.zu = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.je = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.dx = map;
            return this;
        }

        public Builder setBannerType(int i) {
            this.iwp = i;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.fxn = this.fxn;
            adSlot.bh = this.rb;
            adSlot.f9402sg = true;
            adSlot.kg = this.kg;
            adSlot.gff = this.gff;
            float f = this.dgx;
            if (f <= 0.0f) {
                adSlot.hm = this.kg;
                adSlot.rb = this.gff;
            } else {
                adSlot.hm = f;
                adSlot.rb = this.mvp;
            }
            adSlot.tw = "";
            adSlot.jq = 0;
            adSlot.hie = this.tw;
            adSlot.dgx = this.jq;
            adSlot.mvp = this.hie;
            adSlot.rlu = this.ud;
            adSlot.zu = this.rlu;
            adSlot.ckl = this.zu;
            adSlot.xdg = this.ckl;
            adSlot.rmu = this.xdg;
            adSlot.je = this.rmu;
            adSlot.ud = this.je;
            adSlot.ke = this.dx;
            adSlot.jz = this.ums;
            adSlot.bx = this.iwp;
            return adSlot;
        }
    }
}
