package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.bean;

/* loaded from: classes17.dex */
public class JsonStyleBean extends StyleBean {
    private int adType;
    private boolean isDsp = false;
    private boolean isRecode;

    public JsonStyleBean(String str, String str2, int i, String str3, boolean z) {
        this.styleId = str;
        this.adType = i;
        this.interaction_type = str3;
        this.styleJson = str2;
        this.isRecode = z;
    }

    public int getAdType() {
        return this.adType;
    }

    public int getKey() {
        return (this.isRecode + this.styleId + this.adType + this.interaction_type + this.isDsp).hashCode();
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isRecode() {
        return this.isRecode;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setRecode(boolean z) {
        this.isRecode = z;
    }
}
