package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ew0;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public final class gw0 implements dl2<ew0> {

    /* renamed from: a, reason: collision with root package name */
    private final el2 f15634a;

    public /* synthetic */ gw0() {
        this(new el2());
    }

    @Override // com.yandex.mobile.ads.impl.dl2
    public final ew0 a(XmlPullParser parser, xj base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f15634a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "MediaFile");
        av.a(this.f15634a, parser, "parser", "delivery", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "delivery");
        av.a(this.f15634a, parser, "parser", "type", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "type");
        av.a(this.f15634a, parser, "parser", "height", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "height");
        av.a(this.f15634a, parser, "parser", "width", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "width");
        av.a(this.f15634a, parser, "parser", IjkMediaMeta.IJKM_KEY_BITRATE, "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, IjkMediaMeta.IJKM_KEY_BITRATE);
        av.a(this.f15634a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        av.a(this.f15634a, parser, "parser", "id", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "id");
        av.a(this.f15634a, parser, "parser", "codec", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "codec");
        av.a(this.f15634a, parser, "parser", "vmaf", "attributeName");
        String attributeValue9 = parser.getAttributeValue(null, "vmaf");
        this.f15634a.getClass();
        return new ew0.a(el2.c(parser)).f(attributeValue7).d(attributeValue).e(attributeValue3).i(attributeValue4).b(attributeValue5).a(attributeValue6).g(attributeValue2).c(attributeValue8).h(attributeValue9).a();
    }

    public gw0(el2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f15634a = xmlHelper;
    }
}
