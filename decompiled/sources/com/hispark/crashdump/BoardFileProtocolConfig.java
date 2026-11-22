package com.hispark.crashdump;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\bd\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bá\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0007\u0012\b\b\u0002\u0010&\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\u0011\u0012\b\b\u0002\u0010(\u001a\u00020\u0011\u0012\b\b\u0002\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0007HÆ\u0003J\t\u0010W\u001a\u00020\u0007HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\t\u0010Y\u001a\u00020\u0007HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\t\u0010_\u001a\u00020\u0011HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\t\u0010a\u001a\u00020\u0014HÆ\u0003J\t\u0010b\u001a\u00020\u0014HÆ\u0003J\t\u0010c\u001a\u00020\u0014HÆ\u0003J\t\u0010d\u001a\u00020\u0014HÆ\u0003J\t\u0010e\u001a\u00020\u0011HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0011HÆ\u0003J\t\u0010i\u001a\u00020\u0011HÆ\u0003J\t\u0010j\u001a\u00020\u0011HÆ\u0003J\t\u0010k\u001a\u00020\u0007HÆ\u0003J\t\u0010l\u001a\u00020\u0007HÆ\u0003J\t\u0010m\u001a\u00020\u0011HÆ\u0003J\t\u0010n\u001a\u00020\u0011HÆ\u0003J\t\u0010o\u001a\u00020\u0007HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003J\t\u0010q\u001a\u00020\u0007HÆ\u0003J\t\u0010r\u001a\u00020\u0007HÆ\u0003J\t\u0010s\u001a\u00020\u0011HÆ\u0003J\t\u0010t\u001a\u00020\u0011HÆ\u0003J\t\u0010u\u001a\u00020\u0011HÆ\u0003J\t\u0010v\u001a\u00020\u0011HÆ\u0003Jç\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020\u00112\b\b\u0002\u0010(\u001a\u00020\u00112\b\b\u0002\u0010)\u001a\u00020\u0011HÆ\u0001J\u0013\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020\u0011HÖ\u0001J\t\u0010|\u001a\u00020}HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010;R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\u001b\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0011\u0010\u001d\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0011\u0010 \u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010;R\u0011\u0010!\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0011\u0010$\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0011\u0010%\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0011\u0010&\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bP\u0010;R\u0011\u0010'\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010;R\u0011\u0010(\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bR\u0010;R\u0011\u0010)\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bS\u0010;¨\u0006~"}, d2 = {"Lcom/hispark/crashdump/BoardFileProtocolConfig;", "", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "scratchRootDir", "Ljava/io/File;", "queryTimeoutMs", "", "queryIdleCompletionMs", "downloadTimeoutMs", "downloadTimeoutPaddingMs", "minDownloadRateBytesPerSecond", "postDownloadCompletionDelayMs", "negotiationAckTimeoutMs", "negotiationRetryStopDelayMs", "deleteAckTimeoutMs", "deleteMaxAttempts", "", "deleteRetryDelayMs", "bleBlockSize", "", "bleBlockNum", "classicBlockSize", "classicBlockNum", "replyTimeoutExtraMs", "replyWindowHardTimeoutMs", "staleTransferCleanupDelayMs", "maxSendFailCount", "remoteInvalidResumeMaxAttempts", "reconnectResumeMaxAttempts", "reconnectWaitTimeoutMs", "reconnectPollIntervalMs", "adaptiveMinWindowBlocks", "adaptiveWindowRecoverySuccessCount", "adaptiveRetryBackoffBaseMs", "adaptiveRetryBackoffMaxMs", "classicPartialReplyIdleTimeoutMs", "blePartialReplyIdleTimeoutMs", "bleAdaptiveMinWindowBlocks", "bleAdaptiveWindowRecoverySuccessCount", "replyAnomalyResyncThreshold", "replyAnomalyResumeMaxAttempts", "<init>", "(Lcom/hispark/crashdump/BoardLinkType;Ljava/io/File;JJJJJJJJJIJSSSSIJJIIIJJIIJJJJIIII)V", "getLinkType", "()Lcom/hispark/crashdump/BoardLinkType;", "getScratchRootDir", "()Ljava/io/File;", "getQueryTimeoutMs", "()J", "getQueryIdleCompletionMs", "getDownloadTimeoutMs", "getDownloadTimeoutPaddingMs", "getMinDownloadRateBytesPerSecond", "getPostDownloadCompletionDelayMs", "getNegotiationAckTimeoutMs", "getNegotiationRetryStopDelayMs", "getDeleteAckTimeoutMs", "getDeleteMaxAttempts", "()I", "getDeleteRetryDelayMs", "getBleBlockSize", "()S", "getBleBlockNum", "getClassicBlockSize", "getClassicBlockNum", "getReplyTimeoutExtraMs", "getReplyWindowHardTimeoutMs", "getStaleTransferCleanupDelayMs", "getMaxSendFailCount", "getRemoteInvalidResumeMaxAttempts", "getReconnectResumeMaxAttempts", "getReconnectWaitTimeoutMs", "getReconnectPollIntervalMs", "getAdaptiveMinWindowBlocks", "getAdaptiveWindowRecoverySuccessCount", "getAdaptiveRetryBackoffBaseMs", "getAdaptiveRetryBackoffMaxMs", "getClassicPartialReplyIdleTimeoutMs", "getBlePartialReplyIdleTimeoutMs", "getBleAdaptiveMinWindowBlocks", "getBleAdaptiveWindowRecoverySuccessCount", "getReplyAnomalyResyncThreshold", "getReplyAnomalyResumeMaxAttempts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoardFileProtocolConfig {
    private final int adaptiveMinWindowBlocks;
    private final long adaptiveRetryBackoffBaseMs;
    private final long adaptiveRetryBackoffMaxMs;
    private final int adaptiveWindowRecoverySuccessCount;
    private final int bleAdaptiveMinWindowBlocks;
    private final int bleAdaptiveWindowRecoverySuccessCount;
    private final short bleBlockNum;
    private final short bleBlockSize;
    private final long blePartialReplyIdleTimeoutMs;
    private final short classicBlockNum;
    private final short classicBlockSize;
    private final long classicPartialReplyIdleTimeoutMs;
    private final long deleteAckTimeoutMs;
    private final int deleteMaxAttempts;
    private final long deleteRetryDelayMs;
    private final long downloadTimeoutMs;
    private final long downloadTimeoutPaddingMs;
    private final BoardLinkType linkType;
    private final int maxSendFailCount;
    private final long minDownloadRateBytesPerSecond;
    private final long negotiationAckTimeoutMs;
    private final long negotiationRetryStopDelayMs;
    private final long postDownloadCompletionDelayMs;
    private final long queryIdleCompletionMs;
    private final long queryTimeoutMs;
    private final long reconnectPollIntervalMs;
    private final int reconnectResumeMaxAttempts;
    private final long reconnectWaitTimeoutMs;
    private final int remoteInvalidResumeMaxAttempts;
    private final int replyAnomalyResumeMaxAttempts;
    private final int replyAnomalyResyncThreshold;
    private final int replyTimeoutExtraMs;
    private final long replyWindowHardTimeoutMs;
    private final File scratchRootDir;
    private final long staleTransferCleanupDelayMs;

    public static /* synthetic */ BoardFileProtocolConfig copy$default(BoardFileProtocolConfig boardFileProtocolConfig, BoardLinkType boardLinkType, File file, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, long j10, short s, short s2, short s3, short s4, int i2, long j11, long j12, int i3, int i4, int i5, long j13, long j14, int i6, int i7, long j15, long j16, long j17, long j18, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        int i14;
        int i15;
        BoardLinkType boardLinkType2 = (i12 & 1) != 0 ? boardFileProtocolConfig.linkType : boardLinkType;
        File file2 = (i12 & 2) != 0 ? boardFileProtocolConfig.scratchRootDir : file;
        long j19 = (i12 & 4) != 0 ? boardFileProtocolConfig.queryTimeoutMs : j;
        long j20 = (i12 & 8) != 0 ? boardFileProtocolConfig.queryIdleCompletionMs : j2;
        long j21 = (i12 & 16) != 0 ? boardFileProtocolConfig.downloadTimeoutMs : j3;
        long j22 = (i12 & 32) != 0 ? boardFileProtocolConfig.downloadTimeoutPaddingMs : j4;
        long j23 = (i12 & 64) != 0 ? boardFileProtocolConfig.minDownloadRateBytesPerSecond : j5;
        long j24 = (i12 & 128) != 0 ? boardFileProtocolConfig.postDownloadCompletionDelayMs : j6;
        BoardLinkType boardLinkType3 = boardLinkType2;
        File file3 = file2;
        long j25 = (i12 & 256) != 0 ? boardFileProtocolConfig.negotiationAckTimeoutMs : j7;
        long j26 = (i12 & 512) != 0 ? boardFileProtocolConfig.negotiationRetryStopDelayMs : j8;
        long j27 = (i12 & 1024) != 0 ? boardFileProtocolConfig.deleteAckTimeoutMs : j9;
        int i16 = (i12 & 2048) != 0 ? boardFileProtocolConfig.deleteMaxAttempts : i;
        long j28 = (i12 & 4096) != 0 ? boardFileProtocolConfig.deleteRetryDelayMs : j10;
        short s5 = (i12 & 8192) != 0 ? boardFileProtocolConfig.bleBlockSize : s;
        short s6 = (i12 & 16384) != 0 ? boardFileProtocolConfig.bleBlockNum : s2;
        short s7 = (i12 & 32768) != 0 ? boardFileProtocolConfig.classicBlockSize : s3;
        short s8 = (i12 & 65536) != 0 ? boardFileProtocolConfig.classicBlockNum : s4;
        int i17 = (i12 & 131072) != 0 ? boardFileProtocolConfig.replyTimeoutExtraMs : i2;
        short s9 = s5;
        long j29 = (i12 & 262144) != 0 ? boardFileProtocolConfig.replyWindowHardTimeoutMs : j11;
        long j30 = (i12 & 524288) != 0 ? boardFileProtocolConfig.staleTransferCleanupDelayMs : j12;
        int i18 = (i12 & 1048576) != 0 ? boardFileProtocolConfig.maxSendFailCount : i3;
        int i19 = (i12 & 2097152) != 0 ? boardFileProtocolConfig.remoteInvalidResumeMaxAttempts : i4;
        int i20 = i18;
        int i21 = (i12 & 4194304) != 0 ? boardFileProtocolConfig.reconnectResumeMaxAttempts : i5;
        int i22 = i19;
        long j31 = (i12 & 8388608) != 0 ? boardFileProtocolConfig.reconnectWaitTimeoutMs : j13;
        long j32 = (i12 & 16777216) != 0 ? boardFileProtocolConfig.reconnectPollIntervalMs : j14;
        int i23 = (i12 & 33554432) != 0 ? boardFileProtocolConfig.adaptiveMinWindowBlocks : i6;
        int i24 = (i12 & 67108864) != 0 ? boardFileProtocolConfig.adaptiveWindowRecoverySuccessCount : i7;
        long j33 = (i12 & 134217728) != 0 ? boardFileProtocolConfig.adaptiveRetryBackoffBaseMs : j15;
        long j34 = (i12 & 268435456) != 0 ? boardFileProtocolConfig.adaptiveRetryBackoffMaxMs : j16;
        long j35 = (i12 & 536870912) != 0 ? boardFileProtocolConfig.classicPartialReplyIdleTimeoutMs : j17;
        long j36 = (i12 & 1073741824) != 0 ? boardFileProtocolConfig.blePartialReplyIdleTimeoutMs : j18;
        int i25 = (i12 & Integer.MIN_VALUE) != 0 ? boardFileProtocolConfig.bleAdaptiveMinWindowBlocks : i8;
        int i26 = (i13 & 1) != 0 ? boardFileProtocolConfig.bleAdaptiveWindowRecoverySuccessCount : i9;
        int i27 = i25;
        int i28 = (i13 & 2) != 0 ? boardFileProtocolConfig.replyAnomalyResyncThreshold : i10;
        if ((i13 & 4) != 0) {
            i15 = i28;
            i14 = boardFileProtocolConfig.replyAnomalyResumeMaxAttempts;
        } else {
            i14 = i11;
            i15 = i28;
        }
        return boardFileProtocolConfig.copy(boardLinkType3, file3, j19, j20, j21, j22, j23, j24, j25, j26, j27, i16, j28, s9, s6, s7, s8, i17, j29, j30, i20, i22, i21, j31, j32, i23, i24, j33, j34, j35, j36, i27, i26, i15, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final BoardLinkType getLinkType() {
        return this.linkType;
    }

    /* renamed from: component10, reason: from getter */
    public final long getNegotiationRetryStopDelayMs() {
        return this.negotiationRetryStopDelayMs;
    }

    /* renamed from: component11, reason: from getter */
    public final long getDeleteAckTimeoutMs() {
        return this.deleteAckTimeoutMs;
    }

    /* renamed from: component12, reason: from getter */
    public final int getDeleteMaxAttempts() {
        return this.deleteMaxAttempts;
    }

    /* renamed from: component13, reason: from getter */
    public final long getDeleteRetryDelayMs() {
        return this.deleteRetryDelayMs;
    }

    /* renamed from: component14, reason: from getter */
    public final short getBleBlockSize() {
        return this.bleBlockSize;
    }

    /* renamed from: component15, reason: from getter */
    public final short getBleBlockNum() {
        return this.bleBlockNum;
    }

    /* renamed from: component16, reason: from getter */
    public final short getClassicBlockSize() {
        return this.classicBlockSize;
    }

    /* renamed from: component17, reason: from getter */
    public final short getClassicBlockNum() {
        return this.classicBlockNum;
    }

    /* renamed from: component18, reason: from getter */
    public final int getReplyTimeoutExtraMs() {
        return this.replyTimeoutExtraMs;
    }

    /* renamed from: component19, reason: from getter */
    public final long getReplyWindowHardTimeoutMs() {
        return this.replyWindowHardTimeoutMs;
    }

    /* renamed from: component2, reason: from getter */
    public final File getScratchRootDir() {
        return this.scratchRootDir;
    }

    /* renamed from: component20, reason: from getter */
    public final long getStaleTransferCleanupDelayMs() {
        return this.staleTransferCleanupDelayMs;
    }

    /* renamed from: component21, reason: from getter */
    public final int getMaxSendFailCount() {
        return this.maxSendFailCount;
    }

    /* renamed from: component22, reason: from getter */
    public final int getRemoteInvalidResumeMaxAttempts() {
        return this.remoteInvalidResumeMaxAttempts;
    }

    /* renamed from: component23, reason: from getter */
    public final int getReconnectResumeMaxAttempts() {
        return this.reconnectResumeMaxAttempts;
    }

    /* renamed from: component24, reason: from getter */
    public final long getReconnectWaitTimeoutMs() {
        return this.reconnectWaitTimeoutMs;
    }

    /* renamed from: component25, reason: from getter */
    public final long getReconnectPollIntervalMs() {
        return this.reconnectPollIntervalMs;
    }

    /* renamed from: component26, reason: from getter */
    public final int getAdaptiveMinWindowBlocks() {
        return this.adaptiveMinWindowBlocks;
    }

    /* renamed from: component27, reason: from getter */
    public final int getAdaptiveWindowRecoverySuccessCount() {
        return this.adaptiveWindowRecoverySuccessCount;
    }

    /* renamed from: component28, reason: from getter */
    public final long getAdaptiveRetryBackoffBaseMs() {
        return this.adaptiveRetryBackoffBaseMs;
    }

    /* renamed from: component29, reason: from getter */
    public final long getAdaptiveRetryBackoffMaxMs() {
        return this.adaptiveRetryBackoffMaxMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getQueryTimeoutMs() {
        return this.queryTimeoutMs;
    }

    /* renamed from: component30, reason: from getter */
    public final long getClassicPartialReplyIdleTimeoutMs() {
        return this.classicPartialReplyIdleTimeoutMs;
    }

    /* renamed from: component31, reason: from getter */
    public final long getBlePartialReplyIdleTimeoutMs() {
        return this.blePartialReplyIdleTimeoutMs;
    }

    /* renamed from: component32, reason: from getter */
    public final int getBleAdaptiveMinWindowBlocks() {
        return this.bleAdaptiveMinWindowBlocks;
    }

    /* renamed from: component33, reason: from getter */
    public final int getBleAdaptiveWindowRecoverySuccessCount() {
        return this.bleAdaptiveWindowRecoverySuccessCount;
    }

    /* renamed from: component34, reason: from getter */
    public final int getReplyAnomalyResyncThreshold() {
        return this.replyAnomalyResyncThreshold;
    }

    /* renamed from: component35, reason: from getter */
    public final int getReplyAnomalyResumeMaxAttempts() {
        return this.replyAnomalyResumeMaxAttempts;
    }

    /* renamed from: component4, reason: from getter */
    public final long getQueryIdleCompletionMs() {
        return this.queryIdleCompletionMs;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDownloadTimeoutMs() {
        return this.downloadTimeoutMs;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDownloadTimeoutPaddingMs() {
        return this.downloadTimeoutPaddingMs;
    }

    /* renamed from: component7, reason: from getter */
    public final long getMinDownloadRateBytesPerSecond() {
        return this.minDownloadRateBytesPerSecond;
    }

    /* renamed from: component8, reason: from getter */
    public final long getPostDownloadCompletionDelayMs() {
        return this.postDownloadCompletionDelayMs;
    }

    /* renamed from: component9, reason: from getter */
    public final long getNegotiationAckTimeoutMs() {
        return this.negotiationAckTimeoutMs;
    }

    public final BoardFileProtocolConfig copy(BoardLinkType linkType, File scratchRootDir, long queryTimeoutMs, long queryIdleCompletionMs, long downloadTimeoutMs, long downloadTimeoutPaddingMs, long minDownloadRateBytesPerSecond, long postDownloadCompletionDelayMs, long negotiationAckTimeoutMs, long negotiationRetryStopDelayMs, long deleteAckTimeoutMs, int deleteMaxAttempts, long deleteRetryDelayMs, short bleBlockSize, short bleBlockNum, short classicBlockSize, short classicBlockNum, int replyTimeoutExtraMs, long replyWindowHardTimeoutMs, long staleTransferCleanupDelayMs, int maxSendFailCount, int remoteInvalidResumeMaxAttempts, int reconnectResumeMaxAttempts, long reconnectWaitTimeoutMs, long reconnectPollIntervalMs, int adaptiveMinWindowBlocks, int adaptiveWindowRecoverySuccessCount, long adaptiveRetryBackoffBaseMs, long adaptiveRetryBackoffMaxMs, long classicPartialReplyIdleTimeoutMs, long blePartialReplyIdleTimeoutMs, int bleAdaptiveMinWindowBlocks, int bleAdaptiveWindowRecoverySuccessCount, int replyAnomalyResyncThreshold, int replyAnomalyResumeMaxAttempts) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(scratchRootDir, "scratchRootDir");
        return new BoardFileProtocolConfig(linkType, scratchRootDir, queryTimeoutMs, queryIdleCompletionMs, downloadTimeoutMs, downloadTimeoutPaddingMs, minDownloadRateBytesPerSecond, postDownloadCompletionDelayMs, negotiationAckTimeoutMs, negotiationRetryStopDelayMs, deleteAckTimeoutMs, deleteMaxAttempts, deleteRetryDelayMs, bleBlockSize, bleBlockNum, classicBlockSize, classicBlockNum, replyTimeoutExtraMs, replyWindowHardTimeoutMs, staleTransferCleanupDelayMs, maxSendFailCount, remoteInvalidResumeMaxAttempts, reconnectResumeMaxAttempts, reconnectWaitTimeoutMs, reconnectPollIntervalMs, adaptiveMinWindowBlocks, adaptiveWindowRecoverySuccessCount, adaptiveRetryBackoffBaseMs, adaptiveRetryBackoffMaxMs, classicPartialReplyIdleTimeoutMs, blePartialReplyIdleTimeoutMs, bleAdaptiveMinWindowBlocks, bleAdaptiveWindowRecoverySuccessCount, replyAnomalyResyncThreshold, replyAnomalyResumeMaxAttempts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardFileProtocolConfig)) {
            return false;
        }
        BoardFileProtocolConfig boardFileProtocolConfig = (BoardFileProtocolConfig) other;
        return this.linkType == boardFileProtocolConfig.linkType && Intrinsics.areEqual(this.scratchRootDir, boardFileProtocolConfig.scratchRootDir) && this.queryTimeoutMs == boardFileProtocolConfig.queryTimeoutMs && this.queryIdleCompletionMs == boardFileProtocolConfig.queryIdleCompletionMs && this.downloadTimeoutMs == boardFileProtocolConfig.downloadTimeoutMs && this.downloadTimeoutPaddingMs == boardFileProtocolConfig.downloadTimeoutPaddingMs && this.minDownloadRateBytesPerSecond == boardFileProtocolConfig.minDownloadRateBytesPerSecond && this.postDownloadCompletionDelayMs == boardFileProtocolConfig.postDownloadCompletionDelayMs && this.negotiationAckTimeoutMs == boardFileProtocolConfig.negotiationAckTimeoutMs && this.negotiationRetryStopDelayMs == boardFileProtocolConfig.negotiationRetryStopDelayMs && this.deleteAckTimeoutMs == boardFileProtocolConfig.deleteAckTimeoutMs && this.deleteMaxAttempts == boardFileProtocolConfig.deleteMaxAttempts && this.deleteRetryDelayMs == boardFileProtocolConfig.deleteRetryDelayMs && this.bleBlockSize == boardFileProtocolConfig.bleBlockSize && this.bleBlockNum == boardFileProtocolConfig.bleBlockNum && this.classicBlockSize == boardFileProtocolConfig.classicBlockSize && this.classicBlockNum == boardFileProtocolConfig.classicBlockNum && this.replyTimeoutExtraMs == boardFileProtocolConfig.replyTimeoutExtraMs && this.replyWindowHardTimeoutMs == boardFileProtocolConfig.replyWindowHardTimeoutMs && this.staleTransferCleanupDelayMs == boardFileProtocolConfig.staleTransferCleanupDelayMs && this.maxSendFailCount == boardFileProtocolConfig.maxSendFailCount && this.remoteInvalidResumeMaxAttempts == boardFileProtocolConfig.remoteInvalidResumeMaxAttempts && this.reconnectResumeMaxAttempts == boardFileProtocolConfig.reconnectResumeMaxAttempts && this.reconnectWaitTimeoutMs == boardFileProtocolConfig.reconnectWaitTimeoutMs && this.reconnectPollIntervalMs == boardFileProtocolConfig.reconnectPollIntervalMs && this.adaptiveMinWindowBlocks == boardFileProtocolConfig.adaptiveMinWindowBlocks && this.adaptiveWindowRecoverySuccessCount == boardFileProtocolConfig.adaptiveWindowRecoverySuccessCount && this.adaptiveRetryBackoffBaseMs == boardFileProtocolConfig.adaptiveRetryBackoffBaseMs && this.adaptiveRetryBackoffMaxMs == boardFileProtocolConfig.adaptiveRetryBackoffMaxMs && this.classicPartialReplyIdleTimeoutMs == boardFileProtocolConfig.classicPartialReplyIdleTimeoutMs && this.blePartialReplyIdleTimeoutMs == boardFileProtocolConfig.blePartialReplyIdleTimeoutMs && this.bleAdaptiveMinWindowBlocks == boardFileProtocolConfig.bleAdaptiveMinWindowBlocks && this.bleAdaptiveWindowRecoverySuccessCount == boardFileProtocolConfig.bleAdaptiveWindowRecoverySuccessCount && this.replyAnomalyResyncThreshold == boardFileProtocolConfig.replyAnomalyResyncThreshold && this.replyAnomalyResumeMaxAttempts == boardFileProtocolConfig.replyAnomalyResumeMaxAttempts;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.linkType.hashCode() * 31) + this.scratchRootDir.hashCode()) * 31) + Long.hashCode(this.queryTimeoutMs)) * 31) + Long.hashCode(this.queryIdleCompletionMs)) * 31) + Long.hashCode(this.downloadTimeoutMs)) * 31) + Long.hashCode(this.downloadTimeoutPaddingMs)) * 31) + Long.hashCode(this.minDownloadRateBytesPerSecond)) * 31) + Long.hashCode(this.postDownloadCompletionDelayMs)) * 31) + Long.hashCode(this.negotiationAckTimeoutMs)) * 31) + Long.hashCode(this.negotiationRetryStopDelayMs)) * 31) + Long.hashCode(this.deleteAckTimeoutMs)) * 31) + Integer.hashCode(this.deleteMaxAttempts)) * 31) + Long.hashCode(this.deleteRetryDelayMs)) * 31) + Short.hashCode(this.bleBlockSize)) * 31) + Short.hashCode(this.bleBlockNum)) * 31) + Short.hashCode(this.classicBlockSize)) * 31) + Short.hashCode(this.classicBlockNum)) * 31) + Integer.hashCode(this.replyTimeoutExtraMs)) * 31) + Long.hashCode(this.replyWindowHardTimeoutMs)) * 31) + Long.hashCode(this.staleTransferCleanupDelayMs)) * 31) + Integer.hashCode(this.maxSendFailCount)) * 31) + Integer.hashCode(this.remoteInvalidResumeMaxAttempts)) * 31) + Integer.hashCode(this.reconnectResumeMaxAttempts)) * 31) + Long.hashCode(this.reconnectWaitTimeoutMs)) * 31) + Long.hashCode(this.reconnectPollIntervalMs)) * 31) + Integer.hashCode(this.adaptiveMinWindowBlocks)) * 31) + Integer.hashCode(this.adaptiveWindowRecoverySuccessCount)) * 31) + Long.hashCode(this.adaptiveRetryBackoffBaseMs)) * 31) + Long.hashCode(this.adaptiveRetryBackoffMaxMs)) * 31) + Long.hashCode(this.classicPartialReplyIdleTimeoutMs)) * 31) + Long.hashCode(this.blePartialReplyIdleTimeoutMs)) * 31) + Integer.hashCode(this.bleAdaptiveMinWindowBlocks)) * 31) + Integer.hashCode(this.bleAdaptiveWindowRecoverySuccessCount)) * 31) + Integer.hashCode(this.replyAnomalyResyncThreshold)) * 31) + Integer.hashCode(this.replyAnomalyResumeMaxAttempts);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BoardFileProtocolConfig(linkType=");
        sb.append(this.linkType).append(", scratchRootDir=").append(this.scratchRootDir).append(", queryTimeoutMs=").append(this.queryTimeoutMs).append(", queryIdleCompletionMs=").append(this.queryIdleCompletionMs).append(", downloadTimeoutMs=").append(this.downloadTimeoutMs).append(", downloadTimeoutPaddingMs=").append(this.downloadTimeoutPaddingMs).append(", minDownloadRateBytesPerSecond=").append(this.minDownloadRateBytesPerSecond).append(", postDownloadCompletionDelayMs=").append(this.postDownloadCompletionDelayMs).append(", negotiationAckTimeoutMs=").append(this.negotiationAckTimeoutMs).append(", negotiationRetryStopDelayMs=").append(this.negotiationRetryStopDelayMs).append(", deleteAckTimeoutMs=").append(this.deleteAckTimeoutMs).append(", deleteMaxAttempts=");
        sb.append(this.deleteMaxAttempts).append(", deleteRetryDelayMs=").append(this.deleteRetryDelayMs).append(", bleBlockSize=").append((int) this.bleBlockSize).append(", bleBlockNum=").append((int) this.bleBlockNum).append(", classicBlockSize=").append((int) this.classicBlockSize).append(", classicBlockNum=").append((int) this.classicBlockNum).append(", replyTimeoutExtraMs=").append(this.replyTimeoutExtraMs).append(", replyWindowHardTimeoutMs=").append(this.replyWindowHardTimeoutMs).append(", staleTransferCleanupDelayMs=").append(this.staleTransferCleanupDelayMs).append(", maxSendFailCount=").append(this.maxSendFailCount).append(", remoteInvalidResumeMaxAttempts=").append(this.remoteInvalidResumeMaxAttempts).append(", reconnectResumeMaxAttempts=").append(this.reconnectResumeMaxAttempts);
        sb.append(", reconnectWaitTimeoutMs=").append(this.reconnectWaitTimeoutMs).append(", reconnectPollIntervalMs=").append(this.reconnectPollIntervalMs).append(", adaptiveMinWindowBlocks=").append(this.adaptiveMinWindowBlocks).append(", adaptiveWindowRecoverySuccessCount=").append(this.adaptiveWindowRecoverySuccessCount).append(", adaptiveRetryBackoffBaseMs=").append(this.adaptiveRetryBackoffBaseMs).append(", adaptiveRetryBackoffMaxMs=").append(this.adaptiveRetryBackoffMaxMs).append(", classicPartialReplyIdleTimeoutMs=").append(this.classicPartialReplyIdleTimeoutMs).append(", blePartialReplyIdleTimeoutMs=").append(this.blePartialReplyIdleTimeoutMs).append(", bleAdaptiveMinWindowBlocks=").append(this.bleAdaptiveMinWindowBlocks).append(", bleAdaptiveWindowRecoverySuccessCount=").append(this.bleAdaptiveWindowRecoverySuccessCount).append(", replyAnomalyResyncThreshold=").append(this.replyAnomalyResyncThreshold).append(", replyAnomalyResumeMaxAttempts=");
        sb.append(this.replyAnomalyResumeMaxAttempts).append(')');
        return sb.toString();
    }

    public BoardFileProtocolConfig(BoardLinkType linkType, File scratchRootDir, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, long j10, short s, short s2, short s3, short s4, int i2, long j11, long j12, int i3, int i4, int i5, long j13, long j14, int i6, int i7, long j15, long j16, long j17, long j18, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(scratchRootDir, "scratchRootDir");
        this.linkType = linkType;
        this.scratchRootDir = scratchRootDir;
        this.queryTimeoutMs = j;
        this.queryIdleCompletionMs = j2;
        this.downloadTimeoutMs = j3;
        this.downloadTimeoutPaddingMs = j4;
        this.minDownloadRateBytesPerSecond = j5;
        this.postDownloadCompletionDelayMs = j6;
        this.negotiationAckTimeoutMs = j7;
        this.negotiationRetryStopDelayMs = j8;
        this.deleteAckTimeoutMs = j9;
        this.deleteMaxAttempts = i;
        this.deleteRetryDelayMs = j10;
        this.bleBlockSize = s;
        this.bleBlockNum = s2;
        this.classicBlockSize = s3;
        this.classicBlockNum = s4;
        this.replyTimeoutExtraMs = i2;
        this.replyWindowHardTimeoutMs = j11;
        this.staleTransferCleanupDelayMs = j12;
        this.maxSendFailCount = i3;
        this.remoteInvalidResumeMaxAttempts = i4;
        this.reconnectResumeMaxAttempts = i5;
        this.reconnectWaitTimeoutMs = j13;
        this.reconnectPollIntervalMs = j14;
        this.adaptiveMinWindowBlocks = i6;
        this.adaptiveWindowRecoverySuccessCount = i7;
        this.adaptiveRetryBackoffBaseMs = j15;
        this.adaptiveRetryBackoffMaxMs = j16;
        this.classicPartialReplyIdleTimeoutMs = j17;
        this.blePartialReplyIdleTimeoutMs = j18;
        this.bleAdaptiveMinWindowBlocks = i8;
        this.bleAdaptiveWindowRecoverySuccessCount = i9;
        this.replyAnomalyResyncThreshold = i10;
        this.replyAnomalyResumeMaxAttempts = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BoardFileProtocolConfig(com.hispark.crashdump.BoardLinkType r51, java.io.File r52, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, long r69, int r71, long r72, short r74, short r75, short r76, short r77, int r78, long r79, long r81, int r83, int r84, int r85, long r86, long r88, int r90, int r91, long r92, long r94, long r96, long r98, int r100, int r101, int r102, int r103, int r104, int r105, kotlin.jvm.internal.DefaultConstructorMarker r106) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.crashdump.BoardFileProtocolConfig.<init>(com.hispark.crashdump.BoardLinkType, java.io.File, long, long, long, long, long, long, long, long, long, int, long, short, short, short, short, int, long, long, int, int, int, long, long, int, int, long, long, long, long, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BoardLinkType getLinkType() {
        return this.linkType;
    }

    public final File getScratchRootDir() {
        return this.scratchRootDir;
    }

    public final long getQueryTimeoutMs() {
        return this.queryTimeoutMs;
    }

    public final long getQueryIdleCompletionMs() {
        return this.queryIdleCompletionMs;
    }

    public final long getDownloadTimeoutMs() {
        return this.downloadTimeoutMs;
    }

    public final long getDownloadTimeoutPaddingMs() {
        return this.downloadTimeoutPaddingMs;
    }

    public final long getMinDownloadRateBytesPerSecond() {
        return this.minDownloadRateBytesPerSecond;
    }

    public final long getPostDownloadCompletionDelayMs() {
        return this.postDownloadCompletionDelayMs;
    }

    public final long getNegotiationAckTimeoutMs() {
        return this.negotiationAckTimeoutMs;
    }

    public final long getNegotiationRetryStopDelayMs() {
        return this.negotiationRetryStopDelayMs;
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

    public final short getBleBlockSize() {
        return this.bleBlockSize;
    }

    public final short getBleBlockNum() {
        return this.bleBlockNum;
    }

    public final short getClassicBlockSize() {
        return this.classicBlockSize;
    }

    public final short getClassicBlockNum() {
        return this.classicBlockNum;
    }

    public final int getReplyTimeoutExtraMs() {
        return this.replyTimeoutExtraMs;
    }

    public final long getReplyWindowHardTimeoutMs() {
        return this.replyWindowHardTimeoutMs;
    }

    public final long getStaleTransferCleanupDelayMs() {
        return this.staleTransferCleanupDelayMs;
    }

    public final int getMaxSendFailCount() {
        return this.maxSendFailCount;
    }

    public final int getRemoteInvalidResumeMaxAttempts() {
        return this.remoteInvalidResumeMaxAttempts;
    }

    public final int getReconnectResumeMaxAttempts() {
        return this.reconnectResumeMaxAttempts;
    }

    public final long getReconnectWaitTimeoutMs() {
        return this.reconnectWaitTimeoutMs;
    }

    public final long getReconnectPollIntervalMs() {
        return this.reconnectPollIntervalMs;
    }

    public final int getAdaptiveMinWindowBlocks() {
        return this.adaptiveMinWindowBlocks;
    }

    public final int getAdaptiveWindowRecoverySuccessCount() {
        return this.adaptiveWindowRecoverySuccessCount;
    }

    public final long getAdaptiveRetryBackoffBaseMs() {
        return this.adaptiveRetryBackoffBaseMs;
    }

    public final long getAdaptiveRetryBackoffMaxMs() {
        return this.adaptiveRetryBackoffMaxMs;
    }

    public final long getClassicPartialReplyIdleTimeoutMs() {
        return this.classicPartialReplyIdleTimeoutMs;
    }

    public final long getBlePartialReplyIdleTimeoutMs() {
        return this.blePartialReplyIdleTimeoutMs;
    }

    public final int getBleAdaptiveMinWindowBlocks() {
        return this.bleAdaptiveMinWindowBlocks;
    }

    public final int getBleAdaptiveWindowRecoverySuccessCount() {
        return this.bleAdaptiveWindowRecoverySuccessCount;
    }

    public final int getReplyAnomalyResyncThreshold() {
        return this.replyAnomalyResyncThreshold;
    }

    public final int getReplyAnomalyResumeMaxAttempts() {
        return this.replyAnomalyResumeMaxAttempts;
    }
}
