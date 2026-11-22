package com.wakeup.module.ai.utils;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.header.SubscriptionStateHeader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PcmFrameSender.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014J\u001a\u0010\u0016\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014J\u0006\u0010\u0017\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/ai/utils/PcmFrameSender;", "", "streamId", "", "encodeFrame", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "timestampMs", "", "payload", "<init>", "(SLkotlin/jvm/functions/Function2;)V", SubscriptionStateHeader.PENDING, "pendingTimestampMs", "appendAndSend", "", "data", "sendFrame", "Lkotlin/Function1;", "", "flushAndSend", SDPKeywords.CLEAR, "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PcmFrameSender {
    public static final long PCM_FRAME_DURATION_MS = 20;
    public static final int PCM_FRAME_PAYLOAD_SIZE = 640;
    private final Function2<Long, byte[], byte[]> encodeFrame;
    private byte[] pending;
    private long pendingTimestampMs;
    private final short streamId;

    /* JADX WARN: Multi-variable type inference failed */
    public PcmFrameSender(short s, Function2<? super Long, ? super byte[], byte[]> encodeFrame) {
        Intrinsics.checkNotNullParameter(encodeFrame, "encodeFrame");
        this.streamId = s;
        this.encodeFrame = encodeFrame;
        this.pending = new byte[0];
    }

    public final void appendAndSend(byte[] data, long timestampMs, Function1<? super byte[], Boolean> sendFrame) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sendFrame, "sendFrame");
        if (data.length == 0) {
            return;
        }
        byte[] bArr2 = this.pending;
        if (bArr2.length == 0) {
            this.pendingTimestampMs = timestampMs;
        }
        int length = bArr2.length + data.length;
        byte[] bArr3 = new byte[length];
        ArraysKt.copyInto$default(bArr2, bArr3, 0, 0, 0, 14, (Object) null);
        ArraysKt.copyInto$default(data, bArr3, this.pending.length, 0, 0, 12, (Object) null);
        long j = this.pendingTimestampMs;
        int i = 0;
        while (length - i >= 640) {
            int i2 = i + 640;
            sendFrame.invoke(this.encodeFrame.invoke(Long.valueOf(j), ArraysKt.copyOfRange(bArr3, i, i2)));
            j += 20;
            i = i2;
        }
        if (i < length) {
            bArr = ArraysKt.copyOfRange(bArr3, i, length);
        } else {
            bArr = new byte[0];
        }
        this.pending = bArr;
        this.pendingTimestampMs = j;
    }

    public final void flushAndSend(Function1<? super byte[], Boolean> sendFrame) {
        Intrinsics.checkNotNullParameter(sendFrame, "sendFrame");
        byte[] bArr = this.pending;
        if (bArr.length == 0) {
            return;
        }
        if (bArr.length < 640) {
            bArr = Arrays.copyOf(bArr, 640);
            Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
        }
        long j = this.pendingTimestampMs;
        clear();
        sendFrame.invoke(this.encodeFrame.invoke(Long.valueOf(j), bArr));
    }

    public final void clear() {
        this.pending = new byte[0];
        this.pendingTimestampMs = 0L;
    }
}
