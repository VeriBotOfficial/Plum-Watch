package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CourseMainSection.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bN\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B÷\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010;\u001a\u00020\u0004HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003Jù\u0001\u0010S\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0004HÆ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\u0004HÖ\u0001J\t\u0010Y\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010 R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010 R\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010:¨\u0006Z"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseMainSection;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "sectionName", "", "id", "name", "outsideImg", Constants.BundleKey.GRADE, Constants.BundleKey.KCAL, "min", "showEffect", "commentNum", "likeNum", "shareNum", "num", "courseType", "isVip", "isFree", "isNew", "interiorImg", "recommendImg", "shareImg", "planImg", "hitImg", "suggestImg", "sourceType", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getType", "()I", "getSectionName", "()Ljava/lang/String;", "getId", "getName", "getOutsideImg", "getGrade", "getKcal", "getMin", "getShowEffect", "getCommentNum", "getLikeNum", "getShareNum", "getNum", "getCourseType", "getInteriorImg", "getRecommendImg", "getShareImg", "getPlanImg", "getHitImg", "getSuggestImg", "getSourceType", "itemType", "getItemType", "isRunCourse", "setRunCourse", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CourseMainSection implements Serializable, MultiItemEntity {
    private final int commentNum;
    private final int courseType;
    private final int grade;
    private final String hitImg;
    private final int id;
    private final String interiorImg;
    private final int isFree;
    private final int isNew;
    private int isRunCourse;
    private final int isVip;
    private final int kcal;
    private final int likeNum;
    private final int min;
    private final String name;
    private final int num;
    private final String outsideImg;
    private final String planImg;
    private final String recommendImg;
    private final String sectionName;
    private final String shareImg;
    private final int shareNum;
    private final int showEffect;
    private final int sourceType;
    private final String suggestImg;
    private final int type;

    public CourseMainSection() {
        this(0, null, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, 0, 16777215, null);
    }

    public static /* synthetic */ CourseMainSection copy$default(CourseMainSection courseMainSection, int i, String str, int i2, String str2, String str3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str4, String str5, String str6, String str7, String str8, String str9, int i15, int i16, Object obj) {
        int i17;
        String str10;
        int i18 = (i16 & 1) != 0 ? courseMainSection.type : i;
        String str11 = (i16 & 2) != 0 ? courseMainSection.sectionName : str;
        int i19 = (i16 & 4) != 0 ? courseMainSection.id : i2;
        String str12 = (i16 & 8) != 0 ? courseMainSection.name : str2;
        String str13 = (i16 & 16) != 0 ? courseMainSection.outsideImg : str3;
        int i20 = (i16 & 32) != 0 ? courseMainSection.grade : i3;
        int i21 = (i16 & 64) != 0 ? courseMainSection.kcal : i4;
        int i22 = (i16 & 128) != 0 ? courseMainSection.min : i5;
        int i23 = (i16 & 256) != 0 ? courseMainSection.showEffect : i6;
        int i24 = (i16 & 512) != 0 ? courseMainSection.commentNum : i7;
        int i25 = (i16 & 1024) != 0 ? courseMainSection.likeNum : i8;
        int i26 = (i16 & 2048) != 0 ? courseMainSection.shareNum : i9;
        int i27 = (i16 & 4096) != 0 ? courseMainSection.num : i10;
        int i28 = (i16 & 8192) != 0 ? courseMainSection.courseType : i11;
        int i29 = i18;
        int i30 = (i16 & 16384) != 0 ? courseMainSection.isVip : i12;
        int i31 = (i16 & 32768) != 0 ? courseMainSection.isFree : i13;
        int i32 = (i16 & 65536) != 0 ? courseMainSection.isNew : i14;
        String str14 = (i16 & 131072) != 0 ? courseMainSection.interiorImg : str4;
        String str15 = (i16 & 262144) != 0 ? courseMainSection.recommendImg : str5;
        String str16 = (i16 & 524288) != 0 ? courseMainSection.shareImg : str6;
        String str17 = (i16 & 1048576) != 0 ? courseMainSection.planImg : str7;
        String str18 = (i16 & 2097152) != 0 ? courseMainSection.hitImg : str8;
        String str19 = (i16 & 4194304) != 0 ? courseMainSection.suggestImg : str9;
        if ((i16 & 8388608) != 0) {
            str10 = str19;
            i17 = courseMainSection.sourceType;
        } else {
            i17 = i15;
            str10 = str19;
        }
        return courseMainSection.copy(i29, str11, i19, str12, str13, i20, i21, i22, i23, i24, i25, i26, i27, i28, i30, i31, i32, str14, str15, str16, str17, str18, str10, i17);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCommentNum() {
        return this.commentNum;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLikeNum() {
        return this.likeNum;
    }

    /* renamed from: component12, reason: from getter */
    public final int getShareNum() {
        return this.shareNum;
    }

    /* renamed from: component13, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* renamed from: component14, reason: from getter */
    public final int getCourseType() {
        return this.courseType;
    }

    /* renamed from: component15, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    /* renamed from: component16, reason: from getter */
    public final int getIsFree() {
        return this.isFree;
    }

    /* renamed from: component17, reason: from getter */
    public final int getIsNew() {
        return this.isNew;
    }

    /* renamed from: component18, reason: from getter */
    public final String getInteriorImg() {
        return this.interiorImg;
    }

    /* renamed from: component19, reason: from getter */
    public final String getRecommendImg() {
        return this.recommendImg;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getShareImg() {
        return this.shareImg;
    }

    /* renamed from: component21, reason: from getter */
    public final String getPlanImg() {
        return this.planImg;
    }

    /* renamed from: component22, reason: from getter */
    public final String getHitImg() {
        return this.hitImg;
    }

    /* renamed from: component23, reason: from getter */
    public final String getSuggestImg() {
        return this.suggestImg;
    }

    /* renamed from: component24, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOutsideImg() {
        return this.outsideImg;
    }

    /* renamed from: component6, reason: from getter */
    public final int getGrade() {
        return this.grade;
    }

    /* renamed from: component7, reason: from getter */
    public final int getKcal() {
        return this.kcal;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component9, reason: from getter */
    public final int getShowEffect() {
        return this.showEffect;
    }

    public final CourseMainSection copy(int type, String sectionName, int id2, String name, String outsideImg, int grade, int kcal, int min, int showEffect, int commentNum, int likeNum, int shareNum, int num, int courseType, int isVip, int isFree, int isNew, String interiorImg, String recommendImg, String shareImg, String planImg, String hitImg, String suggestImg, int sourceType) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outsideImg, "outsideImg");
        Intrinsics.checkNotNullParameter(interiorImg, "interiorImg");
        Intrinsics.checkNotNullParameter(recommendImg, "recommendImg");
        Intrinsics.checkNotNullParameter(shareImg, "shareImg");
        Intrinsics.checkNotNullParameter(planImg, "planImg");
        Intrinsics.checkNotNullParameter(hitImg, "hitImg");
        Intrinsics.checkNotNullParameter(suggestImg, "suggestImg");
        return new CourseMainSection(type, sectionName, id2, name, outsideImg, grade, kcal, min, showEffect, commentNum, likeNum, shareNum, num, courseType, isVip, isFree, isNew, interiorImg, recommendImg, shareImg, planImg, hitImg, suggestImg, sourceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseMainSection)) {
            return false;
        }
        CourseMainSection courseMainSection = (CourseMainSection) other;
        return this.type == courseMainSection.type && Intrinsics.areEqual(this.sectionName, courseMainSection.sectionName) && this.id == courseMainSection.id && Intrinsics.areEqual(this.name, courseMainSection.name) && Intrinsics.areEqual(this.outsideImg, courseMainSection.outsideImg) && this.grade == courseMainSection.grade && this.kcal == courseMainSection.kcal && this.min == courseMainSection.min && this.showEffect == courseMainSection.showEffect && this.commentNum == courseMainSection.commentNum && this.likeNum == courseMainSection.likeNum && this.shareNum == courseMainSection.shareNum && this.num == courseMainSection.num && this.courseType == courseMainSection.courseType && this.isVip == courseMainSection.isVip && this.isFree == courseMainSection.isFree && this.isNew == courseMainSection.isNew && Intrinsics.areEqual(this.interiorImg, courseMainSection.interiorImg) && Intrinsics.areEqual(this.recommendImg, courseMainSection.recommendImg) && Intrinsics.areEqual(this.shareImg, courseMainSection.shareImg) && Intrinsics.areEqual(this.planImg, courseMainSection.planImg) && Intrinsics.areEqual(this.hitImg, courseMainSection.hitImg) && Intrinsics.areEqual(this.suggestImg, courseMainSection.suggestImg) && this.sourceType == courseMainSection.sourceType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.type) * 31) + this.sectionName.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.outsideImg.hashCode()) * 31) + Integer.hashCode(this.grade)) * 31) + Integer.hashCode(this.kcal)) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.showEffect)) * 31) + Integer.hashCode(this.commentNum)) * 31) + Integer.hashCode(this.likeNum)) * 31) + Integer.hashCode(this.shareNum)) * 31) + Integer.hashCode(this.num)) * 31) + Integer.hashCode(this.courseType)) * 31) + Integer.hashCode(this.isVip)) * 31) + Integer.hashCode(this.isFree)) * 31) + Integer.hashCode(this.isNew)) * 31) + this.interiorImg.hashCode()) * 31) + this.recommendImg.hashCode()) * 31) + this.shareImg.hashCode()) * 31) + this.planImg.hashCode()) * 31) + this.hitImg.hashCode()) * 31) + this.suggestImg.hashCode()) * 31) + Integer.hashCode(this.sourceType);
    }

    public String toString() {
        return "CourseMainSection(type=" + this.type + ", sectionName=" + this.sectionName + ", id=" + this.id + ", name=" + this.name + ", outsideImg=" + this.outsideImg + ", grade=" + this.grade + ", kcal=" + this.kcal + ", min=" + this.min + ", showEffect=" + this.showEffect + ", commentNum=" + this.commentNum + ", likeNum=" + this.likeNum + ", shareNum=" + this.shareNum + ", num=" + this.num + ", courseType=" + this.courseType + ", isVip=" + this.isVip + ", isFree=" + this.isFree + ", isNew=" + this.isNew + ", interiorImg=" + this.interiorImg + ", recommendImg=" + this.recommendImg + ", shareImg=" + this.shareImg + ", planImg=" + this.planImg + ", hitImg=" + this.hitImg + ", suggestImg=" + this.suggestImg + ", sourceType=" + this.sourceType + Separators.RPAREN;
    }

    public CourseMainSection(int i, String sectionName, int i2, String name, String outsideImg, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String interiorImg, String recommendImg, String shareImg, String planImg, String hitImg, String suggestImg, int i15) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outsideImg, "outsideImg");
        Intrinsics.checkNotNullParameter(interiorImg, "interiorImg");
        Intrinsics.checkNotNullParameter(recommendImg, "recommendImg");
        Intrinsics.checkNotNullParameter(shareImg, "shareImg");
        Intrinsics.checkNotNullParameter(planImg, "planImg");
        Intrinsics.checkNotNullParameter(hitImg, "hitImg");
        Intrinsics.checkNotNullParameter(suggestImg, "suggestImg");
        this.type = i;
        this.sectionName = sectionName;
        this.id = i2;
        this.name = name;
        this.outsideImg = outsideImg;
        this.grade = i3;
        this.kcal = i4;
        this.min = i5;
        this.showEffect = i6;
        this.commentNum = i7;
        this.likeNum = i8;
        this.shareNum = i9;
        this.num = i10;
        this.courseType = i11;
        this.isVip = i12;
        this.isFree = i13;
        this.isNew = i14;
        this.interiorImg = interiorImg;
        this.recommendImg = recommendImg;
        this.shareImg = shareImg;
        this.planImg = planImg;
        this.hitImg = hitImg;
        this.suggestImg = suggestImg;
        this.sourceType = i15;
    }

    public /* synthetic */ CourseMainSection(int i, String str, int i2, String str2, String str3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, String str4, String str5, String str6, String str7, String str8, String str9, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 1 : i, (i16 & 2) != 0 ? "" : str, (i16 & 4) != 0 ? 0 : i2, (i16 & 8) != 0 ? "" : str2, (i16 & 16) != 0 ? "" : str3, (i16 & 32) != 0 ? 1 : i3, (i16 & 64) != 0 ? 0 : i4, (i16 & 128) != 0 ? 0 : i5, (i16 & 256) == 0 ? i6 : 1, (i16 & 512) != 0 ? 0 : i7, (i16 & 1024) != 0 ? 0 : i8, (i16 & 2048) != 0 ? 0 : i9, (i16 & 4096) != 0 ? 0 : i10, (i16 & 8192) != 0 ? 0 : i11, (i16 & 16384) != 0 ? 0 : i12, (i16 & 32768) != 0 ? 0 : i13, (i16 & 65536) != 0 ? 0 : i14, (i16 & 131072) != 0 ? "" : str4, (i16 & 262144) != 0 ? "" : str5, (i16 & 524288) != 0 ? "" : str6, (i16 & 1048576) != 0 ? "" : str7, (i16 & 2097152) != 0 ? "" : str8, (i16 & 4194304) == 0 ? str9 : "", (i16 & 8388608) != 0 ? 0 : i15);
    }

    public final int getType() {
        return this.type;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOutsideImg() {
        return this.outsideImg;
    }

    public final int getGrade() {
        return this.grade;
    }

    public final int getKcal() {
        return this.kcal;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getShowEffect() {
        return this.showEffect;
    }

    public final int getCommentNum() {
        return this.commentNum;
    }

    public final int getLikeNum() {
        return this.likeNum;
    }

    public final int getShareNum() {
        return this.shareNum;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getCourseType() {
        return this.courseType;
    }

    public final int isVip() {
        return this.isVip;
    }

    public final int isFree() {
        return this.isFree;
    }

    public final int isNew() {
        return this.isNew;
    }

    public final String getInteriorImg() {
        return this.interiorImg;
    }

    public final String getRecommendImg() {
        return this.recommendImg;
    }

    public final String getShareImg() {
        return this.shareImg;
    }

    public final String getPlanImg() {
        return this.planImg;
    }

    public final String getHitImg() {
        return this.hitImg;
    }

    public final String getSuggestImg() {
        return this.suggestImg;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.type;
    }

    /* renamed from: isRunCourse, reason: from getter */
    public final int getIsRunCourse() {
        return this.isRunCourse;
    }

    public final void setRunCourse(int i) {
        this.isRunCourse = i;
    }
}
