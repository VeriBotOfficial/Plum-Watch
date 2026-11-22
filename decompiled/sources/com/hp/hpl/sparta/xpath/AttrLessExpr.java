package com.hp.hpl.sparta.xpath;

import android.gov.nist.core.Separators;

/* loaded from: classes12.dex */
public class AttrLessExpr extends AttrRelationalExpr {
    public AttrLessExpr(String str, int i) {
        super(str, i);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(BooleanExprVisitor booleanExprVisitor) throws XPathException {
        booleanExprVisitor.visit(this);
    }

    @Override // com.hp.hpl.sparta.xpath.AttrExpr
    public String toString() {
        return toString(Separators.LESS_THAN);
    }
}
