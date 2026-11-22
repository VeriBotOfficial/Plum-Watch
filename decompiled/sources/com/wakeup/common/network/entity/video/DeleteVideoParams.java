package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DeleteVideoParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/video/DeleteVideoParams;", "", "categoryId", "", "<init>", "(I)V", "getCategoryId", "()I", "setCategoryId", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteVideoParams {
    private int categoryId;

    public DeleteVideoParams() {
        this(0, 1, null);
    }

    public static /* synthetic */ DeleteVideoParams copy$default(DeleteVideoParams deleteVideoParams, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteVideoParams.categoryId;
        }
        return deleteVideoParams.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    public final DeleteVideoParams copy(int categoryId) {
        return new DeleteVideoParams(categoryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteVideoParams) && this.categoryId == ((DeleteVideoParams) other).categoryId;
    }

    public int hashCode() {
        return Integer.hashCode(this.categoryId);
    }

    public String toString() {
        return "DeleteVideoParams(categoryId=" + this.categoryId + Separators.RPAREN;
    }

    public DeleteVideoParams(int i) {
        this.categoryId = i;
    }

    public /* synthetic */ DeleteVideoParams(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }
}
