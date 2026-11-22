package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateVideoVisibilityParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/video/UpdateVideoVisibilityParams;", "", "categoryId", "", "categoryVisibility", "", "<init>", "(ILjava/lang/String;)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getCategoryVisibility", "()Ljava/lang/String;", "setCategoryVisibility", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpdateVideoVisibilityParams {
    private int categoryId;
    private String categoryVisibility;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateVideoVisibilityParams() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateVideoVisibilityParams copy$default(UpdateVideoVisibilityParams updateVideoVisibilityParams, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = updateVideoVisibilityParams.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = updateVideoVisibilityParams.categoryVisibility;
        }
        return updateVideoVisibilityParams.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    public final UpdateVideoVisibilityParams copy(int categoryId, String categoryVisibility) {
        Intrinsics.checkNotNullParameter(categoryVisibility, "categoryVisibility");
        return new UpdateVideoVisibilityParams(categoryId, categoryVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateVideoVisibilityParams)) {
            return false;
        }
        UpdateVideoVisibilityParams updateVideoVisibilityParams = (UpdateVideoVisibilityParams) other;
        return this.categoryId == updateVideoVisibilityParams.categoryId && Intrinsics.areEqual(this.categoryVisibility, updateVideoVisibilityParams.categoryVisibility);
    }

    public int hashCode() {
        return (Integer.hashCode(this.categoryId) * 31) + this.categoryVisibility.hashCode();
    }

    public String toString() {
        return "UpdateVideoVisibilityParams(categoryId=" + this.categoryId + ", categoryVisibility=" + this.categoryVisibility + Separators.RPAREN;
    }

    public UpdateVideoVisibilityParams(int i, String categoryVisibility) {
        Intrinsics.checkNotNullParameter(categoryVisibility, "categoryVisibility");
        this.categoryId = i;
        this.categoryVisibility = categoryVisibility;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public /* synthetic */ UpdateVideoVisibilityParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? BuildConfig.SDK_BUILD_FLAVOR : str);
    }

    public final String getCategoryVisibility() {
        return this.categoryVisibility;
    }

    public final void setCategoryVisibility(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryVisibility = str;
    }
}
