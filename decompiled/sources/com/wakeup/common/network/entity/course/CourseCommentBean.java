package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CourseCommentBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jj\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0018\"\u0004\b\u001b\u0010\u001a¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseCommentBean;", "", "id", "", "avatar", "", "nickname", "commentDate", "userId", "content", "likeNum", "isLike", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvatar", "()Ljava/lang/String;", "getNickname", "getCommentDate", "getUserId", "getContent", "getLikeNum", "()I", "setLikeNum", "(I)V", "setLike", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/wakeup/common/network/entity/course/CourseCommentBean;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CourseCommentBean {
    private final String avatar;
    private final String commentDate;
    private final String content;
    private final Integer id;
    private int isLike;
    private int likeNum;
    private final String nickname;
    private final String userId;

    public CourseCommentBean() {
        this(null, null, null, null, null, null, 0, 0, 255, null);
    }

    public static /* synthetic */ CourseCommentBean copy$default(CourseCommentBean courseCommentBean, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = courseCommentBean.id;
        }
        if ((i3 & 2) != 0) {
            str = courseCommentBean.avatar;
        }
        if ((i3 & 4) != 0) {
            str2 = courseCommentBean.nickname;
        }
        if ((i3 & 8) != 0) {
            str3 = courseCommentBean.commentDate;
        }
        if ((i3 & 16) != 0) {
            str4 = courseCommentBean.userId;
        }
        if ((i3 & 32) != 0) {
            str5 = courseCommentBean.content;
        }
        if ((i3 & 64) != 0) {
            i = courseCommentBean.likeNum;
        }
        if ((i3 & 128) != 0) {
            i2 = courseCommentBean.isLike;
        }
        int i4 = i;
        int i5 = i2;
        String str6 = str4;
        String str7 = str5;
        return courseCommentBean.copy(num, str, str2, str3, str6, str7, i4, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCommentDate() {
        return this.commentDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLikeNum() {
        return this.likeNum;
    }

    /* renamed from: component8, reason: from getter */
    public final int getIsLike() {
        return this.isLike;
    }

    public final CourseCommentBean copy(Integer id2, String avatar, String nickname, String commentDate, String userId, String content, int likeNum, int isLike) {
        return new CourseCommentBean(id2, avatar, nickname, commentDate, userId, content, likeNum, isLike);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseCommentBean)) {
            return false;
        }
        CourseCommentBean courseCommentBean = (CourseCommentBean) other;
        return Intrinsics.areEqual(this.id, courseCommentBean.id) && Intrinsics.areEqual(this.avatar, courseCommentBean.avatar) && Intrinsics.areEqual(this.nickname, courseCommentBean.nickname) && Intrinsics.areEqual(this.commentDate, courseCommentBean.commentDate) && Intrinsics.areEqual(this.userId, courseCommentBean.userId) && Intrinsics.areEqual(this.content, courseCommentBean.content) && this.likeNum == courseCommentBean.likeNum && this.isLike == courseCommentBean.isLike;
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.avatar;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commentDate;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        return ((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.likeNum)) * 31) + Integer.hashCode(this.isLike);
    }

    public String toString() {
        return "CourseCommentBean(id=" + this.id + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", commentDate=" + this.commentDate + ", userId=" + this.userId + ", content=" + this.content + ", likeNum=" + this.likeNum + ", isLike=" + this.isLike + Separators.RPAREN;
    }

    public CourseCommentBean(Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.id = num;
        this.avatar = str;
        this.nickname = str2;
        this.commentDate = str3;
        this.userId = str4;
        this.content = str5;
        this.likeNum = i;
        this.isLike = i2;
    }

    public /* synthetic */ CourseCommentBean(Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getCommentDate() {
        return this.commentDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getLikeNum() {
        return this.likeNum;
    }

    public final void setLikeNum(int i) {
        this.likeNum = i;
    }

    public final int isLike() {
        return this.isLike;
    }

    public final void setLike(int i) {
        this.isLike = i;
    }
}
