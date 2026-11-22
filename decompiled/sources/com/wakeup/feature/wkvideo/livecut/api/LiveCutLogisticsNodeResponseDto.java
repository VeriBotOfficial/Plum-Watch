package com.wakeup.feature.wkvideo.livecut.api;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveCutCommerceApiModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutLogisticsNodeResponseDto;", "", "timeText", "", "statusText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTimeText", "()Ljava/lang/String;", "getStatusText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LiveCutLogisticsNodeResponseDto {

    @SerializedName("statusText")
    private final String statusText;

    @SerializedName("timeText")
    private final String timeText;

    public static /* synthetic */ LiveCutLogisticsNodeResponseDto copy$default(LiveCutLogisticsNodeResponseDto liveCutLogisticsNodeResponseDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveCutLogisticsNodeResponseDto.timeText;
        }
        if ((i & 2) != 0) {
            str2 = liveCutLogisticsNodeResponseDto.statusText;
        }
        return liveCutLogisticsNodeResponseDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    public final LiveCutLogisticsNodeResponseDto copy(String timeText, String statusText) {
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        return new LiveCutLogisticsNodeResponseDto(timeText, statusText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCutLogisticsNodeResponseDto)) {
            return false;
        }
        LiveCutLogisticsNodeResponseDto liveCutLogisticsNodeResponseDto = (LiveCutLogisticsNodeResponseDto) other;
        return Intrinsics.areEqual(this.timeText, liveCutLogisticsNodeResponseDto.timeText) && Intrinsics.areEqual(this.statusText, liveCutLogisticsNodeResponseDto.statusText);
    }

    public int hashCode() {
        return (this.timeText.hashCode() * 31) + this.statusText.hashCode();
    }

    public String toString() {
        return "LiveCutLogisticsNodeResponseDto(timeText=" + this.timeText + ", statusText=" + this.statusText + Separators.RPAREN;
    }

    public LiveCutLogisticsNodeResponseDto(String timeText, String statusText) {
        Intrinsics.checkNotNullParameter(timeText, "timeText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        this.timeText = timeText;
        this.statusText = statusText;
    }

    public final String getTimeText() {
        return this.timeText;
    }

    public final String getStatusText() {
        return this.statusText;
    }
}
