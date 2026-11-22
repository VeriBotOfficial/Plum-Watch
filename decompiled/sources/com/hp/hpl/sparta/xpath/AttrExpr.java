package com.hp.hpl.sparta.xpath;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public abstract class AttrExpr extends BooleanExpr {
    private final String attrName_;

    AttrExpr(String str) {
        this.attrName_ = str;
    }

    public String getAttrName() {
        return this.attrName_;
    }

    public String toString() {
        return Separators.AT + this.attrName_;
    }
}
