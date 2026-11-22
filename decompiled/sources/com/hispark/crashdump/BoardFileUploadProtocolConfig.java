package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\tHÆ\u0003J\t\u0010Q\u001a\u00020\tHÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u0083\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\tHÖ\u0001J\t\u0010\\\u001a\u00020]HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$¨\u0006^"}, d2 = {"Lcom/hispark/crashdump/BoardFileUploadProtocolConfig;", "", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "transferTimeoutMs", "", "requestIdleTimeoutMs", "negotiationAckTimeoutMs", "negotiationMaxAttempts", "", "finishAckTimeoutMs", "deleteAckTimeoutMs", "deleteMaxAttempts", "deleteRetryDelayMs", "classicBlockSize", "", "classicBlockNum", "bleBlockSize", "bleBlockNum", "bleRateLimitBytesPerSecond", "classicRateLimitBytesPerSecond", "classicMinRateLimitBytesPerSecond", "classicMaxRateLimitBytesPerSecond", "classicRateProbeStepBytesPerSecond", "classicRateProbeSuccessWindows", "classicRateCongestionDecreasePercent", "bleWriteBusyMaxAttempts", "bleWriteBusyBackoffBaseMs", "bleWriteBusyBackoffMaxMs", "noProgressTimeoutMs", "bleWriteBusyRetryTimeoutMs", "<init>", "(Lcom/hispark/crashdump/BoardLinkType;JJJIJJIJSSSSIIIIIIIIJJJJ)V", "getLinkType", "()Lcom/hispark/crashdump/BoardLinkType;", "getTransferTimeoutMs", "()J", "getRequestIdleTimeoutMs", "getNegotiationAckTimeoutMs", "getNegotiationMaxAttempts", "()I", "getFinishAckTimeoutMs", "getDeleteAckTimeoutMs", "getDeleteMaxAttempts", "getDeleteRetryDelayMs", "getClassicBlockSize", "()S", "getClassicBlockNum", "getBleBlockSize", "getBleBlockNum", "getBleRateLimitBytesPerSecond", "getClassicRateLimitBytesPerSecond", "getClassicMinRateLimitBytesPerSecond", "getClassicMaxRateLimitBytesPerSecond", "getClassicRateProbeStepBytesPerSecond", "getClassicRateProbeSuccessWindows", "getClassicRateCongestionDecreasePercent", "getBleWriteBusyMaxAttempts", "getBleWriteBusyBackoffBaseMs", "getBleWriteBusyBackoffMaxMs", "getNoProgressTimeoutMs", "getBleWriteBusyRetryTimeoutMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoardFileUploadProtocolConfig {
    private final short bleBlockNum;
    private final short bleBlockSize;
    private final int bleRateLimitBytesPerSecond;
    private final long bleWriteBusyBackoffBaseMs;
    private final long bleWriteBusyBackoffMaxMs;
    private final int bleWriteBusyMaxAttempts;
    private final long bleWriteBusyRetryTimeoutMs;
    private final short classicBlockNum;
    private final short classicBlockSize;
    private final int classicMaxRateLimitBytesPerSecond;
    private final int classicMinRateLimitBytesPerSecond;
    private final int classicRateCongestionDecreasePercent;
    private final int classicRateLimitBytesPerSecond;
    private final int classicRateProbeStepBytesPerSecond;
    private final int classicRateProbeSuccessWindows;
    private final long deleteAckTimeoutMs;
    private final int deleteMaxAttempts;
    private final long deleteRetryDelayMs;
    private final long finishAckTimeoutMs;
    private final BoardLinkType linkType;
    private final long negotiationAckTimeoutMs;
    private final int negotiationMaxAttempts;
    private final long noProgressTimeoutMs;
    private final long requestIdleTimeoutMs;
    private final long transferTimeoutMs;

    public static /* synthetic */ BoardFileUploadProtocolConfig copy$default(BoardFileUploadProtocolConfig boardFileUploadProtocolConfig, BoardLinkType boardLinkType, long j, long j2, long j3, int i, long j4, long j5, int i2, long j6, short s, short s2, short s3, short s4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j7, long j8, long j9, long j10, int i11, Object obj) {
        long j11;
        long j12;
        long j13;
        long j14;
        short s5;
        short s6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j15;
        long j16;
        short s7;
        short s8;
        long j17;
        long j18;
        int i20;
        long j19;
        long j20;
        int i21;
        long j21;
        BoardLinkType boardLinkType2 = (i11 & 1) != 0 ? boardFileUploadProtocolConfig.linkType : boardLinkType;
        long j22 = (i11 & 2) != 0 ? boardFileUploadProtocolConfig.transferTimeoutMs : j;
        long j23 = (i11 & 4) != 0 ? boardFileUploadProtocolConfig.requestIdleTimeoutMs : j2;
        long j24 = (i11 & 8) != 0 ? boardFileUploadProtocolConfig.negotiationAckTimeoutMs : j3;
        int i22 = (i11 & 16) != 0 ? boardFileUploadProtocolConfig.negotiationMaxAttempts : i;
        long j25 = (i11 & 32) != 0 ? boardFileUploadProtocolConfig.finishAckTimeoutMs : j4;
        long j26 = (i11 & 64) != 0 ? boardFileUploadProtocolConfig.deleteAckTimeoutMs : j5;
        int i23 = (i11 & 128) != 0 ? boardFileUploadProtocolConfig.deleteMaxAttempts : i2;
        BoardLinkType boardLinkType3 = boardLinkType2;
        if ((i11 & 256) != 0) {
            j11 = j22;
            j12 = boardFileUploadProtocolConfig.deleteRetryDelayMs;
        } else {
            j11 = j22;
            j12 = j6;
        }
        short s9 = (i11 & 512) != 0 ? boardFileUploadProtocolConfig.classicBlockSize : s;
        long j27 = j12;
        short s10 = (i11 & 1024) != 0 ? boardFileUploadProtocolConfig.classicBlockNum : s2;
        short s11 = (i11 & 2048) != 0 ? boardFileUploadProtocolConfig.bleBlockSize : s3;
        short s12 = s10;
        short s13 = (i11 & 4096) != 0 ? boardFileUploadProtocolConfig.bleBlockNum : s4;
        int i24 = (i11 & 8192) != 0 ? boardFileUploadProtocolConfig.bleRateLimitBytesPerSecond : i3;
        int i25 = (i11 & 16384) != 0 ? boardFileUploadProtocolConfig.classicRateLimitBytesPerSecond : i4;
        int i26 = (i11 & 32768) != 0 ? boardFileUploadProtocolConfig.classicMinRateLimitBytesPerSecond : i5;
        int i27 = (i11 & 65536) != 0 ? boardFileUploadProtocolConfig.classicMaxRateLimitBytesPerSecond : i6;
        int i28 = (i11 & 131072) != 0 ? boardFileUploadProtocolConfig.classicRateProbeStepBytesPerSecond : i7;
        int i29 = (i11 & 262144) != 0 ? boardFileUploadProtocolConfig.classicRateProbeSuccessWindows : i8;
        int i30 = (i11 & 524288) != 0 ? boardFileUploadProtocolConfig.classicRateCongestionDecreasePercent : i9;
        int i31 = (i11 & 1048576) != 0 ? boardFileUploadProtocolConfig.bleWriteBusyMaxAttempts : i10;
        int i32 = i25;
        long j28 = (i11 & 2097152) != 0 ? boardFileUploadProtocolConfig.bleWriteBusyBackoffBaseMs : j7;
        long j29 = (i11 & 4194304) != 0 ? boardFileUploadProtocolConfig.bleWriteBusyBackoffMaxMs : j8;
        long j30 = (i11 & 8388608) != 0 ? boardFileUploadProtocolConfig.noProgressTimeoutMs : j9;
        if ((i11 & 16777216) != 0) {
            j14 = j30;
            j13 = boardFileUploadProtocolConfig.bleWriteBusyRetryTimeoutMs;
            s6 = s13;
            i12 = i24;
            i13 = i26;
            i14 = i27;
            i15 = i28;
            i16 = i29;
            i17 = i30;
            i18 = i32;
            i19 = i31;
            j15 = j28;
            j16 = j29;
            s7 = s11;
            s8 = s9;
            j17 = j23;
            j18 = j24;
            i20 = i22;
            j19 = j25;
            j20 = j26;
            i21 = i23;
            j21 = j27;
            s5 = s12;
        } else {
            j13 = j10;
            j14 = j30;
            s5 = s12;
            s6 = s13;
            i12 = i24;
            i13 = i26;
            i14 = i27;
            i15 = i28;
            i16 = i29;
            i17 = i30;
            i18 = i32;
            i19 = i31;
            j15 = j28;
            j16 = j29;
            s7 = s11;
            s8 = s9;
            j17 = j23;
            j18 = j24;
            i20 = i22;
            j19 = j25;
            j20 = j26;
            i21 = i23;
            j21 = j27;
        }
        return boardFileUploadProtocolConfig.copy(boardLinkType3, j11, j17, j18, i20, j19, j20, i21, j21, s8, s5, s7, s6, i12, i18, i13, i14, i15, i16, i17, i19, j15, j16, j14, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final BoardLinkType getLinkType() {
        return this.linkType;
    }

    /* renamed from: component10, reason: from getter */
    public final short getClassicBlockSize() {
        return this.classicBlockSize;
    }

    /* renamed from: component11, reason: from getter */
    public final short getClassicBlockNum() {
        return this.classicBlockNum;
    }

    /* renamed from: component12, reason: from getter */
    public final short getBleBlockSize() {
        return this.bleBlockSize;
    }

    /* renamed from: component13, reason: from getter */
    public final short getBleBlockNum() {
        return this.bleBlockNum;
    }

    /* renamed from: component14, reason: from getter */
    public final int getBleRateLimitBytesPerSecond() {
        return this.bleRateLimitBytesPerSecond;
    }

    /* renamed from: component15, reason: from getter */
    public final int getClassicRateLimitBytesPerSecond() {
        return this.classicRateLimitBytesPerSecond;
    }

    /* renamed from: component16, reason: from getter */
    public final int getClassicMinRateLimitBytesPerSecond() {
        return this.classicMinRateLimitBytesPerSecond;
    }

    /* renamed from: component17, reason: from getter */
    public final int getClassicMaxRateLimitBytesPerSecond() {
        return this.classicMaxRateLimitBytesPerSecond;
    }

    /* renamed from: component18, reason: from getter */
    public final int getClassicRateProbeStepBytesPerSecond() {
        return this.classicRateProbeStepBytesPerSecond;
    }

    /* renamed from: component19, reason: from getter */
    public final int getClassicRateProbeSuccessWindows() {
        return this.classicRateProbeSuccessWindows;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTransferTimeoutMs() {
        return this.transferTimeoutMs;
    }

    /* renamed from: component20, reason: from getter */
    public final int getClassicRateCongestionDecreasePercent() {
        return this.classicRateCongestionDecreasePercent;
    }

    /* renamed from: component21, reason: from getter */
    public final int getBleWriteBusyMaxAttempts() {
        return this.bleWriteBusyMaxAttempts;
    }

    /* renamed from: component22, reason: from getter */
    public final long getBleWriteBusyBackoffBaseMs() {
        return this.bleWriteBusyBackoffBaseMs;
    }

    /* renamed from: component23, reason: from getter */
    public final long getBleWriteBusyBackoffMaxMs() {
        return this.bleWriteBusyBackoffMaxMs;
    }

    /* renamed from: component24, reason: from getter */
    public final long getNoProgressTimeoutMs() {
        return this.noProgressTimeoutMs;
    }

    /* renamed from: component25, reason: from getter */
    public final long getBleWriteBusyRetryTimeoutMs() {
        return this.bleWriteBusyRetryTimeoutMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getRequestIdleTimeoutMs() {
        return this.requestIdleTimeoutMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getNegotiationAckTimeoutMs() {
        return this.negotiationAckTimeoutMs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNegotiationMaxAttempts() {
        return this.negotiationMaxAttempts;
    }

    /* renamed from: component6, reason: from getter */
    public final long getFinishAckTimeoutMs() {
        return this.finishAckTimeoutMs;
    }

    /* renamed from: component7, reason: from getter */
    public final long getDeleteAckTimeoutMs() {
        return this.deleteAckTimeoutMs;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDeleteMaxAttempts() {
        return this.deleteMaxAttempts;
    }

    /* renamed from: component9, reason: from getter */
    public final long getDeleteRetryDelayMs() {
        return this.deleteRetryDelayMs;
    }

    public final BoardFileUploadProtocolConfig copy(BoardLinkType linkType, long transferTimeoutMs, long requestIdleTimeoutMs, long negotiationAckTimeoutMs, int negotiationMaxAttempts, long finishAckTimeoutMs, long deleteAckTimeoutMs, int deleteMaxAttempts, long deleteRetryDelayMs, short classicBlockSize, short classicBlockNum, short bleBlockSize, short bleBlockNum, int bleRateLimitBytesPerSecond, int classicRateLimitBytesPerSecond, int classicMinRateLimitBytesPerSecond, int classicMaxRateLimitBytesPerSecond, int classicRateProbeStepBytesPerSecond, int classicRateProbeSuccessWindows, int classicRateCongestionDecreasePercent, int bleWriteBusyMaxAttempts, long bleWriteBusyBackoffBaseMs, long bleWriteBusyBackoffMaxMs, long noProgressTimeoutMs, long bleWriteBusyRetryTimeoutMs) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        return new BoardFileUploadProtocolConfig(linkType, transferTimeoutMs, requestIdleTimeoutMs, negotiationAckTimeoutMs, negotiationMaxAttempts, finishAckTimeoutMs, deleteAckTimeoutMs, deleteMaxAttempts, deleteRetryDelayMs, classicBlockSize, classicBlockNum, bleBlockSize, bleBlockNum, bleRateLimitBytesPerSecond, classicRateLimitBytesPerSecond, classicMinRateLimitBytesPerSecond, classicMaxRateLimitBytesPerSecond, classicRateProbeStepBytesPerSecond, classicRateProbeSuccessWindows, classicRateCongestionDecreasePercent, bleWriteBusyMaxAttempts, bleWriteBusyBackoffBaseMs, bleWriteBusyBackoffMaxMs, noProgressTimeoutMs, bleWriteBusyRetryTimeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardFileUploadProtocolConfig)) {
            return false;
        }
        BoardFileUploadProtocolConfig boardFileUploadProtocolConfig = (BoardFileUploadProtocolConfig) other;
        return this.linkType == boardFileUploadProtocolConfig.linkType && this.transferTimeoutMs == boardFileUploadProtocolConfig.transferTimeoutMs && this.requestIdleTimeoutMs == boardFileUploadProtocolConfig.requestIdleTimeoutMs && this.negotiationAckTimeoutMs == boardFileUploadProtocolConfig.negotiationAckTimeoutMs && this.negotiationMaxAttempts == boardFileUploadProtocolConfig.negotiationMaxAttempts && this.finishAckTimeoutMs == boardFileUploadProtocolConfig.finishAckTimeoutMs && this.deleteAckTimeoutMs == boardFileUploadProtocolConfig.deleteAckTimeoutMs && this.deleteMaxAttempts == boardFileUploadProtocolConfig.deleteMaxAttempts && this.deleteRetryDelayMs == boardFileUploadProtocolConfig.deleteRetryDelayMs && this.classicBlockSize == boardFileUploadProtocolConfig.classicBlockSize && this.classicBlockNum == boardFileUploadProtocolConfig.classicBlockNum && this.bleBlockSize == boardFileUploadProtocolConfig.bleBlockSize && this.bleBlockNum == boardFileUploadProtocolConfig.bleBlockNum && this.bleRateLimitBytesPerSecond == boardFileUploadProtocolConfig.bleRateLimitBytesPerSecond && this.classicRateLimitBytesPerSecond == boardFileUploadProtocolConfig.classicRateLimitBytesPerSecond && this.classicMinRateLimitBytesPerSecond == boardFileUploadProtocolConfig.classicMinRateLimitBytesPerSecond && this.classicMaxRateLimitBytesPerSecond == boardFileUploadProtocolConfig.classicMaxRateLimitBytesPerSecond && this.classicRateProbeStepBytesPerSecond == boardFileUploadProtocolConfig.classicRateProbeStepBytesPerSecond && this.classicRateProbeSuccessWindows == boardFileUploadProtocolConfig.classicRateProbeSuccessWindows && this.classicRateCongestionDecreasePercent == boardFileUploadProtocolConfig.classicRateCongestionDecreasePercent && this.bleWriteBusyMaxAttempts == boardFileUploadProtocolConfig.bleWriteBusyMaxAttempts && this.bleWriteBusyBackoffBaseMs == boardFileUploadProtocolConfig.bleWriteBusyBackoffBaseMs && this.bleWriteBusyBackoffMaxMs == boardFileUploadProtocolConfig.bleWriteBusyBackoffMaxMs && this.noProgressTimeoutMs == boardFileUploadProtocolConfig.noProgressTimeoutMs && this.bleWriteBusyRetryTimeoutMs == boardFileUploadProtocolConfig.bleWriteBusyRetryTimeoutMs;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.linkType.hashCode() * 31) + Long.hashCode(this.transferTimeoutMs)) * 31) + Long.hashCode(this.requestIdleTimeoutMs)) * 31) + Long.hashCode(this.negotiationAckTimeoutMs)) * 31) + Integer.hashCode(this.negotiationMaxAttempts)) * 31) + Long.hashCode(this.finishAckTimeoutMs)) * 31) + Long.hashCode(this.deleteAckTimeoutMs)) * 31) + Integer.hashCode(this.deleteMaxAttempts)) * 31) + Long.hashCode(this.deleteRetryDelayMs)) * 31) + Short.hashCode(this.classicBlockSize)) * 31) + Short.hashCode(this.classicBlockNum)) * 31) + Short.hashCode(this.bleBlockSize)) * 31) + Short.hashCode(this.bleBlockNum)) * 31) + Integer.hashCode(this.bleRateLimitBytesPerSecond)) * 31) + Integer.hashCode(this.classicRateLimitBytesPerSecond)) * 31) + Integer.hashCode(this.classicMinRateLimitBytesPerSecond)) * 31) + Integer.hashCode(this.classicMaxRateLimitBytesPerSecond)) * 31) + Integer.hashCode(this.classicRateProbeStepBytesPerSecond)) * 31) + Integer.hashCode(this.classicRateProbeSuccessWindows)) * 31) + Integer.hashCode(this.classicRateCongestionDecreasePercent)) * 31) + Integer.hashCode(this.bleWriteBusyMaxAttempts)) * 31) + Long.hashCode(this.bleWriteBusyBackoffBaseMs)) * 31) + Long.hashCode(this.bleWriteBusyBackoffMaxMs)) * 31) + Long.hashCode(this.noProgressTimeoutMs)) * 31) + Long.hashCode(this.bleWriteBusyRetryTimeoutMs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BoardFileUploadProtocolConfig(linkType=");
        sb.append(this.linkType).append(", transferTimeoutMs=").append(this.transferTimeoutMs).append(", requestIdleTimeoutMs=").append(this.requestIdleTimeoutMs).append(", negotiationAckTimeoutMs=").append(this.negotiationAckTimeoutMs).append(", negotiationMaxAttempts=").append(this.negotiationMaxAttempts).append(", finishAckTimeoutMs=").append(this.finishAckTimeoutMs).append(", deleteAckTimeoutMs=").append(this.deleteAckTimeoutMs).append(", deleteMaxAttempts=").append(this.deleteMaxAttempts).append(", deleteRetryDelayMs=").append(this.deleteRetryDelayMs).append(", classicBlockSize=").append((int) this.classicBlockSize).append(", classicBlockNum=").append((int) this.classicBlockNum).append(", bleBlockSize=");
        sb.append((int) this.bleBlockSize).append(", bleBlockNum=").append((int) this.bleBlockNum).append(", bleRateLimitBytesPerSecond=").append(this.bleRateLimitBytesPerSecond).append(", classicRateLimitBytesPerSecond=").append(this.classicRateLimitBytesPerSecond).append(", classicMinRateLimitBytesPerSecond=").append(this.classicMinRateLimitBytesPerSecond).append(", classicMaxRateLimitBytesPerSecond=").append(this.classicMaxRateLimitBytesPerSecond).append(", classicRateProbeStepBytesPerSecond=").append(this.classicRateProbeStepBytesPerSecond).append(", classicRateProbeSuccessWindows=").append(this.classicRateProbeSuccessWindows).append(", classicRateCongestionDecreasePercent=").append(this.classicRateCongestionDecreasePercent).append(", bleWriteBusyMaxAttempts=").append(this.bleWriteBusyMaxAttempts).append(", bleWriteBusyBackoffBaseMs=").append(this.bleWriteBusyBackoffBaseMs).append(", bleWriteBusyBackoffMaxMs=").append(this.bleWriteBusyBackoffMaxMs);
        sb.append(", noProgressTimeoutMs=").append(this.noProgressTimeoutMs).append(", bleWriteBusyRetryTimeoutMs=").append(this.bleWriteBusyRetryTimeoutMs).append(')');
        return sb.toString();
    }

    public BoardFileUploadProtocolConfig(BoardLinkType linkType, long j, long j2, long j3, int i, long j4, long j5, int i2, long j6, short s, short s2, short s3, short s4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j7, long j8, long j9, long j10) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        this.linkType = linkType;
        this.transferTimeoutMs = j;
        this.requestIdleTimeoutMs = j2;
        this.negotiationAckTimeoutMs = j3;
        this.negotiationMaxAttempts = i;
        this.finishAckTimeoutMs = j4;
        this.deleteAckTimeoutMs = j5;
        this.deleteMaxAttempts = i2;
        this.deleteRetryDelayMs = j6;
        this.classicBlockSize = s;
        this.classicBlockNum = s2;
        this.bleBlockSize = s3;
        this.bleBlockNum = s4;
        this.bleRateLimitBytesPerSecond = i3;
        this.classicRateLimitBytesPerSecond = i4;
        this.classicMinRateLimitBytesPerSecond = i5;
        this.classicMaxRateLimitBytesPerSecond = i6;
        this.classicRateProbeStepBytesPerSecond = i7;
        this.classicRateProbeSuccessWindows = i8;
        this.classicRateCongestionDecreasePercent = i9;
        this.bleWriteBusyMaxAttempts = i10;
        this.bleWriteBusyBackoffBaseMs = j7;
        this.bleWriteBusyBackoffMaxMs = j8;
        this.noProgressTimeoutMs = j9;
        this.bleWriteBusyRetryTimeoutMs = j10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BoardFileUploadProtocolConfig(com.hispark.crashdump.BoardLinkType r32, long r33, long r35, long r37, int r39, long r40, long r42, int r44, long r45, short r47, short r48, short r49, short r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, long r59, long r61, long r63, long r65, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.crashdump.BoardFileUploadProtocolConfig.<init>(com.hispark.crashdump.BoardLinkType, long, long, long, int, long, long, int, long, short, short, short, short, int, int, int, int, int, int, int, int, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BoardLinkType getLinkType() {
        return this.linkType;
    }

    public final long getTransferTimeoutMs() {
        return this.transferTimeoutMs;
    }

    public final long getRequestIdleTimeoutMs() {
        return this.requestIdleTimeoutMs;
    }

    public final long getNegotiationAckTimeoutMs() {
        return this.negotiationAckTimeoutMs;
    }

    public final int getNegotiationMaxAttempts() {
        return this.negotiationMaxAttempts;
    }

    public final long getFinishAckTimeoutMs() {
        return this.finishAckTimeoutMs;
    }

    public final long getDeleteAckTimeoutMs() {
        return this.deleteAckTimeoutMs;
    }

    public final int getDeleteMaxAttempts() {
        return this.deleteMaxAttempts;
    }

    public final long getDeleteRetryDelayMs() {
        return this.deleteRetryDelayMs;
    }

    public final short getClassicBlockSize() {
        return this.classicBlockSize;
    }

    public final short getClassicBlockNum() {
        return this.classicBlockNum;
    }

    public final short getBleBlockSize() {
        return this.bleBlockSize;
    }

    public final short getBleBlockNum() {
        return this.bleBlockNum;
    }

    public final int getBleRateLimitBytesPerSecond() {
        return this.bleRateLimitBytesPerSecond;
    }

    public final int getClassicRateLimitBytesPerSecond() {
        return this.classicRateLimitBytesPerSecond;
    }

    public final int getClassicMinRateLimitBytesPerSecond() {
        return this.classicMinRateLimitBytesPerSecond;
    }

    public final int getClassicMaxRateLimitBytesPerSecond() {
        return this.classicMaxRateLimitBytesPerSecond;
    }

    public final int getClassicRateProbeStepBytesPerSecond() {
        return this.classicRateProbeStepBytesPerSecond;
    }

    public final int getClassicRateProbeSuccessWindows() {
        return this.classicRateProbeSuccessWindows;
    }

    public final int getClassicRateCongestionDecreasePercent() {
        return this.classicRateCongestionDecreasePercent;
    }

    public final int getBleWriteBusyMaxAttempts() {
        return this.bleWriteBusyMaxAttempts;
    }

    public final long getBleWriteBusyBackoffBaseMs() {
        return this.bleWriteBusyBackoffBaseMs;
    }

    public final long getBleWriteBusyBackoffMaxMs() {
        return this.bleWriteBusyBackoffMaxMs;
    }

    public final long getNoProgressTimeoutMs() {
        return this.noProgressTimeoutMs;
    }

    public final long getBleWriteBusyRetryTimeoutMs() {
        return this.bleWriteBusyRetryTimeoutMs;
    }
}
