package com.wakeup.feature.device.bean;

/* loaded from: classes3.dex */
public class Language {
    private String languageId;
    private int languageIdV2;
    private String languages;
    private String zh_lg;

    public Language(String str, String str2, String str3, int i) {
        this.zh_lg = str;
        this.languages = str2;
        this.languageId = str3;
        this.languageIdV2 = i;
    }

    public String getZh_lg() {
        return this.zh_lg;
    }

    public void setZh_lg(String str) {
        this.zh_lg = str;
    }

    public String getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(String str) {
        this.languageId = str;
    }

    public String getLanguages() {
        return this.languages;
    }

    public void setLanguages(String str) {
        this.languages = str;
    }

    public void setLanguageIdV2(int i) {
        this.languageIdV2 = i;
    }

    public int getLanguageIdV2() {
        return this.languageIdV2;
    }

    public String toString() {
        return "Language{zh_lg='" + this.zh_lg + "'languageId='" + this.languageId + "', languages='" + this.languages + "'}";
    }
}
