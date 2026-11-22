package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesKeyConfigV2.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003JY\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesKeyConfigV2;", "", "code", "", "eyeglassName", "modelPid", "language", "buttonDefine", "", "Lcom/wakeup/common/network/entity/glasses/GlassesButtonGroup;", "touchDefine", "Lcom/wakeup/common/network/entity/glasses/GlassesTouchGroup;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getEyeglassName", "getModelPid", "getLanguage", "getButtonDefine", "()Ljava/util/List;", "getTouchDefine", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesKeyConfigV2 {
    private final List<GlassesButtonGroup> buttonDefine;
    private final String code;
    private final String eyeglassName;
    private final String language;
    private final String modelPid;
    private final List<GlassesTouchGroup> touchDefine;

    public static /* synthetic */ GlassesKeyConfigV2 copy$default(GlassesKeyConfigV2 glassesKeyConfigV2, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = glassesKeyConfigV2.code;
        }
        if ((i & 2) != 0) {
            str2 = glassesKeyConfigV2.eyeglassName;
        }
        if ((i & 4) != 0) {
            str3 = glassesKeyConfigV2.modelPid;
        }
        if ((i & 8) != 0) {
            str4 = glassesKeyConfigV2.language;
        }
        if ((i & 16) != 0) {
            list = glassesKeyConfigV2.buttonDefine;
        }
        if ((i & 32) != 0) {
            list2 = glassesKeyConfigV2.touchDefine;
        }
        List list3 = list;
        List list4 = list2;
        return glassesKeyConfigV2.copy(str, str2, str3, str4, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEyeglassName() {
        return this.eyeglassName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getModelPid() {
        return this.modelPid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final List<GlassesButtonGroup> component5() {
        return this.buttonDefine;
    }

    public final List<GlassesTouchGroup> component6() {
        return this.touchDefine;
    }

    public final GlassesKeyConfigV2 copy(String code, String eyeglassName, String modelPid, String language, List<GlassesButtonGroup> buttonDefine, List<GlassesTouchGroup> touchDefine) {
        Intrinsics.checkNotNullParameter(buttonDefine, "buttonDefine");
        Intrinsics.checkNotNullParameter(touchDefine, "touchDefine");
        return new GlassesKeyConfigV2(code, eyeglassName, modelPid, language, buttonDefine, touchDefine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesKeyConfigV2)) {
            return false;
        }
        GlassesKeyConfigV2 glassesKeyConfigV2 = (GlassesKeyConfigV2) other;
        return Intrinsics.areEqual(this.code, glassesKeyConfigV2.code) && Intrinsics.areEqual(this.eyeglassName, glassesKeyConfigV2.eyeglassName) && Intrinsics.areEqual(this.modelPid, glassesKeyConfigV2.modelPid) && Intrinsics.areEqual(this.language, glassesKeyConfigV2.language) && Intrinsics.areEqual(this.buttonDefine, glassesKeyConfigV2.buttonDefine) && Intrinsics.areEqual(this.touchDefine, glassesKeyConfigV2.touchDefine);
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eyeglassName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modelPid;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.language;
        return ((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.buttonDefine.hashCode()) * 31) + this.touchDefine.hashCode();
    }

    public String toString() {
        return "GlassesKeyConfigV2(code=" + this.code + ", eyeglassName=" + this.eyeglassName + ", modelPid=" + this.modelPid + ", language=" + this.language + ", buttonDefine=" + this.buttonDefine + ", touchDefine=" + this.touchDefine + Separators.RPAREN;
    }

    public GlassesKeyConfigV2(String str, String str2, String str3, String str4, List<GlassesButtonGroup> buttonDefine, List<GlassesTouchGroup> touchDefine) {
        Intrinsics.checkNotNullParameter(buttonDefine, "buttonDefine");
        Intrinsics.checkNotNullParameter(touchDefine, "touchDefine");
        this.code = str;
        this.eyeglassName = str2;
        this.modelPid = str3;
        this.language = str4;
        this.buttonDefine = buttonDefine;
        this.touchDefine = touchDefine;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getEyeglassName() {
        return this.eyeglassName;
    }

    public final String getModelPid() {
        return this.modelPid;
    }

    public final String getLanguage() {
        return this.language;
    }

    public /* synthetic */ GlassesKeyConfigV2(String str, String str2, String str3, String str4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<GlassesButtonGroup> getButtonDefine() {
        return this.buttonDefine;
    }

    public final List<GlassesTouchGroup> getTouchDefine() {
        return this.touchDefine;
    }
}
