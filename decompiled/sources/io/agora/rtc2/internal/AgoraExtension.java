package io.agora.rtc2.internal;

/* loaded from: classes6.dex */
public class AgoraExtension {
    private long nativeProvider;
    private String vendor;

    public AgoraExtension(String vendor, long nativeProvider) {
        this.vendor = vendor;
        this.nativeProvider = nativeProvider;
    }

    public long getNativeProvider() {
        return this.nativeProvider;
    }

    public String getVendor() {
        return this.vendor;
    }
}
