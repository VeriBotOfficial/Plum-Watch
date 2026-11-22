package com.anythink.core.debugger.api;

import com.tramini.plugin.a.b.a;

/* loaded from: classes12.dex */
public class DebuggerSdkInfo {
    private String debugKey;
    private String[] deniedUploadDeviceInfo;
    private String versionName;
    private String appId = "";
    private String appKey = "";
    private boolean isHavePreInitNetwork = false;
    private boolean isHaveLoadAd = false;
    private boolean isInitSdk = false;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String[] getDeniedUploadDeviceInfo() {
        return this.deniedUploadDeviceInfo;
    }

    public void setDeniedUploadDeviceInfo(String[] strArr) {
        this.deniedUploadDeviceInfo = strArr;
    }

    public boolean isHavePreInitNetwork() {
        return this.isHavePreInitNetwork;
    }

    public void setHavePreInitNetwork(boolean z) {
        this.isHavePreInitNetwork = z;
    }

    public boolean isHaveLoadAd() {
        return this.isHaveLoadAd;
    }

    public void setHaveLoadAd(boolean z) {
        this.isHaveLoadAd = z;
    }

    public boolean isInitSdk() {
        return this.isInitSdk;
    }

    public void setInitSdk(boolean z) {
        this.isInitSdk = z;
    }

    public String getDebugKey() {
        return this.debugKey;
    }

    public void setDebugKey(String str) {
        this.debugKey = str;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public boolean shouldRebootForDebugMode() {
        return this.isHavePreInitNetwork || this.isHaveLoadAd;
    }

    public String getIncompatibleVersion() {
        return a.f13695a;
    }
}
