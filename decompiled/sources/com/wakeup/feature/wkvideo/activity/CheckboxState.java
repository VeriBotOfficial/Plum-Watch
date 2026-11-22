package com.wakeup.feature.wkvideo.activity;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: VideoReportActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/wkvideo/activity/CheckboxState;", "", "position", "", "subItemPosition", "isChecked", "", "<init>", "(IIZ)V", "getPosition", "()I", "getSubItemPosition", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckboxState {
    private final boolean isChecked;
    private final int position;
    private final int subItemPosition;

    public static /* synthetic */ CheckboxState copy$default(CheckboxState checkboxState, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkboxState.position;
        }
        if ((i3 & 2) != 0) {
            i2 = checkboxState.subItemPosition;
        }
        if ((i3 & 4) != 0) {
            z = checkboxState.isChecked;
        }
        return checkboxState.copy(i, i2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSubItemPosition() {
        return this.subItemPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final CheckboxState copy(int position, int subItemPosition, boolean isChecked) {
        return new CheckboxState(position, subItemPosition, isChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxState)) {
            return false;
        }
        CheckboxState checkboxState = (CheckboxState) other;
        return this.position == checkboxState.position && this.subItemPosition == checkboxState.subItemPosition && this.isChecked == checkboxState.isChecked;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.position) * 31) + Integer.hashCode(this.subItemPosition)) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "CheckboxState(position=" + this.position + ", subItemPosition=" + this.subItemPosition + ", isChecked=" + this.isChecked + Separators.RPAREN;
    }

    public CheckboxState(int i, int i2, boolean z) {
        this.position = i;
        this.subItemPosition = i2;
        this.isChecked = z;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getSubItemPosition() {
        return this.subItemPosition;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }
}
