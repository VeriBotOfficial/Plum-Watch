package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserLabel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/user/UserLabel;", "", "id", "", "labelName", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getLabelName", "()Ljava/lang/String;", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserLabel {
    private final int id;
    private final String labelName;
    private boolean select;

    public static /* synthetic */ UserLabel copy$default(UserLabel userLabel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userLabel.id;
        }
        if ((i2 & 2) != 0) {
            str = userLabel.labelName;
        }
        return userLabel.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabelName() {
        return this.labelName;
    }

    public final UserLabel copy(int id2, String labelName) {
        Intrinsics.checkNotNullParameter(labelName, "labelName");
        return new UserLabel(id2, labelName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLabel)) {
            return false;
        }
        UserLabel userLabel = (UserLabel) other;
        return this.id == userLabel.id && Intrinsics.areEqual(this.labelName, userLabel.labelName);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.labelName.hashCode();
    }

    public String toString() {
        return "UserLabel(id=" + this.id + ", labelName=" + this.labelName + Separators.RPAREN;
    }

    public UserLabel(int i, String labelName) {
        Intrinsics.checkNotNullParameter(labelName, "labelName");
        this.id = i;
        this.labelName = labelName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLabelName() {
        return this.labelName;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }
}
