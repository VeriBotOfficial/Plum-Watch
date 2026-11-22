package com.wakeup.common.storage.model.settings.model;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class AppMessageModel {
    private transient Drawable appIcon;
    private String appName;
    private transient ApplicationInfo applicationInfo;
    private boolean isOpen;
    private int messageId;
    private String packageName;

    public AppMessageModel() {
    }

    public AppMessageModel(String appName, String packageName, int messageId) {
        this.appName = appName;
        this.packageName = packageName;
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

    public boolean isOpen() {
        return this.isOpen;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    public Drawable getAppIcon() {
        return this.appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
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
