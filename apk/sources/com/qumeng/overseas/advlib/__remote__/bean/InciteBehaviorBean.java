package com.qumeng.overseas.advlib.__remote__.bean;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
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

    public void setIdeaId(int r1) {
        this.ideaId = r1;
    }

    public void setInteractionType(int r1) {
        this.interactionType = r1;
    }

    public void setNeedCheckLocalRecord(boolean z) {
        this.isNeedCheckLocalRecord = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPlayTime(int r1) {
        this.playTime = r1;
    }

    public void setSearchId(String str) {
        this.searchId = str;
    }

    public String toString() {
        return "InciteBehaviorBean{packageName='" + this.packageName + "', featureId='" + this.featureId + "', searchId='" + this.searchId + "', ideaId='" + this.ideaId + "', playTime=" + this.playTime + ", interactionType=" + this.interactionType + ", dpUrl='" + this.dpUrl + "', isNeedCheckLocalRecord=" + this.isNeedCheckLocalRecord + AbstractJsonLexerKt.END_OBJ;
    }

    public InciteBehaviorBean(String str, String str2, String str3, int r4, int r5, int r6, String str4, boolean z) {
        this.packageName = str;
        this.featureId = str2;
        this.searchId = str3;
        this.ideaId = r4;
        this.playTime = r5;
        this.interactionType = r6;
        this.dpUrl = str4;
        this.isNeedCheckLocalRecord = z;
    }
}
