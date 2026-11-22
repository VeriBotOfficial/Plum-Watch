package com.wakeup.common.storage.model;

import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class AppMessageModel {
    private transient Bitmap appIcon;
    private String appName;
    private transient ApplicationInfo applicationInfo;
    private boolean isOpen;
    private int messageId;
    private String packageName;
    private int versionCode;
    private String versionName;

    public AppMessageModel() {
    }

    public AppMessageModel(String appName, String packageName, int messageId) {
        this.appName = appName;
        this.packageName = packageName;
        this.versionName = "1.0";
        this.versionCode = 0;
        this.messageId = messageId;
        this.isOpen = true;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    public Bitmap getAppIcon() {
        return this.appIcon;
    }

    public void setAppIcon(Bitmap appIcon) {
        this.appIcon = appIcon;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }
}
