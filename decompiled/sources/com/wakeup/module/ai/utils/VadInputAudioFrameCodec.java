package com.wakeup.module.ai.utils;

import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;

/* compiled from: VadInputAudioFrameCodec.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec;", "", "protocol", "", "getProtocol", "()I", "encodeControl", "", "type", "timestampMs", "", "streamId", "", "encodeAudio", "payload", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VadInputAudioFrameCodec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_END = 4;
    public static final int TYPE_SILENCE = 2;
    public static final int TYPE_START = 3;

    byte[] encodeAudio(long timestampMs, short streamId, byte[] payload);

    byte[] encodeControl(int type, long timestampMs, short streamId);

    int getProtocol();

    /* compiled from: VadInputAudioFrameCodec.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec$Companion;", "", "<init>", "()V", "TYPE_AUDIO", "", "TYPE_SILENCE", "TYPE_START", "TYPE_END", "PROTOCOL_4", "Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec;", "getPROTOCOL_4", "()Lcom/wakeup/module/ai/utils/VadInputAudioFrameCodec;", "PROTOCOL_6", "getPROTOCOL_6", MapBundleKey.MapObjKey.OBJ_OFFSET, "protocol", "supportsStreamId", "", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final VadInputAudioFrameCodec PROTOCOL_4 = VadRawInputAudioFrameCodec.INSTANCE;
        private static final VadInputAudioFrameCodec PROTOCOL_6 = VadSingleLaneInputAudioFrameCodec.INSTANCE;
        public static final int TYPE_AUDIO = 1;
        public static final int TYPE_END = 4;
        public static final int TYPE_SILENCE = 2;
        public static final int TYPE_START = 3;

        public final boolean supportsStreamId(int protocol) {
            return protocol == 6;
        }

        private Companion() {
        }

        public final VadInputAudioFrameCodec getPROTOCOL_4() {
            return PROTOCOL_4;
        }

        public final VadInputAudioFrameCodec getPROTOCOL_6() {
            return PROTOCOL_6;
        }

        public final VadInputAudioFrameCodec of(int protocol) {
            if (protocol == 4) {
                return PROTOCOL_4;
            }
            if (protocol == 6) {
                return PROTOCOL_6;
            }
            throw new IllegalArgumentException("Unsupported VAD audio protocol: " + protocol);
        }
    }
}
