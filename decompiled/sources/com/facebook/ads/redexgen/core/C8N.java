package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public interface C8N {
    void A51(C2905or c2905or, int i, int[] iArr) throws C8G;

    void A5r();

    void A6E();

    void A6L();

    long A7X(boolean z);

    C2889ob A8e();

    boolean A9W(ByteBuffer byteBuffer, long j, int i) throws C8H, C8M;

    void A9Z();

    boolean A9g();

    boolean AAG();

    void AGG();

    void AGI() throws C8M;

    void AIW(C2911oy c2911oy);

    void AIX(int i);

    void AIY(C1P c1p);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIg(boolean z);

    void AIl(C8J c8j);

    void AIt(C2889ob c2889ob);

    void AIw(C13077m c13077m);

    void AIy(AudioDeviceInfo audioDeviceInfo);

    void AJ4(boolean z);

    boolean AJc(C2905or c2905or);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJe(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
