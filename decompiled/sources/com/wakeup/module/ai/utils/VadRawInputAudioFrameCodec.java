package com.wakeup.module.ai.utils;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VadRawInputAudioFrameCodec.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/module/ai/utils/VadRawInputAudioFrameCodec;", "Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec;", "<init>", "()V", "PROTOCOL", "", "TYPE_AUDIO", "TYPE_SILENCE", "TYPE_START", "TYPE_END", "protocol", "getProtocol", "()I", "encode", "", "type", "audioData", "encodeControl", "timestampMs", "", "streamId", "", "encodeAudio", "payload", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VadRawInputAudioFrameCodec implements VadInputAudioFrameCodec {
    public static final VadRawInputAudioFrameCodec INSTANCE = new VadRawInputAudioFrameCodec();
    public static final int PROTOCOL = 4;
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_END = 4;
    public static final int TYPE_SILENCE = 2;
    public static final int TYPE_START = 3;

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public int getProtocol() {
        return 4;
    }

    private VadRawInputAudioFrameCodec() {
    }

    public static /* synthetic */ byte[] encode$default(VadRawInputAudioFrameCodec vadRawInputAudioFrameCodec, int i, byte[] bArr, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bArr = new byte[0];
        }
        return vadRawInputAudioFrameCodec.encode(i, bArr);
    }

    public final byte[] encode(int type, byte[] audioData) {
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        if (1 > type || type >= 5) {
            throw new IllegalArgumentException(("Unsupported VAD input frame type: " + type).toString());
        }
        byte[] bArr = new byte[audioData.length + 1];
        bArr[0] = (byte) type;
        ArraysKt.copyInto$default(audioData, bArr, 1, 0, 0, 12, (Object) null);
        return bArr;
    }

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public byte[] encodeControl(int type, long timestampMs, short streamId) {
        return encode$default(this, type, null, 2, null);
    }

    @Override // com.wakeup.module.ai.utils.VadInputAudioFrameCodec
    public byte[] encodeAudio(long timestampMs, short streamId, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return encode(1, payload);
    }
}
