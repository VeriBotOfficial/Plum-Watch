package com.hihonor.push.sdk.common;

import com.hihonor.push.sdk.c;
import com.hihonor.push.sdk.g;

/* loaded from: classes11.dex */
public class RequestHeader implements c {

    @g
    private String AAID;

    @g
    private String appId;

    @g
    private String certificateFingerprint;

    @g
    private String packageName;

    @g
    private String pushToken;

    @g
    private int sdkVersion;

    public String getAAID() {
        return this.AAID;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getCertificateFingerprint() {
        return this.certificateFingerprint;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public int getSdkVersion() {
        return this.sdkVersion;
    }

    public void setAAID(String str) {
        this.AAID = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCertificateFingerprint(String str) {
        this.certificateFingerprint = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPushToken(String str) {
        this.pushToken = str;
    }

    public void setSdkVersion(int i) {
        this.sdkVersion = i;
    }
}
