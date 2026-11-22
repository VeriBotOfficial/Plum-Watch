package com.wakeup.common.network.entity.qibla;

import com.alipay.sdk.m.c0.d;
import com.arthenica.ffmpegkit.MediaInformationJsonParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/PraySceneBean;", "", "tag", "", "cover", "title", "", MediaInformationJsonParser.KEY_CHAPTERS, "", "Lcom/wakeup/common/network/entity/qibla/PraySceneSuraBean;", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "getTag", "()I", "getCover", "setCover", "(I)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getChapters", "()Ljava/util/List;", "setChapters", "(Ljava/util/List;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PraySceneBean {
    private List<PraySceneSuraBean> chapters;
    private int cover;
    private final int tag;
    private String title;

    public PraySceneBean(int i, int i2, String title, List<PraySceneSuraBean> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.tag = i;
        this.cover = i2;
        this.title = title;
        this.chapters = list;
    }

    public /* synthetic */ PraySceneBean(int i, int i2, String str, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? null : list);
    }

    public final int getTag() {
        return this.tag;
    }

    public final int getCover() {
        return this.cover;
    }

    public final void setCover(int i) {
        this.cover = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final List<PraySceneSuraBean> getChapters() {
        return this.chapters;
    }

    public final void setChapters(List<PraySceneSuraBean> list) {
        this.chapters = list;
    }
}
