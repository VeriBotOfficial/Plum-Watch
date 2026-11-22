package com.wakeup.feature.wkvideo.bean;

import android.gov.nist.core.Separators;
import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: WKVideoViewModelBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/SessionReq;", "", SpeechConstant.ISE_CATEGORY, "", ErrorBundle.DETAIL_ENTRY, "Lcom/wakeup/feature/wkvideo/bean/SessionReq$InnerData;", "<init>", "(Ljava/lang/String;Lcom/wakeup/feature/wkvideo/bean/SessionReq$InnerData;)V", "getCategory", "()Ljava/lang/String;", "getDetails", "()Lcom/wakeup/feature/wkvideo/bean/SessionReq$InnerData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "InnerData", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SessionReq {
    private final String category;
    private final InnerData details;

    public static /* synthetic */ SessionReq copy$default(SessionReq sessionReq, String str, InnerData innerData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionReq.category;
        }
        if ((i & 2) != 0) {
            innerData = sessionReq.details;
        }
        return sessionReq.copy(str, innerData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component2, reason: from getter */
    public final InnerData getDetails() {
        return this.details;
    }

    public final SessionReq copy(String category, InnerData details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new SessionReq(category, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionReq)) {
            return false;
        }
        SessionReq sessionReq = (SessionReq) other;
        return Intrinsics.areEqual(this.category, sessionReq.category) && Intrinsics.areEqual(this.details, sessionReq.details);
    }

    public int hashCode() {
        String str = this.category;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.details.hashCode();
    }

    public String toString() {
        return "SessionReq(category=" + this.category + ", details=" + this.details + Separators.RPAREN;
    }

    public SessionReq(String str, InnerData details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.category = str;
        this.details = details;
    }

    public final String getCategory() {
        return this.category;
    }

    public final InnerData getDetails() {
        return this.details;
    }

    /* compiled from: WKVideoViewModelBean.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/SessionReq$InnerData;", "", "showCnt", "", "playOverTime", "", "<init>", "(IJ)V", "getShowCnt", "()I", "getPlayOverTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InnerData {
        private final long playOverTime;
        private final int showCnt;

        public static /* synthetic */ InnerData copy$default(InnerData innerData, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = innerData.showCnt;
            }
            if ((i2 & 2) != 0) {
                j = innerData.playOverTime;
            }
            return innerData.copy(i, j);
        }

        /* renamed from: component1, reason: from getter */
        public final int getShowCnt() {
            return this.showCnt;
        }

        /* renamed from: component2, reason: from getter */
        public final long getPlayOverTime() {
            return this.playOverTime;
        }

        public final InnerData copy(int showCnt, long playOverTime) {
            return new InnerData(showCnt, playOverTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InnerData)) {
                return false;
            }
            InnerData innerData = (InnerData) other;
            return this.showCnt == innerData.showCnt && this.playOverTime == innerData.playOverTime;
        }

        public int hashCode() {
            return (Integer.hashCode(this.showCnt) * 31) + Long.hashCode(this.playOverTime);
        }

        public String toString() {
            return "InnerData(showCnt=" + this.showCnt + ", playOverTime=" + this.playOverTime + Separators.RPAREN;
        }

        public InnerData(int i, long j) {
            this.showCnt = i;
            this.playOverTime = j;
        }

        public final int getShowCnt() {
            return this.showCnt;
        }

        public final long getPlayOverTime() {
            return this.playOverTime;
        }
    }
}
