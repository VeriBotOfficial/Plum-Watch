package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesFilmTopicBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesFilmTopicBean;", "Ljava/io/Serializable;", "topic", "", "<init>", "(Ljava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesFilmTopicBean implements Serializable {
    public static final String TOPIC_CW = "023";
    public static final String TOPIC_FN = "004";
    public static final String TOPIC_GJ = "024";
    public static final String TOPIC_HY = "044";
    public static final String TOPIC_JL = "013";
    public static final String TOPIC_JQ = "021";
    public static final String TOPIC_JR = "042";
    public static final String TOPIC_JY = "014";
    public static final String TOPIC_LX = "043";
    public static final String TOPIC_MS = "032";
    public static final String TOPIC_NC = "002";
    public static final String TOPIC_RA = "031";
    public static final String TOPIC_SC = "011";
    public static final String TOPIC_SH = "012";
    public static final String TOPIC_SY = "033";
    public static final String TOPIC_TD = "022";
    public static final String TOPIC_WX = "001";
    public static final String TOPIC_XW = "034";
    public static final String TOPIC_XY = "003";
    public static final String TOPIC_ZR = "041";
    private boolean isSelect;
    private final String topic;

    public static /* synthetic */ GlassesFilmTopicBean copy$default(GlassesFilmTopicBean glassesFilmTopicBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesFilmTopicBean.topic;
        }
        return glassesFilmTopicBean.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public final GlassesFilmTopicBean copy(String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return new GlassesFilmTopicBean(topic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlassesFilmTopicBean) && Intrinsics.areEqual(this.topic, ((GlassesFilmTopicBean) other).topic);
    }

    public int hashCode() {
        return this.topic.hashCode();
    }

    public String toString() {
        return "GlassesFilmTopicBean(topic=" + this.topic + Separators.RPAREN;
    }

    public GlassesFilmTopicBean(String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.topic = topic;
    }

    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
