package com.wakeup.common.network.entity.ad;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvertInfoEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/ad/AdPlatformRequestParam;", "", "sceneCode", "", "appConventionCodes", "", "appConventionExperimentZoneCodes", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSceneCode", "()Ljava/lang/String;", "setSceneCode", "(Ljava/lang/String;)V", "getAppConventionCodes", "()Ljava/util/List;", "setAppConventionCodes", "(Ljava/util/List;)V", "getAppConventionExperimentZoneCodes", "setAppConventionExperimentZoneCodes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdPlatformRequestParam {
    private List<String> appConventionCodes;
    private List<String> appConventionExperimentZoneCodes;
    private String sceneCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdPlatformRequestParam copy$default(AdPlatformRequestParam adPlatformRequestParam, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adPlatformRequestParam.sceneCode;
        }
        if ((i & 2) != 0) {
            list = adPlatformRequestParam.appConventionCodes;
        }
        if ((i & 4) != 0) {
            list2 = adPlatformRequestParam.appConventionExperimentZoneCodes;
        }
        return adPlatformRequestParam.copy(str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSceneCode() {
        return this.sceneCode;
    }

    public final List<String> component2() {
        return this.appConventionCodes;
    }

    public final List<String> component3() {
        return this.appConventionExperimentZoneCodes;
    }

    public final AdPlatformRequestParam copy(String sceneCode, List<String> appConventionCodes, List<String> appConventionExperimentZoneCodes) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(appConventionCodes, "appConventionCodes");
        Intrinsics.checkNotNullParameter(appConventionExperimentZoneCodes, "appConventionExperimentZoneCodes");
        return new AdPlatformRequestParam(sceneCode, appConventionCodes, appConventionExperimentZoneCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPlatformRequestParam)) {
            return false;
        }
        AdPlatformRequestParam adPlatformRequestParam = (AdPlatformRequestParam) other;
        return Intrinsics.areEqual(this.sceneCode, adPlatformRequestParam.sceneCode) && Intrinsics.areEqual(this.appConventionCodes, adPlatformRequestParam.appConventionCodes) && Intrinsics.areEqual(this.appConventionExperimentZoneCodes, adPlatformRequestParam.appConventionExperimentZoneCodes);
    }

    public int hashCode() {
        return (((this.sceneCode.hashCode() * 31) + this.appConventionCodes.hashCode()) * 31) + this.appConventionExperimentZoneCodes.hashCode();
    }

    public String toString() {
        return "AdPlatformRequestParam(sceneCode=" + this.sceneCode + ", appConventionCodes=" + this.appConventionCodes + ", appConventionExperimentZoneCodes=" + this.appConventionExperimentZoneCodes + Separators.RPAREN;
    }

    public AdPlatformRequestParam(String sceneCode, List<String> appConventionCodes, List<String> appConventionExperimentZoneCodes) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(appConventionCodes, "appConventionCodes");
        Intrinsics.checkNotNullParameter(appConventionExperimentZoneCodes, "appConventionExperimentZoneCodes");
        this.sceneCode = sceneCode;
        this.appConventionCodes = appConventionCodes;
        this.appConventionExperimentZoneCodes = appConventionExperimentZoneCodes;
    }

    public final String getSceneCode() {
        return this.sceneCode;
    }

    public final void setSceneCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sceneCode = str;
    }

    public final List<String> getAppConventionCodes() {
        return this.appConventionCodes;
    }

    public final void setAppConventionCodes(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.appConventionCodes = list;
    }

    public final List<String> getAppConventionExperimentZoneCodes() {
        return this.appConventionExperimentZoneCodes;
    }

    public final void setAppConventionExperimentZoneCodes(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.appConventionExperimentZoneCodes = list;
    }
}
