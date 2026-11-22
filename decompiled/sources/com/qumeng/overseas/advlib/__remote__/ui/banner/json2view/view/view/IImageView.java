package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view;

/* loaded from: classes17.dex */
public class IImageView extends IView {
    private String data;
    private String defaultUrl;
    private String excludeCorner;
    private String normalUrl;
    private String oppositeUrl;
    private String priorityData;
    private String scaleType;
    private String src;

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public String getData() {
        return this.data;
    }

    public String getDefaultUrl() {
        return this.defaultUrl;
    }

    public String getExcludeCorner() {
        return this.excludeCorner;
    }

    public String getNormalUrl() {
        return this.normalUrl;
    }

    public String getOppositeUrl() {
        return this.oppositeUrl;
    }

    public String getPriorityData() {
        return this.priorityData;
    }

    public String getScaleType() {
        return this.scaleType;
    }

    public String getSrc() {
        return this.src;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public void setData(String str) {
        this.data = str;
    }

    public void setDefaultUrl(String str) {
        this.defaultUrl = str;
    }

    public void setExcludeCorner(String str) {
        this.excludeCorner = str;
    }

    public void setNormalUrl(String str) {
        this.normalUrl = str;
    }

    public void setOppositeUrl(String str) {
        this.oppositeUrl = str;
    }

    public void setPriorityData(String str) {
        this.priorityData = str;
    }

    public void setScaleType(String str) {
        this.scaleType = str;
    }

    public void setSrc(String str) {
        this.src = str;
    }
}
