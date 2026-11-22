package com.qumeng.overseas.advlib.__remote__.bean;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class InciteBehaviorBean implements Serializable {
    public String dpUrl;
    public String featureId;
    public int ideaId;
    public int interactionType;
    public boolean isNeedCheckLocalRecord;
    public String packageName;
    public int playTime;
    public String searchId;

    public InciteBehaviorBean() {
    }

    public String getDpUrl() {
        return this.dpUrl;
    }

    public String getFeatureId() {
        return this.featureId;
    }

    public int getIdeaId() {
        return this.ideaId;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPlayTime() {
        return this.playTime;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public boolean isNeedCheckLocalRecord() {
        return this.isNeedCheckLocalRecord;
    }

    public void setDpUrl(String str) {
        this.dpUrl = str;
    }

    public void setFeatureId(String str) {
        this.featureId = str;
    }

    public void setIdeaId(int i) {
        this.ideaId = i;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setNeedCheckLocalRecord(boolean z) {
        this.isNeedCheckLocalRecord = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPlayTime(int i) {
        this.playTime = i;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public String toString() {
        return "InciteBehaviorBean{packageName='" + this.packageName + "', featureId='" + this.featureId + "', searchId='" + this.searchId + "', ideaId='" + this.ideaId + "', playTime=" + this.playTime + ", interactionType=" + this.interactionType + ", dpUrl='" + this.dpUrl + "', isNeedCheckLocalRecord=" + this.isNeedCheckLocalRecord + AbstractJsonLexerKt.END_OBJ;
    }

    public InciteBehaviorBean(String str, String str2, String str3, int i, int i2, int i3, String str4, boolean z) {
        this.packageName = str;
        this.featureId = str2;
        this.searchId = str3;
        this.ideaId = i;
        this.playTime = i2;
        this.interactionType = i3;
        this.dpUrl = str4;
        this.isNeedCheckLocalRecord = z;
    }
}
