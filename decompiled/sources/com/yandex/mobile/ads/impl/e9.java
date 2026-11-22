package com.yandex.mobile.ads.impl;

import org.xmind.core.INotes;

/* loaded from: classes5.dex */
public enum e9 {
    c(INotes.HTML),
    d("native"),
    e("javascript");

    private final String b;

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }

    e9(String str) {
        this.b = str;
    }
}
