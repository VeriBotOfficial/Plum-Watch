package com.hp.hpl.sparta.xpath;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public class AttrTest extends NodeTest {
    private final String attrName_;

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return true;
    }

    AttrTest(String str) {
        this.attrName_ = str;
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getAttrName() {
        return this.attrName_;
    }

    public String toString() {
        return Separators.AT + this.attrName_;
    }
}
