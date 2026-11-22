package com.wakeup.common.network.entity.aigc;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiDialBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/aigc/AiDialBean;", "", "id", "", "style", "", "icon", "name", "keyword", "select", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getStyle", "()Ljava/lang/String;", "getIcon", "getName", "getKeyword", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiDialBean {
    private final String icon;
    private final int id;
    private final String keyword;
    private final String name;
    private boolean select;
    private final String style;

    public static /* synthetic */ AiDialBean copy$default(AiDialBean aiDialBean, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aiDialBean.id;
        }
        if ((i2 & 2) != 0) {
            str = aiDialBean.style;
        }
        if ((i2 & 4) != 0) {
            str2 = aiDialBean.icon;
        }
        if ((i2 & 8) != 0) {
            str3 = aiDialBean.name;
        }
        if ((i2 & 16) != 0) {
            str4 = aiDialBean.keyword;
        }
        if ((i2 & 32) != 0) {
            z = aiDialBean.select;
        }
        String str5 = str4;
        boolean z2 = z;
        return aiDialBean.copy(i, str, str2, str3, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    public final AiDialBean copy(int id2, String style, String icon, String name, String keyword, boolean select) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        return new AiDialBean(id2, style, icon, name, keyword, select);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiDialBean)) {
            return false;
        }
        AiDialBean aiDialBean = (AiDialBean) other;
        return this.id == aiDialBean.id && Intrinsics.areEqual(this.style, aiDialBean.style) && Intrinsics.areEqual(this.icon, aiDialBean.icon) && Intrinsics.areEqual(this.name, aiDialBean.name) && Intrinsics.areEqual(this.keyword, aiDialBean.keyword) && this.select == aiDialBean.select;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.id) * 31) + this.style.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.keyword;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.select);
    }

    public String toString() {
        return "AiDialBean(id=" + this.id + ", style=" + this.style + ", icon=" + this.icon + ", name=" + this.name + ", keyword=" + this.keyword + ", select=" + this.select + Separators.RPAREN;
    }

    public AiDialBean(int i, String style, String icon, String name, String str, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.style = style;
        this.icon = icon;
        this.name = name;
        this.keyword = str;
        this.select = z;
    }

    public /* synthetic */ AiDialBean(int i, String str, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, (i2 & 32) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
