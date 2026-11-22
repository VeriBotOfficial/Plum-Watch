package com.wakeup.lame;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;

/* compiled from: NativeLib.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0086 J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086 JA\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086 J1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086 J\t\u0010\u0014\u001a\u00020\bH\u0086 ¨\u0006\u0015"}, d2 = {"Lcom/wakeup/lame/NativeLib;", "", "<init>", "()V", "stringFromJNI", "", MobileAdsBridge.versionMethodName, "convert", "", "wavFilePath", "mp3FilePath", "sampleRate", "", "channels", "bitRate", "title", "", "artist", "pcmToMp3JNI", "pcmFilePath", "pcmToMp3JNIDestroy", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeLib {
    public static final NativeLib INSTANCE = new NativeLib();

    public final native void convert(String wavFilePath, String mp3FilePath, int sampleRate, int channels, int bitRate, byte[] title, byte[] artist);

    public final native String getVersion();

    public final native int pcmToMp3JNI(String pcmFilePath, String mp3FilePath, int sampleRate, int channels, int bitRate);

    public final native void pcmToMp3JNIDestroy();

    public final native String stringFromJNI();

    private NativeLib() {
    }

    static {
        System.loadLibrary("lame_lib");
    }
}
