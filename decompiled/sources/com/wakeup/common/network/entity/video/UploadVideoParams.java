package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadVideoParams.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018¨\u0006J"}, d2 = {"Lcom/wakeup/common/network/entity/video/UploadVideoParams;", "", "coverUrl", "", "width", "", "height", "categoryUrl", "categoryTitle", "categoryContent", "categorySize", "", "categoryDuration", "", "categoryLevel1", "categoryLevel2", "country", "selfClarification", "categoryVisibility", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DJIIILjava/lang/String;Ljava/lang/String;)V", "getCoverUrl", "()Ljava/lang/String;", "setCoverUrl", "(Ljava/lang/String;)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "getCategoryUrl", "setCategoryUrl", "getCategoryTitle", "setCategoryTitle", "getCategoryContent", "setCategoryContent", "getCategorySize", "()D", "setCategorySize", "(D)V", "getCategoryDuration", "()J", "setCategoryDuration", "(J)V", "getCategoryLevel1", "setCategoryLevel1", "getCategoryLevel2", "setCategoryLevel2", "getCountry", "setCountry", "getSelfClarification", "setSelfClarification", "getCategoryVisibility", "setCategoryVisibility", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UploadVideoParams {
    private String categoryContent;
    private long categoryDuration;
    private int categoryLevel1;
    private int categoryLevel2;
    private double categorySize;
    private String categoryTitle;
    private String categoryUrl;
    private String categoryVisibility;
    private int country;
    private String coverUrl;
    private int height;
    private String selfClarification;
    private int width;

    public UploadVideoParams() {
        this(null, 0, 0, null, null, null, 0.0d, 0L, 0, 0, 0, null, null, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCategoryLevel2() {
        return this.categoryLevel2;
    }

    /* renamed from: component11, reason: from getter */
    public final int getCountry() {
        return this.country;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSelfClarification() {
        return this.selfClarification;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCategoryUrl() {
        return this.categoryUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCategoryContent() {
        return this.categoryContent;
    }

    /* renamed from: component7, reason: from getter */
    public final double getCategorySize() {
        return this.categorySize;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCategoryDuration() {
        return this.categoryDuration;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCategoryLevel1() {
        return this.categoryLevel1;
    }

    public final UploadVideoParams copy(String coverUrl, int width, int height, String categoryUrl, String categoryTitle, String categoryContent, double categorySize, long categoryDuration, int categoryLevel1, int categoryLevel2, int country, String selfClarification, String categoryVisibility) {
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(categoryContent, "categoryContent");
        Intrinsics.checkNotNullParameter(selfClarification, "selfClarification");
        Intrinsics.checkNotNullParameter(categoryVisibility, "categoryVisibility");
        return new UploadVideoParams(coverUrl, width, height, categoryUrl, categoryTitle, categoryContent, categorySize, categoryDuration, categoryLevel1, categoryLevel2, country, selfClarification, categoryVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadVideoParams)) {
            return false;
        }
        UploadVideoParams uploadVideoParams = (UploadVideoParams) other;
        return Intrinsics.areEqual(this.coverUrl, uploadVideoParams.coverUrl) && this.width == uploadVideoParams.width && this.height == uploadVideoParams.height && Intrinsics.areEqual(this.categoryUrl, uploadVideoParams.categoryUrl) && Intrinsics.areEqual(this.categoryTitle, uploadVideoParams.categoryTitle) && Intrinsics.areEqual(this.categoryContent, uploadVideoParams.categoryContent) && Double.compare(this.categorySize, uploadVideoParams.categorySize) == 0 && this.categoryDuration == uploadVideoParams.categoryDuration && this.categoryLevel1 == uploadVideoParams.categoryLevel1 && this.categoryLevel2 == uploadVideoParams.categoryLevel2 && this.country == uploadVideoParams.country && Intrinsics.areEqual(this.selfClarification, uploadVideoParams.selfClarification) && Intrinsics.areEqual(this.categoryVisibility, uploadVideoParams.categoryVisibility);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.coverUrl.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.categoryUrl.hashCode()) * 31) + this.categoryTitle.hashCode()) * 31) + this.categoryContent.hashCode()) * 31) + Double.hashCode(this.categorySize)) * 31) + Long.hashCode(this.categoryDuration)) * 31) + Integer.hashCode(this.categoryLevel1)) * 31) + Integer.hashCode(this.categoryLevel2)) * 31) + Integer.hashCode(this.country)) * 31) + this.selfClarification.hashCode()) * 31) + this.categoryVisibility.hashCode();
    }

    public String toString() {
        return "UploadVideoParams(coverUrl=" + this.coverUrl + ", width=" + this.width + ", height=" + this.height + ", categoryUrl=" + this.categoryUrl + ", categoryTitle=" + this.categoryTitle + ", categoryContent=" + this.categoryContent + ", categorySize=" + this.categorySize + ", categoryDuration=" + this.categoryDuration + ", categoryLevel1=" + this.categoryLevel1 + ", categoryLevel2=" + this.categoryLevel2 + ", country=" + this.country + ", selfClarification=" + this.selfClarification + ", categoryVisibility=" + this.categoryVisibility + Separators.RPAREN;
    }

    public UploadVideoParams(String coverUrl, int i, int i2, String categoryUrl, String categoryTitle, String categoryContent, double d, long j, int i3, int i4, int i5, String selfClarification, String categoryVisibility) {
        Intrinsics.checkNotNullParameter(coverUrl, "coverUrl");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(categoryContent, "categoryContent");
        Intrinsics.checkNotNullParameter(selfClarification, "selfClarification");
        Intrinsics.checkNotNullParameter(categoryVisibility, "categoryVisibility");
        this.coverUrl = coverUrl;
        this.width = i;
        this.height = i2;
        this.categoryUrl = categoryUrl;
        this.categoryTitle = categoryTitle;
        this.categoryContent = categoryContent;
        this.categorySize = d;
        this.categoryDuration = j;
        this.categoryLevel1 = i3;
        this.categoryLevel2 = i4;
        this.country = i5;
        this.selfClarification = selfClarification;
        this.categoryVisibility = categoryVisibility;
    }

    public /* synthetic */ UploadVideoParams(String str, int i, int i2, String str2, String str3, String str4, double d, long j, int i3, int i4, int i5, String str5, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? "" : str4, (i6 & 64) != 0 ? 0.0d : d, (i6 & 128) != 0 ? 0L : j, (i6 & 256) != 0 ? -1 : i3, (i6 & 512) == 0 ? i4 : -1, (i6 & 1024) == 0 ? i5 : 0, (i6 & 2048) != 0 ? "" : str5, (i6 & 4096) != 0 ? "" : str6);
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final void setCoverUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverUrl = str;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final String getCategoryUrl() {
        return this.categoryUrl;
    }

    public final void setCategoryUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryUrl = str;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final void setCategoryTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryTitle = str;
    }

    public final String getCategoryContent() {
        return this.categoryContent;
    }

    public final void setCategoryContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryContent = str;
    }

    public final double getCategorySize() {
        return this.categorySize;
    }

    public final void setCategorySize(double d) {
        this.categorySize = d;
    }

    public final long getCategoryDuration() {
        return this.categoryDuration;
    }

    public final void setCategoryDuration(long j) {
        this.categoryDuration = j;
    }

    public final int getCategoryLevel1() {
        return this.categoryLevel1;
    }

    public final void setCategoryLevel1(int i) {
        this.categoryLevel1 = i;
    }

    public final int getCategoryLevel2() {
        return this.categoryLevel2;
    }

    public final void setCategoryLevel2(int i) {
        this.categoryLevel2 = i;
    }

    public final int getCountry() {
        return this.country;
    }

    public final void setCountry(int i) {
        this.country = i;
    }

    public final String getSelfClarification() {
        return this.selfClarification;
    }

    public final void setSelfClarification(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selfClarification = str;
    }

    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    public final void setCategoryVisibility(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryVisibility = str;
    }
}
