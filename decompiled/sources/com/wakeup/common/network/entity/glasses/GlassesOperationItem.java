package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyConfigV2.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesOperationItem;", "", "buttonSide", "", "buttonKey", "buttonIntro", "buttonDefine", "featureName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonSide", "()Ljava/lang/String;", "getButtonKey", "getButtonIntro", "getButtonDefine", "getFeatureName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesOperationItem {
    private final String buttonDefine;
    private final String buttonIntro;
    private final String buttonKey;
    private final String buttonSide;
    private final String featureName;

    public static /* synthetic */ GlassesOperationItem copy$default(GlassesOperationItem glassesOperationItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesOperationItem.buttonSide;
        }
        if ((i & 2) != 0) {
            str2 = glassesOperationItem.buttonKey;
        }
        if ((i & 4) != 0) {
            str3 = glassesOperationItem.buttonIntro;
        }
        if ((i & 8) != 0) {
            str4 = glassesOperationItem.buttonDefine;
        }
        if ((i & 16) != 0) {
            str5 = glassesOperationItem.featureName;
        }
        String str6 = str5;
        String str7 = str3;
        return glassesOperationItem.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getButtonSide() {
        return this.buttonSide;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtonKey() {
        return this.buttonKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getButtonIntro() {
        return this.buttonIntro;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonDefine() {
        return this.buttonDefine;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    public final GlassesOperationItem copy(String buttonSide, String buttonKey, String buttonIntro, String buttonDefine, String featureName) {
        return new GlassesOperationItem(buttonSide, buttonKey, buttonIntro, buttonDefine, featureName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesOperationItem)) {
            return false;
        }
        GlassesOperationItem glassesOperationItem = (GlassesOperationItem) other;
        return Intrinsics.areEqual(this.buttonSide, glassesOperationItem.buttonSide) && Intrinsics.areEqual(this.buttonKey, glassesOperationItem.buttonKey) && Intrinsics.areEqual(this.buttonIntro, glassesOperationItem.buttonIntro) && Intrinsics.areEqual(this.buttonDefine, glassesOperationItem.buttonDefine) && Intrinsics.areEqual(this.featureName, glassesOperationItem.featureName);
    }

    public int hashCode() {
        String str = this.buttonSide;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonIntro;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonDefine;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.featureName;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "GlassesOperationItem(buttonSide=" + this.buttonSide + ", buttonKey=" + this.buttonKey + ", buttonIntro=" + this.buttonIntro + ", buttonDefine=" + this.buttonDefine + ", featureName=" + this.featureName + Separators.RPAREN;
    }

    public GlassesOperationItem(String str, String str2, String str3, String str4, String str5) {
        this.buttonSide = str;
        this.buttonKey = str2;
        this.buttonIntro = str3;
        this.buttonDefine = str4;
        this.featureName = str5;
    }

    public final String getButtonSide() {
        return this.buttonSide;
    }

    public final String getButtonKey() {
        return this.buttonKey;
    }

    public final String getButtonIntro() {
        return this.buttonIntro;
    }

    public final String getButtonDefine() {
        return this.buttonDefine;
    }

    public final String getFeatureName() {
        return this.featureName;
    }
}
