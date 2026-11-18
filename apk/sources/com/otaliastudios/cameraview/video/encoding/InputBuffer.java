package com.otaliastudios.cameraview.video.encoding;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class InputBuffer {
    public ByteBuffer data;
    public int index;
    public boolean isEndOfStream;
    public int length;
    public ByteBuffer source;
    public long timestamp;
}
