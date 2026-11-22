package androidx.media3.extractor.text;

import androidx.media3.decoder.Decoder;

/* loaded from: classes10.dex */
public interface SubtitleDecoder extends Decoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> {
    void setPositionUs(long j);
}
