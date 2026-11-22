package com.wakeup.module.ai.utils;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.header.SubscriptionStateHeader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadPcmFrameSender.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fJ\u001a\u0010\u000e\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/ai/utils/VadPcmFrameSender;", "", "frameBytes", "", "<init>", "(I)V", SubscriptionStateHeader.PENDING, "", "appendAndSend", "", "data", "sendFrame", "Lkotlin/Function1;", "", "flushAndSend", SDPKeywords.CLEAR, "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VadPcmFrameSender {
    private static final int PCM_FRAME_BYTES = 640;
    private final int frameBytes;
    private byte[] pending;

    public VadPcmFrameSender() {
        this(0, 1, null);
    }

    public VadPcmFrameSender(int i) {
        this.frameBytes = i;
        this.pending = new byte[0];
        if (i <= 0) {
            throw new IllegalArgumentException("frameBytes must be > 0".toString());
        }
    }

    public /* synthetic */ VadPcmFrameSender(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 640 : i);
    }

    public final void appendAndSend(byte[] data, Function1<? super byte[], Boolean> sendFrame) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sendFrame, "sendFrame");
        if (data.length == 0) {
            return;
        }
        byte[] bArr2 = this.pending;
        int length = bArr2.length + data.length;
        byte[] bArr3 = new byte[length];
        ArraysKt.copyInto$default(bArr2, bArr3, 0, 0, 0, 14, (Object) null);
        ArraysKt.copyInto$default(data, bArr3, this.pending.length, 0, 0, 12, (Object) null);
        int i = 0;
        while (true) {
            int i2 = length - i;
            int i3 = this.frameBytes;
            if (i2 < i3) {
                break;
            }
            sendFrame.invoke(ArraysKt.copyOfRange(bArr3, i, i3 + i));
            i += this.frameBytes;
        }
        if (i < length) {
            bArr = ArraysKt.copyOfRange(bArr3, i, length);
        } else {
            bArr = new byte[0];
        }
        this.pending = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void flushAndSend(Function1<? super byte[], Boolean> sendFrame) {
        Intrinsics.checkNotNullParameter(sendFrame, "sendFrame");
        byte[] bArr = this.pending;
        if (bArr.length == 0) {
            return;
        }
        int length = bArr.length;
        int i = this.frameBytes;
        Object obj = bArr;
        if (length < i) {
            Object copyOf = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            obj = copyOf;
        }
        this.pending = new byte[0];
        sendFrame.invoke(obj);
    }

    public final void clear() {
        this.pending = new byte[0];
    }
}
