package com.wakeup.commonui.dialog;

import android.gov.nist.core.Separators;
import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.commonui.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeekBarHealthPlanCommonBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/wakeup/commonui/dialog/SeekBarHealthPlanCommonBean;", "", AppLovinMediationProvider.MAX, "", "min", "defaultProgress", "progressFlagMax", "progressFlagCenter", "progressFlagMin", "progressFlagVisible", "progressFlagResIds", "", "<init>", "(IIIIIII[I)V", "getMax", "()I", "getMin", "getDefaultProgress", "setDefaultProgress", "(I)V", "getProgressFlagMax", "getProgressFlagCenter", "getProgressFlagMin", "getProgressFlagVisible", "setProgressFlagVisible", "getProgressFlagResIds", "()[I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SeekBarHealthPlanCommonBean {
    private int defaultProgress;
    private final int max;
    private final int min;
    private final int progressFlagCenter;
    private final int progressFlagMax;
    private final int progressFlagMin;
    private final int[] progressFlagResIds;
    private int progressFlagVisible;

    public static /* synthetic */ SeekBarHealthPlanCommonBean copy$default(SeekBarHealthPlanCommonBean seekBarHealthPlanCommonBean, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = seekBarHealthPlanCommonBean.max;
        }
        if ((i8 & 2) != 0) {
            i2 = seekBarHealthPlanCommonBean.min;
        }
        if ((i8 & 4) != 0) {
            i3 = seekBarHealthPlanCommonBean.defaultProgress;
        }
        if ((i8 & 8) != 0) {
            i4 = seekBarHealthPlanCommonBean.progressFlagMax;
        }
        if ((i8 & 16) != 0) {
            i5 = seekBarHealthPlanCommonBean.progressFlagCenter;
        }
        if ((i8 & 32) != 0) {
            i6 = seekBarHealthPlanCommonBean.progressFlagMin;
        }
        if ((i8 & 64) != 0) {
            i7 = seekBarHealthPlanCommonBean.progressFlagVisible;
        }
        if ((i8 & 128) != 0) {
            iArr = seekBarHealthPlanCommonBean.progressFlagResIds;
        }
        int i9 = i7;
        int[] iArr2 = iArr;
        int i10 = i5;
        int i11 = i6;
        return seekBarHealthPlanCommonBean.copy(i, i2, i3, i4, i10, i11, i9, iArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDefaultProgress() {
        return this.defaultProgress;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProgressFlagMax() {
        return this.progressFlagMax;
    }

    /* renamed from: component5, reason: from getter */
    public final int getProgressFlagCenter() {
        return this.progressFlagCenter;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProgressFlagMin() {
        return this.progressFlagMin;
    }

    /* renamed from: component7, reason: from getter */
    public final int getProgressFlagVisible() {
        return this.progressFlagVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final int[] getProgressFlagResIds() {
        return this.progressFlagResIds;
    }

    public final SeekBarHealthPlanCommonBean copy(int max, int min, int defaultProgress, int progressFlagMax, int progressFlagCenter, int progressFlagMin, int progressFlagVisible, int[] progressFlagResIds) {
        Intrinsics.checkNotNullParameter(progressFlagResIds, "progressFlagResIds");
        return new SeekBarHealthPlanCommonBean(max, min, defaultProgress, progressFlagMax, progressFlagCenter, progressFlagMin, progressFlagVisible, progressFlagResIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeekBarHealthPlanCommonBean)) {
            return false;
        }
        SeekBarHealthPlanCommonBean seekBarHealthPlanCommonBean = (SeekBarHealthPlanCommonBean) other;
        return this.max == seekBarHealthPlanCommonBean.max && this.min == seekBarHealthPlanCommonBean.min && this.defaultProgress == seekBarHealthPlanCommonBean.defaultProgress && this.progressFlagMax == seekBarHealthPlanCommonBean.progressFlagMax && this.progressFlagCenter == seekBarHealthPlanCommonBean.progressFlagCenter && this.progressFlagMin == seekBarHealthPlanCommonBean.progressFlagMin && this.progressFlagVisible == seekBarHealthPlanCommonBean.progressFlagVisible && Intrinsics.areEqual(this.progressFlagResIds, seekBarHealthPlanCommonBean.progressFlagResIds);
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.max) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.defaultProgress)) * 31) + Integer.hashCode(this.progressFlagMax)) * 31) + Integer.hashCode(this.progressFlagCenter)) * 31) + Integer.hashCode(this.progressFlagMin)) * 31) + Integer.hashCode(this.progressFlagVisible)) * 31) + Arrays.hashCode(this.progressFlagResIds);
    }

    public String toString() {
        return "SeekBarHealthPlanCommonBean(max=" + this.max + ", min=" + this.min + ", defaultProgress=" + this.defaultProgress + ", progressFlagMax=" + this.progressFlagMax + ", progressFlagCenter=" + this.progressFlagCenter + ", progressFlagMin=" + this.progressFlagMin + ", progressFlagVisible=" + this.progressFlagVisible + ", progressFlagResIds=" + Arrays.toString(this.progressFlagResIds) + Separators.RPAREN;
    }

    public SeekBarHealthPlanCommonBean(int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] progressFlagResIds) {
        Intrinsics.checkNotNullParameter(progressFlagResIds, "progressFlagResIds");
        this.max = i;
        this.min = i2;
        this.defaultProgress = i3;
        this.progressFlagMax = i4;
        this.progressFlagCenter = i5;
        this.progressFlagMin = i6;
        this.progressFlagVisible = i7;
        this.progressFlagResIds = progressFlagResIds;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getDefaultProgress() {
        return this.defaultProgress;
    }

    public final void setDefaultProgress(int i) {
        this.defaultProgress = i;
    }

    public final int getProgressFlagMax() {
        return this.progressFlagMax;
    }

    public final int getProgressFlagCenter() {
        return this.progressFlagCenter;
    }

    public final int getProgressFlagMin() {
        return this.progressFlagMin;
    }

    public final int getProgressFlagVisible() {
        return this.progressFlagVisible;
    }

    public final void setProgressFlagVisible(int i) {
        this.progressFlagVisible = i;
    }

    public final int[] getProgressFlagResIds() {
        return this.progressFlagResIds;
    }

    public /* synthetic */ SeekBarHealthPlanCommonBean(int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i8 & 8) != 0 ? 100 : i4, (i8 & 16) != 0 ? 50 : i5, (i8 & 32) != 0 ? 1 : i6, (i8 & 64) != 0 ? 8 : i7, (i8 & 128) != 0 ? new int[]{R.id.dialog_common_content_progress_flag_1, R.id.dialog_common_content_progress_flag_2, R.id.dialog_common_content_progress_flag_3} : iArr);
    }
}
