package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiIntent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiIntent;", "", "function", "", "desc", ParameterNames.REQUIRED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFunction", "()Ljava/lang/String;", "getDesc", "getRequired", "isTakePhoto", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiIntent {
    public static final String INTENT_ANALYZE_IMG = "analyze_image_with_ai";
    private final String desc;
    private final String function;
    private final String required;

    public static /* synthetic */ AiIntent copy$default(AiIntent aiIntent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiIntent.function;
        }
        if ((i & 2) != 0) {
            str2 = aiIntent.desc;
        }
        if ((i & 4) != 0) {
            str3 = aiIntent.required;
        }
        return aiIntent.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFunction() {
        return this.function;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRequired() {
        return this.required;
    }

    public final AiIntent copy(String function, String desc, String required) {
        return new AiIntent(function, desc, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiIntent)) {
            return false;
        }
        AiIntent aiIntent = (AiIntent) other;
        return Intrinsics.areEqual(this.function, aiIntent.function) && Intrinsics.areEqual(this.desc, aiIntent.desc) && Intrinsics.areEqual(this.required, aiIntent.required);
    }

    public int hashCode() {
        String str = this.function;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.required;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AiIntent(function=" + this.function + ", desc=" + this.desc + ", required=" + this.required + Separators.RPAREN;
    }

    public AiIntent(String str, String str2, String str3) {
        this.function = str;
        this.desc = str2;
        this.required = str3;
    }

    public final String getFunction() {
        return this.function;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getRequired() {
        return this.required;
    }

    public final boolean isTakePhoto() {
        return Intrinsics.areEqual(this.function, INTENT_ANALYZE_IMG);
    }
}
