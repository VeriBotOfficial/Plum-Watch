package org.easydarwin.audio;

/* loaded from: classes6.dex */
public class AudioCodec {
    public static native void close(long j);

    public static native long create(int i, int i2, int i3, int i4);

    public static native int decode(long j, byte[] bArr, int i, int i2, byte[] bArr2, int[] iArr);

    static {
        System.loadLibrary("proffmpeg");
        System.loadLibrary("AudioCodecer");
    }
}
