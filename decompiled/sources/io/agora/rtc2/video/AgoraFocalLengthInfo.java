package io.agora.rtc2.video;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AgoraFocalLengthInfo {
    public int cameraDirection;
    public int focalLengthType;

    public AgoraFocalLengthInfo(int cameraDirection, int focalLengthType) {
        this.cameraDirection = cameraDirection;
        this.focalLengthType = focalLengthType;
    }

    public String toString() {
        return "AgoraFocalLengthInfo{cameraDirection=" + this.cameraDirection + ", focalLengthType=" + this.focalLengthType + AbstractJsonLexerKt.END_OBJ;
    }
}
