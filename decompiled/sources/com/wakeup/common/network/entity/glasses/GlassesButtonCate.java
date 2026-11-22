package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyConfigV2.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesButtonCate;", "", "buttonKey", "", "buttonName", "button", "", "Lcom/wakeup/common/network/entity/glasses/GlassesOperationItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtonKey", "()Ljava/lang/String;", "getButtonName", "getButton", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesButtonCate {
    private final List<GlassesOperationItem> button;
    private final String buttonKey;
    private final String buttonName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlassesButtonCate copy$default(GlassesButtonCate glassesButtonCate, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesButtonCate.buttonKey;
        }
        if ((i & 2) != 0) {
            str2 = glassesButtonCate.buttonName;
        }
        if ((i & 4) != 0) {
            list = glassesButtonCate.button;
        }
        return glassesButtonCate.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getButtonKey() {
        return this.buttonKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    public final List<GlassesOperationItem> component3() {
        return this.button;
    }

    public final GlassesButtonCate copy(String buttonKey, String buttonName, List<GlassesOperationItem> button) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new GlassesButtonCate(buttonKey, buttonName, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesButtonCate)) {
            return false;
        }
        GlassesButtonCate glassesButtonCate = (GlassesButtonCate) other;
        return Intrinsics.areEqual(this.buttonKey, glassesButtonCate.buttonKey) && Intrinsics.areEqual(this.buttonName, glassesButtonCate.buttonName) && Intrinsics.areEqual(this.button, glassesButtonCate.button);
    }

    public int hashCode() {
        String str = this.buttonKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonName;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.button.hashCode();
    }

    public String toString() {
        return "GlassesButtonCate(buttonKey=" + this.buttonKey + ", buttonName=" + this.buttonName + ", button=" + this.button + Separators.RPAREN;
    }

    public GlassesButtonCate(String str, String str2, List<GlassesOperationItem> button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.buttonKey = str;
        this.buttonName = str2;
        this.button = button;
    }

    public final String getButtonKey() {
        return this.buttonKey;
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    public /* synthetic */ GlassesButtonCate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<GlassesOperationItem> getButton() {
        return this.button;
    }
}
