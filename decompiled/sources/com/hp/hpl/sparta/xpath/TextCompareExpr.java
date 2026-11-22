package com.hp.hpl.sparta.xpath;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public abstract class TextCompareExpr extends BooleanExpr {
    private final String value_;

    TextCompareExpr(String str) {
        this.value_ = str;
    }

    public String getValue() {
        return this.value_;
    }

    protected String toString(String str) {
        return "[text()" + str + Separators.QUOTE + this.value_ + "']";
    }
}
