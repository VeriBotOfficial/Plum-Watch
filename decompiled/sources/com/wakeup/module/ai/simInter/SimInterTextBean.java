package com.wakeup.module.ai.simInter;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimInterTextBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/ai/simInter/SimInterTextBean;", "", "position", "", "data", "", "translate", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getPosition", "()I", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getTranslate", "setTranslate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SimInterTextBean {
    private String data;
    private final int position;
    private String translate;

    public SimInterTextBean() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ SimInterTextBean copy$default(SimInterTextBean simInterTextBean, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simInterTextBean.position;
        }
        if ((i2 & 2) != 0) {
            str = simInterTextBean.data;
        }
        if ((i2 & 4) != 0) {
            str2 = simInterTextBean.translate;
        }
        return simInterTextBean.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTranslate() {
        return this.translate;
    }

    public final SimInterTextBean copy(int position, String data, String translate) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(translate, "translate");
        return new SimInterTextBean(position, data, translate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimInterTextBean)) {
            return false;
        }
        SimInterTextBean simInterTextBean = (SimInterTextBean) other;
        return this.position == simInterTextBean.position && Intrinsics.areEqual(this.data, simInterTextBean.data) && Intrinsics.areEqual(this.translate, simInterTextBean.translate);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.position) * 31) + this.data.hashCode()) * 31) + this.translate.hashCode();
    }

    public String toString() {
        return "SimInterTextBean(position=" + this.position + ", data=" + this.data + ", translate=" + this.translate + Separators.RPAREN;
    }

    public SimInterTextBean(int i, String data, String translate) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(translate, "translate");
        this.position = i;
        this.data = data;
        this.translate = translate;
    }

    public /* synthetic */ SimInterTextBean(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final String getTranslate() {
        return this.translate;
    }

    public final void setTranslate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.translate = str;
    }
}
