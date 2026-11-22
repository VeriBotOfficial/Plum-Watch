package com.wakeup.common.network.entity.mine;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class ApplicationModel implements Serializable {
    private String appId;
    private String applicationName;
    private String descInfo;
    private int downNum;
    private String downloadUrl;

    /* renamed from: id, reason: collision with root package name */
    private int f14223id;
    private String imgUrl;
    private boolean isInstall;
    private List<String> previewImgList;

    public boolean isInstall() {
        return this.isInstall;
    }

    public void setInstall(boolean install) {
        this.isInstall = install;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getDescInfo() {
        return this.descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public int getDownNum() {
        return this.downNum;
    }

    public void setDownNum(int downNum) {
        this.downNum = downNum;
    }

    public int getId() {
        return this.f14223id;
    }

    public void setId(int id2) {
        this.f14223id = id2;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public List<String> getPreviewImgList() {
        return this.previewImgList;
    }

    public void setPreviewImgList(List<String> previewImgList) {
        this.previewImgList = previewImgList;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
