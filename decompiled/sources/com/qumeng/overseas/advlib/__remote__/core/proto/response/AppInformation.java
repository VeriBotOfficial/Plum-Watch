package com.qumeng.overseas.advlib.__remote__.core.proto.response;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;

/* loaded from: classes17.dex */
public class AppInformation extends JSONBeanFrm {
    public static final String DEFAULT_APP_FUNCTION_URL = "https://cdn-qukan.1sapp.com/qukan/app-info/default.html";
    public static final String DEFAULT_APP_VERSION = "1.0.0";
    public static final String DEFAULT_DEVELOPERS = "移动应用开发";
    public static final String DEFAULT_PRIVACY_PROTOCOL_URL = "https://www.yidianzixun.com/landing_privacyx";
    public String permission_protocol_url;
    public String app_version = "1.0.0";
    public String developers = DEFAULT_DEVELOPERS;
    public String privacy_protocol_url = DEFAULT_PRIVACY_PROTOCOL_URL;
    public String function_desc_url = DEFAULT_APP_FUNCTION_URL;

    public String getApp_version() {
        return this.app_version;
    }

    public String getDevelopers() {
        return this.developers;
    }

    public String getFunction_desc_url() {
        return this.function_desc_url;
    }

    public String getPermission_protocol_url() {
        return this.permission_protocol_url;
    }

    public String getPrivacy_protocol_url() {
        return this.privacy_protocol_url;
    }

    public void setApp_version(String str) {
        this.app_version = str;
    }

    public void setDevelopers(String str) {
        this.developers = str;
    }

    public void setFunction_desc_url(String str) {
        this.function_desc_url = str;
    }

    public void setPermission_protocol_url(String str) {
        this.permission_protocol_url = str;
    }

    public void setPrivacy_protocol_url(String str) {
        this.privacy_protocol_url = str;
    }
}
