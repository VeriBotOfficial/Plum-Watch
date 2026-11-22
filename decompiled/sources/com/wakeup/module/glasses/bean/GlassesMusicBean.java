package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesMusicBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesMusicBean;", "", "fileName", "", "<init>", "(Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "isSelected", "", "()Z", "setSelected", "(Z)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesMusicBean {
    private final String fileName;
    private boolean isSelected;

    public static /* synthetic */ GlassesMusicBean copy$default(GlassesMusicBean glassesMusicBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesMusicBean.fileName;
        }
        return glassesMusicBean.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final GlassesMusicBean copy(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new GlassesMusicBean(fileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GlassesMusicBean) && Intrinsics.areEqual(this.fileName, ((GlassesMusicBean) other).fileName);
    }

    public int hashCode() {
        return this.fileName.hashCode();
    }

    public String toString() {
        return "GlassesMusicBean(fileName=" + this.fileName + Separators.RPAREN;
    }

    public GlassesMusicBean(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
