package com.wakeup.common.network.entity.qibla;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/SceneContentBean;", "", "ayaId", "", "aya", "", "content", "favorite", "pageAlign", "<init>", "(ILjava/lang/String;Ljava/lang/String;II)V", "getAyaId", "()I", "getAya", "()Ljava/lang/String;", "getContent", "setContent", "(Ljava/lang/String;)V", "getFavorite", "setFavorite", "(I)V", "getPageAlign", "setPageAlign", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SceneContentBean {
    private final String aya;
    private final int ayaId;
    private String content;
    private int favorite;
    private int pageAlign;

    public SceneContentBean(int i, String aya, String content, int i2, int i3) {
        Intrinsics.checkNotNullParameter(aya, "aya");
        Intrinsics.checkNotNullParameter(content, "content");
        this.ayaId = i;
        this.aya = aya;
        this.content = content;
        this.favorite = i2;
        this.pageAlign = i3;
    }

    public /* synthetic */ SceneContentBean(int i, String str, String str2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }

    public final String getAya() {
        return this.aya;
    }

    public final int getAyaId() {
        return this.ayaId;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    public final int getPageAlign() {
        return this.pageAlign;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setFavorite(int i) {
        this.favorite = i;
    }

    public final void setPageAlign(int i) {
        this.pageAlign = i;
    }
}
