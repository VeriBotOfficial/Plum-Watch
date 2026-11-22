package com.qumeng.overseas.advlib.core;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class QMConfig {
    public static final String AppId_AdMost = "appId_admost";
    public static final String AppId_Pangle = "appId_pangle";
    public static final String AppId_TopOn = "appId_topOn";
    public static final String AppId_TradPlus = "appId_tradplus";
    public static final String AppKEY_TopOn = "appKey_topOn";
    private AdConsentStatus adConsentStatus = null;
    private String adMostAppId;
    private String androidId;
    private Context context;
    private QMCustomControl customControl;
    private boolean debug;
    private SdkInitListener listener;
    private Map map;
    private boolean mute;
    private String pangleAppId;
    private String tradPlusAppId;
    private String versionName;

    public enum AdConsentStatus {
        GRANTED,
        DENIED,
        UNKNOWN
    }

    public static class Builder {
        private AdConsentStatus adConsentStatus;
        private String adMostAppId;
        private String androidId;
        private QMCustomControl customControl;
        private boolean debug;
        private SdkInitListener listener;
        private Map map;
        private boolean mute;
        private String pangleAppId;
        private String tradPlusAppId;
        private String versionName;

        public Builder adConsentStatus(AdConsentStatus adConsentStatus) {
            this.adConsentStatus = adConsentStatus;
            return this;
        }

        @Deprecated
        public Builder adMostAppId(String str) {
            this.adMostAppId = str;
            return this;
        }

        public Builder androidId(String str) {
            this.androidId = str;
            return this;
        }

        public QMConfig build(Context context) {
            QMConfig qMConfig = new QMConfig();
            if (TextUtils.isEmpty(this.versionName)) {
                this.versionName = com.qumeng.overseas.advlib.common.e.b(context);
            }
            QMCustomControl qMCustomControl = this.customControl;
            if (qMCustomControl != null) {
                String androidId = qMCustomControl.getAndroidId();
                this.androidId = androidId;
                if (TextUtils.isEmpty(androidId) && this.customControl.isCanUseAndroidId()) {
                    this.androidId = com.qumeng.overseas.advlib.common.e.d(context);
                }
                if (this.map == null) {
                    this.map = new HashMap();
                }
                this.map.put(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.o, this.customControl.getDevImei());
                this.map.put("imsi", this.customControl.getDevImsi());
                this.map.put("mac_address", this.customControl.getMacAddress());
                if (!TextUtils.isEmpty(this.customControl.getDevImei()) || !TextUtils.isEmpty(this.customControl.getDevImsi()) || !TextUtils.isEmpty(this.customControl.getMacAddress()) || !this.customControl.isCanUsePhoneState()) {
                    this.map.put("is_control", Boolean.TRUE);
                }
            } else if (TextUtils.isEmpty(this.androidId)) {
                this.androidId = com.qumeng.overseas.advlib.common.e.d(context);
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            qMConfig.setContext(context);
            qMConfig.setVersionName(this.versionName);
            qMConfig.setDebug(this.debug);
            qMConfig.setMute(this.mute);
            qMConfig.setMap(this.map);
            qMConfig.setAndroidId(this.androidId);
            qMConfig.setCustomControl(this.customControl);
            qMConfig.setPangleAppId(this.pangleAppId);
            qMConfig.setTradPlusAppId(this.tradPlusAppId);
            qMConfig.setAdMostAppId(this.adMostAppId);
            qMConfig.setSdkInitListener(this.listener);
            qMConfig.setAdConsentStatus(this.adConsentStatus);
            return qMConfig;
        }

        public Builder customControl(QMCustomControl qMCustomControl) {
            this.customControl = qMCustomControl;
            return this;
        }

        public Builder debug(boolean z) {
            this.debug = z;
            return this;
        }

        public Builder extraMap(Map map) {
            this.map = map;
            return this;
        }

        public Builder mute(boolean z) {
            this.mute = z;
            return this;
        }

        @Deprecated
        public Builder pangleAppId(String str) {
            this.pangleAppId = str;
            return this;
        }

        public Builder sdkInitListener(SdkInitListener sdkInitListener) {
            this.listener = sdkInitListener;
            return this;
        }

        @Deprecated
        public Builder tradPlusAppId(String str) {
            this.tradPlusAppId = str;
            return this;
        }

        public Builder versionName(String str) {
            this.versionName = str;
            return this;
        }
    }

    public AdConsentStatus getAdConsentStatus() {
        return this.adConsentStatus;
    }

    public String getAdMostAppId() {
        return this.adMostAppId;
    }

    public String getAndroidId() {
        QMCustomControl qMCustomControl = this.customControl;
        return (qMCustomControl == null || qMCustomControl.isCanUseAndroidId()) ? this.androidId : this.customControl.getAndroidId();
    }

    public Context getContext() {
        return this.context;
    }

    public QMCustomControl getCustomControl() {
        return this.customControl;
    }

    public SdkInitListener getListener() {
        return this.listener;
    }

    public Map getMap() {
        return this.map;
    }

    public String getPangleAppId() {
        return this.pangleAppId;
    }

    public String getTradPlusAppId() {
        return this.tradPlusAppId;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isMute() {
        return this.mute;
    }

    public void setAdConsentStatus(AdConsentStatus adConsentStatus) {
        this.adConsentStatus = adConsentStatus;
    }

    public void setAdMostAppId(String str) {
        this.adMostAppId = str;
    }

    public void setAndroidId(String str) {
        this.androidId = str;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setCustomControl(QMCustomControl qMCustomControl) {
        this.customControl = qMCustomControl;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPangleAppId(String str) {
        this.pangleAppId = str;
    }

    public void setSdkInitListener(SdkInitListener sdkInitListener) {
        this.listener = sdkInitListener;
    }

    public void setTradPlusAppId(String str) {
        this.tradPlusAppId = str;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
