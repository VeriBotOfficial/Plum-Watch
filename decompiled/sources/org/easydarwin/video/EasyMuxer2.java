package org.easydarwin.video;

/* loaded from: classes6.dex */
public class EasyMuxer2 {
    public static final int AVMEDIA_TYPE_AUDIO = 1;
    public static final int AVMEDIA_TYPE_VIDEO = 0;
    public static final int VIDEO_TYPE_H264 = 0;
    public static final int VIDEO_TYPE_H265 = 1;
    private long ctx;

    public native void close();

    public native int create(String str, int i, int i2, int i3, byte[] bArr, int i4, int i5);

    public native int writeFrame(int i, byte[] bArr, int i2, int i3, long j);

    static {
        System.loadLibrary("proffmpeg");
        System.loadLibrary("VideoCodecer");
    }
}
