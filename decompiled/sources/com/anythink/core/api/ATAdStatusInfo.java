package com.anythink.core.api;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class ATAdStatusInfo {
    private ATAdInfo mATTopAdInfo;
    private boolean mIsLoading;
    private boolean mIsReady;

    public ATAdStatusInfo(boolean z, boolean z2, ATAdInfo aTAdInfo) {
        this.mIsLoading = z;
        this.mIsReady = z2;
        this.mATTopAdInfo = aTAdInfo;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public ATAdInfo getATTopAdInfo() {
        return this.mATTopAdInfo;
    }

    public String toString() {
        StringBuilder append = new StringBuilder("ATAdStatusInfo{isLoading=").append(this.mIsLoading).append(", isReady=").append(this.mIsReady).append(", topAdInfo=");
        Object obj = this.mATTopAdInfo;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        return append.append(obj).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
