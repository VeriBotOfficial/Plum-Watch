package com.iab.omid.library.mmadbridge.adsession;

import org.xmind.core.INotes;

/* JADX INFO: loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML(INotes.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
