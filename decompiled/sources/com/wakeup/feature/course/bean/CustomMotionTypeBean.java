package com.wakeup.feature.course.bean;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomMotionTypeBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/wakeup/feature/course/bean/CustomMotionTypeBean;", "", "id", "", "title", "", "check", "", "<init>", "(ILjava/lang/String;Z)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getCheck", "()Z", "setCheck", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomMotionTypeBean {
    private boolean check;
    private int id;
    private String title;

    public CustomMotionTypeBean() {
        this(0, null, false, 7, null);
    }

    public static /* synthetic */ CustomMotionTypeBean copy$default(CustomMotionTypeBean customMotionTypeBean, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customMotionTypeBean.id;
        }
        if ((i2 & 2) != 0) {
            str = customMotionTypeBean.title;
        }
        if ((i2 & 4) != 0) {
            z = customMotionTypeBean.check;
        }
        return customMotionTypeBean.copy(i, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCheck() {
        return this.check;
    }

    public final CustomMotionTypeBean copy(int id2, String title, boolean check) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CustomMotionTypeBean(id2, title, check);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomMotionTypeBean)) {
            return false;
        }
        CustomMotionTypeBean customMotionTypeBean = (CustomMotionTypeBean) other;
        return this.id == customMotionTypeBean.id && Intrinsics.areEqual(this.title, customMotionTypeBean.title) && this.check == customMotionTypeBean.check;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.check);
    }

    public String toString() {
        return "CustomMotionTypeBean(id=" + this.id + ", title=" + this.title + ", check=" + this.check + Separators.RPAREN;
    }

    public CustomMotionTypeBean(int i, String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i;
        this.title = title;
        this.check = z;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public /* synthetic */ CustomMotionTypeBean(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z);
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final boolean getCheck() {
        return this.check;
    }

    public final void setCheck(boolean z) {
        this.check = z;
    }
}
