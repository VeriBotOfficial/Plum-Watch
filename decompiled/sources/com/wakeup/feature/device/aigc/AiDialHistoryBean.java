package com.wakeup.feature.device.aigc;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiDialHistoryBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/feature/device/aigc/AiDialHistoryBean;", "Ljava/io/Serializable;", "style", "", "icon", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "getIcon", "getName", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AiDialHistoryBean implements Serializable {
    private final String icon;
    private final String name;
    private boolean select;
    private final String style;

    public static /* synthetic */ AiDialHistoryBean copy$default(AiDialHistoryBean aiDialHistoryBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiDialHistoryBean.style;
        }
        if ((i & 2) != 0) {
            str2 = aiDialHistoryBean.icon;
        }
        if ((i & 4) != 0) {
            str3 = aiDialHistoryBean.name;
        }
        return aiDialHistoryBean.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AiDialHistoryBean copy(String style, String icon, String name) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        return new AiDialHistoryBean(style, icon, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiDialHistoryBean)) {
            return false;
        }
        AiDialHistoryBean aiDialHistoryBean = (AiDialHistoryBean) other;
        return Intrinsics.areEqual(this.style, aiDialHistoryBean.style) && Intrinsics.areEqual(this.icon, aiDialHistoryBean.icon) && Intrinsics.areEqual(this.name, aiDialHistoryBean.name);
    }

    public int hashCode() {
        return (((this.style.hashCode() * 31) + this.icon.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "AiDialHistoryBean(style=" + this.style + ", icon=" + this.icon + ", name=" + this.name + Separators.RPAREN;
    }

    public AiDialHistoryBean(String style, String icon, String name) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        this.style = style;
        this.icon = icon;
        this.name = name;
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

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
