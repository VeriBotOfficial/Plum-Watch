package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesAlbumBean.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/glasses/bean/TagItemBean;", "", "text", "", "isSelect", "", "position", "", "<init>", "(Ljava/lang/String;ZI)V", "getText", "()Ljava/lang/String;", "()Z", "setSelect", "(Z)V", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagItemBean {
    private boolean isSelect;
    private final int position;
    private final String text;

    public static /* synthetic */ TagItemBean copy$default(TagItemBean tagItemBean, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tagItemBean.text;
        }
        if ((i2 & 2) != 0) {
            z = tagItemBean.isSelect;
        }
        if ((i2 & 4) != 0) {
            i = tagItemBean.position;
        }
        return tagItemBean.copy(str, z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final TagItemBean copy(String text, boolean isSelect, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TagItemBean(text, isSelect, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagItemBean)) {
            return false;
        }
        TagItemBean tagItemBean = (TagItemBean) other;
        return Intrinsics.areEqual(this.text, tagItemBean.text) && this.isSelect == tagItemBean.isSelect && this.position == tagItemBean.position;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Boolean.hashCode(this.isSelect)) * 31) + Integer.hashCode(this.position);
    }

    public String toString() {
        return "TagItemBean(text=" + this.text + ", isSelect=" + this.isSelect + ", position=" + this.position + Separators.RPAREN;
    }

    public TagItemBean(String text, boolean z, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isSelect = z;
        this.position = i;
    }

    public /* synthetic */ TagItemBean(String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, i);
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final int getPosition() {
        return this.position;
    }
}
