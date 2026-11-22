package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class h32 {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f15651a;

    public h32() {
        Intrinsics.checkNotNullParameter("id", "attribute");
        Intrinsics.checkNotNullParameter("Ad", "parentTag");
        this.f15651a = new el2();
    }

    public final String a(XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f15651a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        String attributeValue = parser.getAttributeValue(null, "id");
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
