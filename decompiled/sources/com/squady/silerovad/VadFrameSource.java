package com.squady.silerovad;

import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VadSession.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/squady/silerovad/VadFrameSource;", "Ljava/io/Closeable;", "finish", "", "Lcom/squady/silerovad/OpusVadFrame;", "poll", "push", "audio", "", "offset", "", "length", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface VadFrameSource extends Closeable {
    List<OpusVadFrame> finish();

    List<OpusVadFrame> poll();

    List<OpusVadFrame> push(byte[] audio, int offset, int length);
}
