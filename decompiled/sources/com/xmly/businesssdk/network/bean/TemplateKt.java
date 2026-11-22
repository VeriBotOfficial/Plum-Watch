package com.xmly.businesssdk.network.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000b¨\u0006\u0010"}, d2 = {"is1r3cStyle", "", "Lcom/xmly/businesssdk/network/bean/Template;", "is2r3cStyle", "isAuthorStyle", "isBannerStyle", "isFeedStyle", "isFunctionStyle", "isIPStyle", "isLikeStyle", "isPlayHistory", "Lcom/xmly/businesssdk/network/bean/TemplateCard;", "isPlayRecommendStyle", "isRankStyle", "isShowMore", "isTodayHot", "business-sdk_wakeRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TemplateKt {
    public static final boolean is1r3cStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_1r_3c");
    }

    public static final boolean is2r3cStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_2r_3c");
    }

    public static final boolean isAuthorStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_author");
    }

    public static final boolean isBannerStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "banner");
    }

    public static final boolean isFeedStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_feed");
    }

    public static final boolean isFunctionStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "icon");
    }

    public static final boolean isIPStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_ip");
    }

    public static final boolean isLikeStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_like");
    }

    public static final boolean isPlayHistory(TemplateCard templateCard) {
        Intrinsics.checkNotNullParameter(templateCard, "<this>");
        return Intrinsics.areEqual(templateCard.getTitle(), "最近播放");
    }

    public static final boolean isPlayRecommendStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "p_play_screen");
    }

    public static final boolean isRankStyle(Template template) {
        Intrinsics.checkNotNullParameter(template, "<this>");
        return Intrinsics.areEqual(template.getStyle(), "top") || Intrinsics.areEqual(template.getStyle(), "p_rank");
    }

    public static final boolean isShowMore(Template template) {
        String jumpType;
        Intrinsics.checkNotNullParameter(template, "<this>");
        String jumpValue = template.getJumpValue();
        return (jumpValue == null || jumpValue.length() == 0 || (jumpType = template.getJumpType()) == null || jumpType.length() == 0) ? false : true;
    }

    public static final boolean isTodayHot(TemplateCard templateCard) {
        Intrinsics.checkNotNullParameter(templateCard, "<this>");
        return Intrinsics.areEqual(templateCard.getTitle(), "今日热点");
    }
}
