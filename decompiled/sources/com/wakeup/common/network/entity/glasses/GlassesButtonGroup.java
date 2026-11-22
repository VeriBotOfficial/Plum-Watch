package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyConfigV2.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesButtonGroup;", "", "buttonType", "", "buttonDefineImg", "buttonCate", "", "Lcom/wakeup/common/network/entity/glasses/GlassesButtonCate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtonType", "()Ljava/lang/String;", "getButtonDefineImg", "getButtonCate", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesButtonGroup {
    private final List<GlassesButtonCate> buttonCate;
    private final String buttonDefineImg;
    private final String buttonType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlassesButtonGroup copy$default(GlassesButtonGroup glassesButtonGroup, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesButtonGroup.buttonType;
        }
        if ((i & 2) != 0) {
            str2 = glassesButtonGroup.buttonDefineImg;
        }
        if ((i & 4) != 0) {
            list = glassesButtonGroup.buttonCate;
        }
        return glassesButtonGroup.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getButtonType() {
        return this.buttonType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonDefineImg() {
        return this.buttonDefineImg;
    }

    public final List<GlassesButtonCate> component3() {
        return this.buttonCate;
    }

    public final GlassesButtonGroup copy(String buttonType, String buttonDefineImg, List<GlassesButtonCate> buttonCate) {
        Intrinsics.checkNotNullParameter(buttonCate, "buttonCate");
        return new GlassesButtonGroup(buttonType, buttonDefineImg, buttonCate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesButtonGroup)) {
            return false;
        }
        GlassesButtonGroup glassesButtonGroup = (GlassesButtonGroup) other;
        return Intrinsics.areEqual(this.buttonType, glassesButtonGroup.buttonType) && Intrinsics.areEqual(this.buttonDefineImg, glassesButtonGroup.buttonDefineImg) && Intrinsics.areEqual(this.buttonCate, glassesButtonGroup.buttonCate);
    }

    public int hashCode() {
        String str = this.buttonType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonDefineImg;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.buttonCate.hashCode();
    }

    public String toString() {
        return "GlassesButtonGroup(buttonType=" + this.buttonType + ", buttonDefineImg=" + this.buttonDefineImg + ", buttonCate=" + this.buttonCate + Separators.RPAREN;
    }

    public GlassesButtonGroup(String str, String str2, List<GlassesButtonCate> buttonCate) {
        Intrinsics.checkNotNullParameter(buttonCate, "buttonCate");
        this.buttonType = str;
        this.buttonDefineImg = str2;
        this.buttonCate = buttonCate;
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final String getButtonDefineImg() {
        return this.buttonDefineImg;
    }

    public /* synthetic */ GlassesButtonGroup(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<GlassesButtonCate> getButtonCate() {
        return this.buttonCate;
    }
}
