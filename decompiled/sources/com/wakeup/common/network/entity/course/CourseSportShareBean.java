package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CourseSportShareBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseSportShareBean;", "Ljava/io/Serializable;", "videoUrl", "", "tip", RnBuryPointApi.KEY_ACTION_NAME, RnBuryPointApi.KEY_ACTION_TYPE, "", "actionCount", Constants.BundleKey.KCAL, "", "heartRate", "shareImg", "actionTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getVideoUrl", "()Ljava/lang/String;", "getTip", "getActionName", "getActionType", "()I", "getActionCount", "getKcal", "()D", "getHeartRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShareImg", "getActionTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/course/CourseSportShareBean;", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CourseSportShareBean implements Serializable {
    private final int actionCount;
    private final String actionName;
    private final Long actionTime;
    private final int actionType;
    private final Integer heartRate;
    private final double kcal;
    private final String shareImg;
    private final String tip;
    private final String videoUrl;

    public static /* synthetic */ CourseSportShareBean copy$default(CourseSportShareBean courseSportShareBean, String str, String str2, String str3, int i, int i2, double d, Integer num, String str4, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = courseSportShareBean.videoUrl;
        }
        if ((i3 & 2) != 0) {
            str2 = courseSportShareBean.tip;
        }
        if ((i3 & 4) != 0) {
            str3 = courseSportShareBean.actionName;
        }
        if ((i3 & 8) != 0) {
            i = courseSportShareBean.actionType;
        }
        if ((i3 & 16) != 0) {
            i2 = courseSportShareBean.actionCount;
        }
        if ((i3 & 32) != 0) {
            d = courseSportShareBean.kcal;
        }
        if ((i3 & 64) != 0) {
            num = courseSportShareBean.heartRate;
        }
        if ((i3 & 128) != 0) {
            str4 = courseSportShareBean.shareImg;
        }
        if ((i3 & 256) != 0) {
            l = courseSportShareBean.actionTime;
        }
        Long l2 = l;
        Integer num2 = num;
        double d2 = d;
        int i4 = i;
        int i5 = i2;
        String str5 = str3;
        return courseSportShareBean.copy(str, str2, str5, i4, i5, d2, num2, str4, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getActionCount() {
        return this.actionCount;
    }

    /* renamed from: component6, reason: from getter */
    public final double getKcal() {
        return this.kcal;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getShareImg() {
        return this.shareImg;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getActionTime() {
        return this.actionTime;
    }

    public final CourseSportShareBean copy(String videoUrl, String tip, String actionName, int actionType, int actionCount, double kcal, Integer heartRate, String shareImg, Long actionTime) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(tip, "tip");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        return new CourseSportShareBean(videoUrl, tip, actionName, actionType, actionCount, kcal, heartRate, shareImg, actionTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseSportShareBean)) {
            return false;
        }
        CourseSportShareBean courseSportShareBean = (CourseSportShareBean) other;
        return Intrinsics.areEqual(this.videoUrl, courseSportShareBean.videoUrl) && Intrinsics.areEqual(this.tip, courseSportShareBean.tip) && Intrinsics.areEqual(this.actionName, courseSportShareBean.actionName) && this.actionType == courseSportShareBean.actionType && this.actionCount == courseSportShareBean.actionCount && Double.compare(this.kcal, courseSportShareBean.kcal) == 0 && Intrinsics.areEqual(this.heartRate, courseSportShareBean.heartRate) && Intrinsics.areEqual(this.shareImg, courseSportShareBean.shareImg) && Intrinsics.areEqual(this.actionTime, courseSportShareBean.actionTime);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.videoUrl.hashCode() * 31) + this.tip.hashCode()) * 31) + this.actionName.hashCode()) * 31) + Integer.hashCode(this.actionType)) * 31) + Integer.hashCode(this.actionCount)) * 31) + Double.hashCode(this.kcal)) * 31;
        Integer num = this.heartRate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.shareImg;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.actionTime;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "CourseSportShareBean(videoUrl=" + this.videoUrl + ", tip=" + this.tip + ", actionName=" + this.actionName + ", actionType=" + this.actionType + ", actionCount=" + this.actionCount + ", kcal=" + this.kcal + ", heartRate=" + this.heartRate + ", shareImg=" + this.shareImg + ", actionTime=" + this.actionTime + Separators.RPAREN;
    }

    public CourseSportShareBean(String videoUrl, String tip, String actionName, int i, int i2, double d, Integer num, String str, Long l) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(tip, "tip");
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.videoUrl = videoUrl;
        this.tip = tip;
        this.actionName = actionName;
        this.actionType = i;
        this.actionCount = i2;
        this.kcal = d;
        this.heartRate = num;
        this.shareImg = str;
        this.actionTime = l;
    }

    public /* synthetic */ CourseSportShareBean(String str, String str2, String str3, int i, int i2, double d, Integer num, String str4, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, i2, d, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : l);
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getTip() {
        return this.tip;
    }

    public final String getActionName() {
        return this.actionName;
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final int getActionCount() {
        return this.actionCount;
    }

    public final double getKcal() {
        return this.kcal;
    }

    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final String getShareImg() {
        return this.shareImg;
    }

    public final Long getActionTime() {
        return this.actionTime;
    }
}
