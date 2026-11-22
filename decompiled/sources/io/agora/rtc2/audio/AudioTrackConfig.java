package io.agora.rtc2.audio;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AudioTrackConfig {
    public boolean enableLocalPlayback = true;
    public boolean enableAudioProcessing = false;

    public String toString() {
        return "AudioTrackConfig{enableLocalPlayback=" + this.enableLocalPlayback + "enableAudioProcessing" + this.enableAudioProcessing + AbstractJsonLexerKt.END_OBJ;
    }
}
