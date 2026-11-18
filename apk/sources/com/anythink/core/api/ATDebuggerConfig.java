package com.anythink.core.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ATDebuggerConfig {
    private int mBannerType;
    private int mInterstitialType;
    private int mNativeType;
    private int mNetworkFirmId;
    private int mRewarderVideoType;
    private int mSplashType;
    private String mUMPTestDeviceId;

    public int getNetworkFirmId() {
        return this.mNetworkFirmId;
    }

    public int getNativeType() {
        return this.mNativeType;
    }

    public int getBannerType() {
        return this.mBannerType;
    }

    public int getSplashType() {
        return this.mSplashType;
    }

    public int getInterstitialType() {
        return this.mInterstitialType;
    }

    public int getRewarderVideoType() {
        return this.mRewarderVideoType;
    }

    public String getUMPTestDeviceId() {
        return this.mUMPTestDeviceId;
    }

    public void fillRequestParam(JSONObject jSONObject) {
        try {
            jSONObject.put("is_test", 1);
            jSONObject.put("test_nw_firm", this.mNetworkFirmId);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("0", this.mNativeType);
            jSONObject2.put("2", this.mBannerType);
            jSONObject2.put("1", this.mRewarderVideoType);
            jSONObject2.put("3", this.mInterstitialType);
            jSONObject2.put("4", this.mSplashType);
            if (jSONObject2.length() > 0) {
                jSONObject.put("test_format_sub", jSONObject2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static class Builder {
        private int mBannerType;
        private int mInterstitialType;
        private int mNativeType;
        private int mNetworkFirmId;
        private int mRewarderVideoType;
        private int mSplashType;
        private String mUMPTestDeviceId;

        public Builder() {
        }

        public Builder(int r1) {
            this.mNetworkFirmId = r1;
            fillDefaultType(r1);
        }

        public Builder setNetworkFirmId(int r1) {
            this.mNetworkFirmId = r1;
            fillDefaultType(r1);
            return this;
        }

        public Builder setNativeType(int r1) {
            this.mNativeType = r1;
            return this;
        }

        public Builder setBannerType(int r1) {
            this.mBannerType = r1;
            return this;
        }

        public Builder setSplashType(int r1) {
            this.mSplashType = r1;
            return this;
        }

        public Builder setInterstitial(int r1) {
            this.mInterstitialType = r1;
            return this;
        }

        public Builder setRewardedVideoType(int r1) {
            this.mRewarderVideoType = r1;
            return this;
        }

        public Builder setUMPTestDeviceId(String str) {
            this.mUMPTestDeviceId = str;
            return this;
        }

        public ATDebuggerConfig build() {
            ATDebuggerConfig aTDebuggerConfig = new ATDebuggerConfig();
            aTDebuggerConfig.mNetworkFirmId = this.mNetworkFirmId;
            aTDebuggerConfig.mNativeType = this.mNativeType;
            aTDebuggerConfig.mBannerType = this.mBannerType;
            aTDebuggerConfig.mSplashType = this.mSplashType;
            aTDebuggerConfig.mInterstitialType = this.mInterstitialType;
            aTDebuggerConfig.mRewarderVideoType = this.mRewarderVideoType;
            aTDebuggerConfig.mUMPTestDeviceId = this.mUMPTestDeviceId;
            return aTDebuggerConfig;
        }

        private void fillDefaultType(int r5) {
            if (r5 == 1) {
                this.mNativeType = 1;
                return;
            }
            if (r5 == 2 || r5 == 6 || r5 == 8) {
                this.mNativeType = 1;
            } else {
                if (r5 == 15) {
                    this.mNativeType = 101;
                    this.mInterstitialType = 3;
                    return;
                }
                if (r5 == 28) {
                    this.mNativeType = 101;
                    return;
                }
                if (r5 == 39) {
                    this.mNativeType = 1;
                    this.mInterstitialType = 1;
                    this.mSplashType = 1;
                    return;
                } else {
                    if (r5 == 59) {
                        this.mBannerType = 1;
                        return;
                    }
                    if (r5 != 66) {
                        if (r5 == 22) {
                            this.mNativeType = 1;
                            this.mInterstitialType = 2;
                            return;
                        } else {
                            if (r5 != 23) {
                                return;
                            }
                            this.mInterstitialType = 1;
                            return;
                        }
                    }
                }
            }
            this.mInterstitialType = 1;
        }
    }
}
