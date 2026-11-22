package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesFilmBean.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesFilmBean;", "Ljava/io/Serializable;", "fileBeans", "", "Lcom/wakeup/module/glasses/bean/GlassesFilmFileBean;", "<init>", "(Ljava/util/List;)V", "getFileBeans", "()Ljava/util/List;", "savePath", "", "getSavePath", "()Ljava/lang/String;", "setSavePath", "(Ljava/lang/String;)V", "topic", "Lcom/wakeup/module/glasses/bean/GlassesFilmTopicBean;", "getTopic", "()Lcom/wakeup/module/glasses/bean/GlassesFilmTopicBean;", "setTopic", "(Lcom/wakeup/module/glasses/bean/GlassesFilmTopicBean;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesFilmBean implements Serializable {
    private final List<GlassesFilmFileBean> fileBeans;
    private String savePath;
    private GlassesFilmTopicBean topic;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlassesFilmBean copy$default(GlassesFilmBean glassesFilmBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = glassesFilmBean.fileBeans;
        }
        return glassesFilmBean.copy(list);
    }

    public final List<GlassesFilmFileBean> component1() {
        return this.fileBeans;
    }

    public final GlassesFilmBean copy(List<GlassesFilmFileBean> fileBeans) {
        Intrinsics.checkNotNullParameter(fileBeans, "fileBeans");
        return new GlassesFilmBean(fileBeans);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlassesFilmBean) && Intrinsics.areEqual(this.fileBeans, ((GlassesFilmBean) other).fileBeans);
    }

    public int hashCode() {
        return this.fileBeans.hashCode();
    }

    public String toString() {
        return "GlassesFilmBean(fileBeans=" + this.fileBeans + Separators.RPAREN;
    }

    public GlassesFilmBean(List<GlassesFilmFileBean> fileBeans) {
        Intrinsics.checkNotNullParameter(fileBeans, "fileBeans");
        this.fileBeans = fileBeans;
        this.savePath = "";
        this.topic = new GlassesFilmTopicBean(GlassesFilmTopicBean.TOPIC_WX);
    }

    public final List<GlassesFilmFileBean> getFileBeans() {
        return this.fileBeans;
    }

    public final String getSavePath() {
        return this.savePath;
    }

    public final void setSavePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.savePath = str;
    }

    public final GlassesFilmTopicBean getTopic() {
        return this.topic;
    }

    public final void setTopic(GlassesFilmTopicBean glassesFilmTopicBean) {
        Intrinsics.checkNotNullParameter(glassesFilmTopicBean, "<set-?>");
        this.topic = glassesFilmTopicBean;
    }
}
