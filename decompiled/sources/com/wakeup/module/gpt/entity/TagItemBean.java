package com.wakeup.module.gpt.entity;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TagItemBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/gpt/entity/TagItemBean;", "", "text", "", "isSelect", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "()Z", "setSelect", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TagItemBean {
    private boolean isSelect;
    private final String text;

    public static /* synthetic */ TagItemBean copy$default(TagItemBean tagItemBean, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagItemBean.text;
        }
        if ((i & 2) != 0) {
            z = tagItemBean.isSelect;
        }
        return tagItemBean.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final TagItemBean copy(String text, boolean isSelect) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TagItemBean(text, isSelect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagItemBean)) {
            return false;
        }
        TagItemBean tagItemBean = (TagItemBean) other;
        return Intrinsics.areEqual(this.text, tagItemBean.text) && this.isSelect == tagItemBean.isSelect;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + Boolean.hashCode(this.isSelect);
    }

    public String toString() {
        return "TagItemBean(text=" + this.text + ", isSelect=" + this.isSelect + Separators.RPAREN;
    }

    public TagItemBean(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isSelect = z;
    }

    public /* synthetic */ TagItemBean(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
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
}
