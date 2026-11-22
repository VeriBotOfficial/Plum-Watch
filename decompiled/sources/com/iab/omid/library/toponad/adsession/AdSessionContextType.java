package com.iab.omid.library.toponad.adsession;

import org.xmind.core.INotes;

/* loaded from: classes17.dex */
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
