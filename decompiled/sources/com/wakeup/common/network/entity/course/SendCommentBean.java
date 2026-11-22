package com.wakeup.common.network.entity.course;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendCommentBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/course/SendCommentBean;", "", "courseId", "", "content", "", "avatar", "nickname", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCourseId", "()I", "getContent", "()Ljava/lang/String;", "getAvatar", "getNickname", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SendCommentBean {
    private final String avatar;
    private final String content;
    private final int courseId;
    private final String nickname;

    public static /* synthetic */ SendCommentBean copy$default(SendCommentBean sendCommentBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sendCommentBean.courseId;
        }
        if ((i2 & 2) != 0) {
            str = sendCommentBean.content;
        }
        if ((i2 & 4) != 0) {
            str2 = sendCommentBean.avatar;
        }
        if ((i2 & 8) != 0) {
            str3 = sendCommentBean.nickname;
        }
        return sendCommentBean.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    public final SendCommentBean copy(int courseId, String content, String avatar, String nickname) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new SendCommentBean(courseId, content, avatar, nickname);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendCommentBean)) {
            return false;
        }
        SendCommentBean sendCommentBean = (SendCommentBean) other;
        return this.courseId == sendCommentBean.courseId && Intrinsics.areEqual(this.content, sendCommentBean.content) && Intrinsics.areEqual(this.avatar, sendCommentBean.avatar) && Intrinsics.areEqual(this.nickname, sendCommentBean.nickname);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.courseId) * 31) + this.content.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.nickname.hashCode();
    }

    public String toString() {
        return "SendCommentBean(courseId=" + this.courseId + ", content=" + this.content + ", avatar=" + this.avatar + ", nickname=" + this.nickname + Separators.RPAREN;
    }

    public SendCommentBean(int i, String content, String avatar, String nickname) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.courseId = i;
        this.content = content;
        this.avatar = avatar;
        this.nickname = nickname;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }
}
