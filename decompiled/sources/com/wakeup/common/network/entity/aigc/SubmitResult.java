package com.wakeup.common.network.entity.aigc;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeikeAigc.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/aigc/SubmitResult;", "", "imageUrl", "", "revisedPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getRevisedPrompt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubmitResult {
    private final String imageUrl;
    private final String revisedPrompt;

    public static /* synthetic */ SubmitResult copy$default(SubmitResult submitResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitResult.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = submitResult.revisedPrompt;
        }
        return submitResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRevisedPrompt() {
        return this.revisedPrompt;
    }

    public final SubmitResult copy(String imageUrl, String revisedPrompt) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(revisedPrompt, "revisedPrompt");
        return new SubmitResult(imageUrl, revisedPrompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitResult)) {
            return false;
        }
        SubmitResult submitResult = (SubmitResult) other;
        return Intrinsics.areEqual(this.imageUrl, submitResult.imageUrl) && Intrinsics.areEqual(this.revisedPrompt, submitResult.revisedPrompt);
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.revisedPrompt.hashCode();
    }

    public String toString() {
        return "SubmitResult(imageUrl=" + this.imageUrl + ", revisedPrompt=" + this.revisedPrompt + Separators.RPAREN;
    }

    public SubmitResult(String imageUrl, String revisedPrompt) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(revisedPrompt, "revisedPrompt");
        this.imageUrl = imageUrl;
        this.revisedPrompt = revisedPrompt;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getRevisedPrompt() {
        return this.revisedPrompt;
    }
}
